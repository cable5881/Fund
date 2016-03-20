<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.imaw.org/tags" prefix="imaw" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新闻链接</title>
<jsp:include page="../Model.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><a href="#"><i class="fa fa-folder"></i>立项管理</a></li>
					<li class="active"><a href="#"><i
							class="fa fa-file-text-o"></i>奖学金项目信息</a></li>
					<li class="active"><a href="#"><i class="fa fa-table"></i>新闻链接</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>新闻链接</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-table"></i>新闻链接
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="table-responsive">
					<table
						class="table table-striped table-bordered bootstrap-datatable datatable ">
						<thead>
							<tr>
								<th>时间</th>
								<th>新闻标题</th>
								<th>新闻类型</th>
								<th>链接地址</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${newsUrlList }" var="news">
							<tr>
								<td><fmt:formatDate value="${news.uploadTime }" pattern="yyyy-MM-dd"/></td>
								<td>${news.newsTitle }</td>
								<td>${news.newsType.typeName }</td>
								<td><div  class="tableUrl"><a href="${news.launchUrl }" target="_blank">${news.launchUrl }</a></div></td>
								<td>
									<button type="button" class="btn btn-danger fa fa-trash-o " title="删除" onclick="deleteNewsLink(${news.newsurlId})"></button>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
				
				<div class="row myPage">
					<imaw:page url="${pageContext.request.contextPath }/benificiary/newsLink.action"/>
				</div>
			</div>
		</div>
	</div>
 
	<script type="text/javascript">
		function deleteNewsLink(newsurlId){
			var flag = confirm('您确定要删除此链接吗？');
			if(flag){
				$.ajax({
		             type: "POST",
		             url: "${pageContext.request.contextPath}/benificiary/deleteNewsLink.action",
		             data: 'newsurlId=' + newsurlId,
		             dataType: "json",
		             success: function(data){
		            	 if(data.resultCode == 1){
		            		 history.go(0);
		            	 }else if(data.resultCode == 0){
		            		 alert(data.resultMessage);
		            	 }
		             }
		         });
			}
		}
	</script>
	
</body>
</html>