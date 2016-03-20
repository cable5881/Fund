<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>申请功能</title>
<jsp:include page="../Model.jsp"></jsp:include>
<script type="text/javascript" src="/Fund/assets/js/pages/applyFunction.js"></script>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><a href="${pageContext.request.contextPath}/student/applyScholarshipFunction.action"><i class="fa fa-pencil"></i>申请功能</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>申请功能</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-paperclip"></i>可申请项目
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="bk-bg-white row text-center form-group">
					<div class="btn-group">
						<button type="button" class="btn btn-primary scholarship-button">奖学金</button>
						<button type="button" class="btn btn-default stipend-button">助学金</button>
					</div>
				</div>
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center scholarship-table "
							>
							<thead>
								<tr>
									<th>日期</th>
									<th>项目名</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${scholarship }" var="scholarshipCustom" varStatus="status">
								<tr>
									<td><fmt:formatDate value="${scholarshipCustom.startDate }" pattern="yyyy-MM-dd"/></td>
									<td>${scholarshipCustom.project.projectName }</td>
									<td >
										<c:choose>
											<c:when test="${scholarshipCustom.judgeState eq 1 }">
												<span class="btn-sm btn-warning">正在报名</span>
											</c:when>
											<c:when test="${scholarshipCustom.judgeState eq 2 }">
												<span class="btn-sm btn-success">报名结束</span>
											</c:when>
											<c:otherwise>
												<span class="btn-sm btn-danger">其他</span>
											</c:otherwise>
										</c:choose>
									</td>
									<td >
										<c:choose>
											<c:when test="${scholarshipCustom.judgeState eq 1 }">
												<a href="${pageContext.request.contextPath}/student/ApplicationForm.action?projectId=${scholarshipCustom.project.projectId}"><button class="btn btn-info fa fa-pencil">申请</button></a>
											</c:when>
											<c:when test="${scholarshipCustom.judgeState eq 2 }">
												<a href="${pageContext.request.contextPath}/student/ApplicationForm.action"><button disabled="disabled" class="btn btn-info fa fa-pencil">申请</button></a>
											</c:when>
											<c:otherwise>
												<a href="${pageContext.request.contextPath}/student/ApplicationForm.action"><button disabled="disabled" class="btn btn-info fa fa-pencil">申请</button></a>
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
						
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center stipend-table "
							>
							<thead>
								<tr>
									<th>日期</th>
									<th>项目名</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${stipend }" var="stipendCustom" varStatus="status">
								<tr>
									<td><fmt:formatDate value="${stipendCustom.startDate }" pattern="yyyy-MM-dd"/></td>
									<td>${stipendCustom.project.projectName }</td>
									<td >
										<c:choose>
											<c:when test="${stipendCustom.judgeState eq 0 }">
												<span class="btn-sm btn-warning">正在报名</span>
											</c:when>
											<c:when test="${stipendCustom.judgeState eq 1 }">
												<span class="btn-sm btn-success">报名结束</span>
											</c:when>
											<c:otherwise>
												<span class="btn-sm btn-danger">其他</span>
											</c:otherwise>
										</c:choose>
									</td>
									<td >
										<c:choose>
											<c:when test="${stipendCustom.judgeState eq 0 }">
												<a href="${pageContext.request.contextPath}/student/ApplicationForm.action?projectId=${stipendCustom.project.projectId}"><button class="btn btn-info fa fa-pencil">申请</button></a>
											</c:when>
											<c:when test="${stipendCustom.judgeState eq 1 }">
												<a href="${pageContext.request.contextPath}/student/ApplicationForm.action"><button disabled="disabled" class="btn btn-info fa fa-pencil">申请</button></a>
											</c:when>
											<c:otherwise>
												<a href="${pageContext.request.contextPath}/student/ApplicationForm.action"><button disabled="disabled" class="btn btn-info fa fa-pencil">申请</button></a>
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row col-md-8 col-md-offset-2">
					<div
						class="btn-group bk-margin-bottom-10 bk-margin-top-10 pull-right">
						<button class="btn btn-sm btn-default">1</button>
						<button class="btn btn-sm btn-default">
							<span class="fa fa-chevron-left"></span>
						</button>
						<button class="btn btn-sm btn-default" style="color: red">3</button>
						<button class="btn btn-sm btn-default">
							<span class="fa fa-chevron-right"></span>
						</button>
						<button class="btn btn-sm btn-default">10</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>