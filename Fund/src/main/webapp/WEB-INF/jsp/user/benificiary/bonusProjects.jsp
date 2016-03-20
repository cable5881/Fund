<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>审核操作</title>
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
					<li class="active"><a href="#"><i class="fa fa-eraser"></i>审核操作</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>审核操作</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-eraser"></i>审核操作
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="bk-bg-white">
					<form>
						<div class="col-md-3 form-group col-md-offset-4">
							<input type="text" class="form-control" placeholder="请输入合同编号" />
						</div>
						<div>
							<div class="col-md-3">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-search"></i> 查找
								</button>
							</div>
						</div>
					</form>
				</div>
				<div class="table-responsive">
					<table
						class="table table-striped table-bordered bootstrap-datatable datatable text-center">
						<thead>
							<tr>
								<th class="text-center">日期</th>
								<th class="text-center">合同编号</th>
								<th class="text-center">标题</th>
								<th class="text-center">状态</th>
								<th class="text-center">评审</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${projectList }" var="p" >
								<tr>
									<td><fmt:formatDate value="${p.bonusNotice.startDate }" pattern="yyyy-MM-dd"/></td>
									<td>${p.projectNum }</td>
									<td>${p.projectName }</td>
									<td>
										<c:choose>
											<c:when test="${p.bonusNotice.judgeState eq 1 }"><span class="label label-success">正在报名</span></c:when>
											<c:when test="${p.bonusNotice.judgeState eq 2 }"><span class="label label-danger">结束报名</span></c:when>
											<c:otherwise><span class="label label-warning">其他</span></c:otherwise>
										</c:choose>
									</td>
									<td><a href="<c:url value='/benificiary/examineBonusApps.action?projectId=${p.projectId}'/>"><button class="btn btn-primary fa fa-pencil">审核申请表</button></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>
		</div>
		
		<div class="row myPage">
			<imaw:page url="${pageContext.request.contextPath }/bonusProjects.action"/>
		</div>
		
	</div>

</body>
</html>