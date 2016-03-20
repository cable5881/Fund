<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>审核立项</title>
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
					<li class="active"><a href="#"><i class="fa fa-eraser"></i>审核立项</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>审核立项</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-eraser"></i>审核立项
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="bk-bg-white row text-center">
					<div class="btn-group">
						<c:choose>
							<c:when test="${empty verified || verified == 0 }">
								<a href="<c:url value='/proExpand/allProjects.action?verified=0'/>"><button type="button" class="btn btn-primary">未审核</button></a>
								<a href="<c:url value='/proExpand/allProjects.action?verified=1'/>"><button type="button" class="btn btn-default">已审核</button></a>
							</c:when>
							<c:otherwise>
								<a href="<c:url value='/proExpand/allProjects.action?verified=0'/>"><button type="button" class="btn btn-default">未审核</button></a>
								<a href="<c:url value='/proExpand/allProjects.action?verified=1'/>"><button type="button" class="btn btn-primary">已审核</button></a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				
				<div class="row">
					<div class="table-responsive col-md-12">
						<c:choose>
							<c:when test="${verified==null || verified==0 }">
								<table class="table table-striped table-bordered bootstrap-datatable datatable text-center unverified-table">
									<thead>
										<tr>
											<th class="text-center">立项日期</th>
											<th class="text-center">立项单位</th>
											<th class="text-center">合同编号</th>
											<th class="text-center">标题</th>
											<th class="text-center">状态</th>
											<th class="text-center">操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${projectList}" var="p">
											<tr>
												<td><fmt:formatDate value="${p.setupTime }" pattern="yyyy-MM-dd"/></td>
												<td>${p.benificiaryunit }</td>
												<td>${p.projectNum }</td>
												<td>${p.projectName }</td>
												<td><label class="label label-warning">未审核</label></td>
												<td>
												<a href="<c:url value='/download/downloadFile?filesId=${p.appformId }'/>"><button class="btn btn-primary fa fa-download" title="下载"></button></a>
												<a href="<c:url value='/proExpand/toExamineProject.action?projectId=${p.projectId}'/>"><button class="btn btn-danger fa fa-edit (alias)" title="审核"></button></a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</c:when>
							
							<c:otherwise>
								<table class="table table-striped table-bordered bootstrap-datatable datatable text-center verified-table">
									<thead>
										<tr>
											<th class="text-center">立项日期</th>
											<th class="text-center">立项单位</th>
											<th class="text-center">合同编号</th>
											<th class="text-center">标题</th>
											<th class="text-center">状态</th>
											<th class="text-center">操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${projectList}" var="p">
											<tr>
												<td><fmt:formatDate value="${p.setupTime }" pattern="yyyy-MM-dd"/></td>
												<td>${p.benificiaryunit }</td>
												<td>${p.projectNum }</td>
												<td>${p.projectName }</td>
												<td>
													<c:choose>
														<c:when test="${p.isPassed eq 2 }"><label class="label label-success">通过</label></c:when>
														<c:when test="${p.isPassed eq 3 }"><label class="label label-danger">无效</label></c:when>
													</c:choose>
												</td>
												<td>
												<a href="<c:url value='/download/downloadFile?filesId=${p.appformId }'/>"><button class="btn btn-primary fa fa-download" title="下载"></button></a>
												<a href="<c:url value='/proExpand/toModifyProjectNum.aciton?projectId=${p.projectId }'/>"><button class="btn btn-danger fa fa-pencil" title="修改合同编号"></button></a></td>
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
						<c:when test="${empty verified || verified == 0 }">
							<imaw:page url="${pageContext.request.contextPath }/proExpand/allProjects.action?verified=0"/>
						</c:when>
						<c:otherwise>
							<imaw:page url="${pageContext.request.contextPath }/proExpand/allProjects.action?verified=1"/>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>

</body>
</html>