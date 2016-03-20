<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>项目财务管理</title>
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
					<li class="active"><a href="#"><i class="fa fa-money"></i>项目财务管理</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>财务管理</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-list-alt"></i>财务管理
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>
			<div class="panel-body">
				<div class="bk-bg-white row">
					<form>
						<div class="col-md-3 form-group col-md-offset-4">
							<input type="text" class="form-control" placeholder="请输入合同编号" />
						</div>
						<div class="col-md-3">
							<button type="button" class="btn btn-primary">
								<i class="fa fa-search"></i> 查找
							</button>
						</div>
					</form>
				</div>
				<div class="table-responsive">
					<table
						class="table table-striped table-bordered bootstrap-datatable datatable ">
						<thead>
							<tr>
								<th>立项时间</th>
								<th>合同编号</th>
								<th>标题</th>
								<th>财务项目负责人</th>
								<th>状态</th>
								<th>捐赠协议</th>
								<th>资金明细</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${projectList }" var="p">
								<tr>
									<td><fmt:formatDate value="${p.setupTime }"
											pattern="yyyy-MM-dd" /></td>
									<td>${p.projectNum }</td>
									<td>${p.projectName }</td>
									<td>${p.donationMode.fundPrincipal }</td>
									<td><c:choose>
											<c:when test="${p.moneyCheck.moneystate eq 0}">
												<span class="label label-danger">未到款</span>
											</c:when>
											<c:when test="${p.moneyCheck.moneystate eq 1}">
												<span class="label label-warning">部分到款</span>
											</c:when>
											<c:when test="${p.moneyCheck.moneystate eq 2}">
												<span class="label label-success">完全到款</span>
											</c:when>
											<c:when test="${p.moneyCheck.moneystate eq 3}">
												<span class="label label-info">超额到款</span>
											</c:when>
											<c:otherwise>
												<span class="label label-danger">其他</span>
											</c:otherwise>
										</c:choose></td>
									<td><a class="btn btn-primary fa fa-download"
										href="<c:url value='/download/downloadFile.action?filesId=${p.protocol.fileId }'/>">下载</a></td>
									<td><a class="btn btn-info fa fa-eye"
										href="<c:url value='/fundAdmin/checkFundDetails.action?projectId=${p.projectId }'/>">查看</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="row myPage">
					<imaw:page url="${pageContext.request.contextPath }/fundAdmin/toFundMana.action" />
				</div>
			</div>
		</div>

	</div>
</body>
</html>