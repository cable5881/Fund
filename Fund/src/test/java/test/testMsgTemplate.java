package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.junit.Test;
import static java.lang.System.out;
import com.fund.po.Message;
import com.fund.po.Project;
import com.fund.utils.DateUtil;

public class testMsgTemplate {
	
	private String defaultTemplate = "/msgTemplates.properties";
	
	public testMsgTemplate(){
		
	}
	
	public testMsgTemplate(String template){
		this.defaultTemplate = template;
	}

	public Properties GetProperty() throws IOException{
		InputStream in = this.getClass().getResourceAsStream(defaultTemplate);
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));  
		Properties p = new Properties();
		p.load(bf);
		in.close();
		bf.close();
		return p;
	}
	
	public String getValue(String key,String... arguments) throws IOException{
		Properties p = GetProperty();
		String msg = p.getProperty(key);
		Object[] objs = (Object[])arguments;
		String m = MessageFormat.format(msg, objs);
		return m;
	}
	
	
	public String getTitle(String titleTemplate,String projectName) throws IOException{
		return getValue(titleTemplate, projectName);
	}
	
	public String getTitle(String titleTemplate,String... arguments) throws IOException{
		return getValue(titleTemplate, arguments);
	}
	
	public String getContent(Project project)throws IOException{
		return getValue("msg.content.project.info", project.getProjectName(),project.getProjectNum(),project.getLeader(),project.getSetupTime().toLocaleString());
	}
	
	public String getContent(String contentTemplate,String... arguments) throws IOException{
		return getValue(contentTemplate,arguments); 
	}
	
	@Test
	public void testGetProperty() throws Exception{
		Properties p = GetProperty();
		String msg = p.getProperty("msg.title.newsUrl.examine.success");
		String m = MessageFormat.format(msg, "武汉丽泽基金");
		System.out.println(m);
	}
	
	@Test
	public void testGetTitle() throws Exception{
		out.println(getValue("msg.title.newsUrl.examine.success", "哈哈基金"));
	}
	
	@Test
	public void testInsertMessage()throws Exception{
//		message
	}
	
	@Test
	public void testEnter()throws Exception{
		String lineSeparator = System.getProperty("line.separator", "\n");
		out.print("我是你妈妈,"+lineSeparator+"我是你爸爸ddd");
	}
	
	@Test
	public void test2() throws Exception{
		Message msg = new Message();
		msg.setReceivedTime(new Date());
		msg.setUserId(2);
		msg.setMsgTitle(getValue("msg.title.projectForm.examine.success", "你妈妈咪基金"));
//		msg.setMsgContent(formatProject());
		
	}
	
	@Test
	public void testTimeFormat(){
		try {
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);
			out.println(formatter.format( new Date() ));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTimeFormat2(){
		try {
			out.println(DateUtil.dateToAllTime(new Date()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Message getMessage(Integer userId,String msgTemplate,Project project) throws IOException,Exception{
		Message msg = new Message();
		msg.setUserId(userId);
		msg.setMsgTitle( getTitle(msgTemplate, project.getProjectName()) );
		msg.setMsgContent( getContent(project) );
		return msg;
	}
	
	public static void main(String[] args){
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		out.println(dateString);
	}
	
}
