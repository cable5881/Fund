<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新闻链接</title>
<jsp:include page="../Model.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><i class="fa fa-eraser"></i>审核操作</li>
					<li class="active"><a href="#"><i class="fa fa-table"></i>审核新闻链接</a></li>
					<li class="active"><a href="#"><i class="fa fa-list-alt"></i>新闻链接</a></li>
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
					<i class="fa fa-list-alt"></i>新闻链接
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="bk-bg-white row text-center">
					<div class="btn-group">
						<c:choose>
							<c:when test="${verified == 0 }">
								<a href="<c:url value='/proAdmin/toExamineUrl.action?verified=0&projectId=${projectId }'/>"><button type="button" class="btn btn-primary">未审核</button></a>
								<a href="<c:url value='/proAdmin/toExamineUrl.action?verified=1&projectId=${projectId }'/>"><button type="button" class="btn btn-default">已审核</button></a>
							</c:when>
							<c:otherwise>
								<a href="<c:url value='/proAdmin/toExamineUrl.action?verified=0&projectId=${projectId }'/>"><button type="button" class="btn btn-default">未审核</button></a>
								<a href="<c:url value='/proAdmin/toExamineUrl.action?verified=1&projectId=${projectId }'/>"><button type="button" class="btn btn-primary">已审核</button></a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div class="row">
					<div class="table-responsive col-md-12">
						<c:choose>
							<c:when test="${verified == null ||  verified == 0 }">
								<table class="table table-striped table-bordered bootstrap-datatable datatable text-center unverified-table">
									<thead>
										<tr>
											<th class="text-center">上传日期</th>
											<th class="text-center">链接地址</th>
											<th class="text-center">类型</th>
											<th class="text-center">状态</th>
											<th class="text-center">审核</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${newsUrlList }" var="news">
											<tr>
												<td><fmt:formatDate value="${news.uploadTime }" /></td>
												<td><div class="tableUrl"><a href="${news.launchUrl }" target="_blank">${news.launchUrl }</a></div></td>
												<td>${news.newsType.typeName }</td>
												<td><label class="label label-warning">未审核</label></td>
												<td><button type="button" class="btn btn-success fa fa-check"
													onclick="examineNewsUrl(${news.newsurlId},1)">审核通过</button>
													<button type="button" class="btn btn-danger fa fa-times"
													onclick="examineNewsUrl(${news.newsurlId},2)">审核无效</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</c:when>
							<c:otherwise>
								<table
									class="table table-striped table-bordered bootstrap-datatable datatable text-center verified-table">
									<thead>
										<tr>
											<th class="text-center">上传日期</th>
											<th class="text-center">链接地址</th>
											<th class="text-center">类型</th>
											<th class="text-center">状态</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${newsUrlList }" var="news">
											<tr>
												<td><fmt:formatDate value="${news.uploadTime }" /></td>
												<td><div class="tableUrl"><a href="${news.launchUrl }" target="_blank">${news.launchUrl }</a></div></td>
												<td>${news.newsType.typeName }</td>
												<td><c:choose>
														<c:when test="${news.isPassed eq 1 }">
															<label class="label label-success">通过</label>
														</c:when>
														<c:when test="${news.isPassed eq 2 }">
															<label class="label label-danger">无效</label>
														</c:when>
														<c:otherwise>
															<label class="label label-warning">其他</label>
														</c:otherwise>
													</c:choose></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div class="row myPage">
					<c:choose>
						<c:when test="${verified == 0 }">
							<imaw:page url="${pageContext.request.contextPath }/proAdmin/toExamineUrl.action?verified=0&projectId=${projectId }"/>
						</c:when>
						<c:otherwise>
							<imaw:page url="${pageContext.request.contextPath }/proAdmin/toExamineUrl.action?verified=1&projectId=${projectId }"/>
						</c:otherwise>
					</c:choose>
					
				</div>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
	function examineNewsUrl(newsUrlId,isPassed){
		var flag = false;
		if(isPassed==1)
		{
			flag = confirm("您确定要通过此新闻链接?");
		}
		else if(isPassed==2)
		{
			flag = confirm("您确定要否决此新闻链接?");
		}
		
		if(flag){
			$.ajax({
	             type: "POST",
	             url: "${pageContext.request.contextPath}/proAdmin/examineNewsUrl.action",
	             data: 'isPassed=' + isPassed + "&newsUrlId=" + newsUrlId,
	             dataType: "json",
	             success: function(result){
	            	 if(result.resultCode == 1){
	            		 alert('审核新闻链接成功！');
	            		 history.go(0);
	            	 }else if(result.resultCode == 0){
	            		 alert("审核新闻链接失败！");
	            	 }
	             }
	         });
		}
	}
</script>	
</body>
</html>