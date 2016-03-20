package com.fund.tags;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.log4j.Logger;
import com.fund.utils.Page;


/**
 * 
 * @Description:分页标签，用在jsp上作为分页的标签控件
 * @author:JackBauer
 * @date:2015年9月16日 上午11:01:10
 */
public class PageTag extends SimpleTagSupport{
	
	private String url;//点击页数后跳转地址
	
	private Logger logger = Logger.getLogger(getClass());

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		if(url.contains("?")){//地址后面可能接有参数
			this.url = url + "&pageNow=";
		}else{
			this.url = url + "?pageNow=";
		}
		
	}

	@Override
	public void doTag() throws JspException, IOException {
		try {
			PageContext pc = (PageContext) this.getJspContext();
			HttpServletRequest request = (HttpServletRequest) pc.getRequest();
			Page page = (Page) request.getAttribute("page");
			
			int pageNow = page.getPageNow();//当前页
			int pageButtonCount = page.getPageButtonCount();//页面上显示的分页按钮数
			int totalPageCount = page.getTotalPageCount();//总分页数
			
			if(totalPageCount!=0){//如果只有0页，那么就不显示分页控件了
				StringBuilder sb = new StringBuilder();
				sb.append("<nav><ul class=\"pagination\">");
				sb.append("<li><a href=\""+url+1+"\">首页</a></li>");
				
				if(pageNow > 1)//如果当前页大于第一页，那么返回上一页
				{
					sb.append("<li><a href=\""+url+(pageNow-1)+"\">上一页</a></li>");
				}
				else//否则就是第一页,即首页
				{
					sb.append("<li><a href=\""+url+1+"\">上一页</a></li>");
				}
	
				
				if(totalPageCount <= pageButtonCount)//如果总页数不大于5页那么有多少页就显示显示多少个分页按钮
				{
					for(int i = 1;i <= totalPageCount;i++){
						if(i==pageNow){
							sb.append("<li class=\"active\"><a href=\""+url+i+"\">"+i+"</a></li>");//当前页是选中状态，需要添加一个class
						}else{
							sb.append("<li><a href=\""+url+i+"\">"+i+"</a></li>");
						}	
					}
				}
				else//否则默认显示5页
				{
					int pageBase = (pageNow-1)/5*5;
					for(int i = 1;i <= pageButtonCount;i++){
						int pageNum = pageBase + i;//重新计算的5个页码之一
						if(pageNum<=totalPageCount)
						{
							sb.append("<li"+(pageNum==pageNow?" class=\"active\"":"")+"><a href=\""+url+pageNum+"\">"+pageNum+"</a></li>");
						}else break;
					}
				}
				
				if(pageNow + 1 < totalPageCount)//如果还未达到最后一页，即总页数，则显示下一页
				{
					sb.append("<li><a href=\""+url+(pageNow + 1)+"\">下一页</a></li>");
				}
				else if(pageNow + 1 >= totalPageCount)//否则显示最后一页
				{
					sb.append("<li><a href=\""+url+totalPageCount+"\">下一页</a></li>");
				}
				
				sb.append("<li><a href=\""+url+totalPageCount+"\">尾页</a></li>");
				sb.append("</ul></nav>");
				
				pc.getResponse().setCharacterEncoding("utf-8");
				
				pc.getOut().write(sb.toString());
			}
			
		} catch (Exception e) {
			logger.error("Page Exception!", e);
		}
	}
	
}
