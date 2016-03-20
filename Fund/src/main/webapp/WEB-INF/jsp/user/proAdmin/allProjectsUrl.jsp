<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>审核新闻链接</title>
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
				</ol>
			</div>
			<div class="pull-right">
				<h2>审核新闻链接</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-table"></i>审核新闻链接
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center unverified-table">
							<thead>
								<tr>
									<th class="text-center">立项日期</th>
									<th class="text-center">合同编号</th>
									<th class="text-center">标题</th>
									<th class="text-center">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${projectList }" var="p">
									<tr>
										<td><fmt:formatDate value="${p.setupTime }" pattern="yyyy-MM-dd"/></td>
										<td>${p.projectNum }</td>
										<td>${p.projectName }</td>
										<td><a class="btn btn-primary" href="<c:url value='/proAdmin/toExamineUrl.action?projectId=${p.projectId }'/>">审核新闻链接</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row myPage">
					<imaw:page url="${pageContext.request.contextPath }/proAdmin/allProjectsUrl.action"/>
				</div>
			</div>
		</div>
	</div>

</body>
</html>