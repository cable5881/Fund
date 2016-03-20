<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有申请表</title>
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
					<li class="active"><a href="#"><i class="fa fa-list"></i>所有申请表</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>所有申请表</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-list"></i>所有申请表
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="row text-center">
					<h4 style="font-weight: bold;">${p.projectName }</h4>
				</div>
				<div class="bk-bg-white row text-center">
					<div class="btn-group">
						<c:choose>
							<c:when test="${empty verified || verified == 0 }">
								<a href="<c:url value='/benificiary/examineBonusApps.action?projectId=${p.projectId }&verified=0'/>"><button type="button" class="btn btn-primary">未审核</button></a>
								<a href="<c:url value='/benificiary/examineBonusApps.action?projectId=${p.projectId }&verified=1'/>"><button type="button" class="btn btn-default">已审核</button></a>
							</c:when>
							<c:otherwise>
								<a href="<c:url value='/benificiary/examineBonusApps.action?projectId=${p.projectId }&verified=0'/>"><button type="button" class="btn btn-default">未审核</button></a>
								<a href="<c:url value='/benificiary/examineBonusApps.action?projectId=${p.projectId }&verified=1'/>"><button type="button" class="btn btn-primary">已审核</button></a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table class="table table-striped table-bordered bootstrap-datatable datatable text-center">
							<thead>
								<tr>
									<th>序号</th>
									<th>学院</th>
									<th>班级</th>
									<th>姓名</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${bonusAppList }" var="app" varStatus="status">
									<c:choose>
										<c:when test="${p.fundtypeId eq 1 }">
										<tr>
											<td>申请表${status.index + 1 }</td>
											<td>${app.scIndivInfo.institute }</td>
											<td>${app.scIndivInfo.classes }</td>
											<td>${app.scIndivInfo.scName }</td>
											<td>
												<c:choose>
													<c:when test="${empty verified || verified == 0  }">
														<label class="label label-warning">未审核</label>
													</c:when>
													<c:otherwise>
														<c:choose>
															<c:when test="${app.isPassed eq 1 }">
																<label class="label label-success">审核通过</label>
															</c:when>
															<c:when test="${app.isPassed eq 2 }">
																<label class="label label-danger">审核失败</label>
															</c:when>
															<c:otherwise>
																<label class="label label-info">其他</label>
															</c:otherwise>
														</c:choose>
													</c:otherwise>
												</c:choose>
											</td>
											<td>
												<a href="<c:url value='/benificiary/toExamineBonusApp.action?appId=${app.scholarshipappId }'/>">
													<button class="btn btn-info fa fa-eye">审核</button>
												</a>
											</td>
										</tr>
									</c:when>
									
									<c:when test="${p.fundtypeId eq 2 }">
										<tr>
											<td>申请表${status.index + 1 }</td>
											<td>${app.stIndivInfo.institute }</td>
											<td>${app.stIndivInfo.classes }</td>
											<td>${app.stIndivInfo.stName }</td>
											<td>
												<c:choose>
													<c:when test="${empty verified || verified == 0  }">
														<label class="label label-warning">未审核</label>
													</c:when>
													<c:otherwise>
														<c:choose>
															<c:when test="${app.isPassed eq 1 }">
																<label class="label label-success">审核通过</label>
															</c:when>
															<c:when test="${app.isPassed eq 2 }">
																<label class="label label-danger">审核失败</label>
															</c:when>
															<c:otherwise>
																<label class="label label-info">其他</label>
															</c:otherwise>
														</c:choose>
													</c:otherwise>
												</c:choose>
											</td>
											<td>
												<a href="<c:url value='/benificiary/toExamineBonusApp.action?appId=${app.stipendappId}'/>">
													<button class="btn btn-info fa fa-eye">查看</button>
												</a>
											</td>
										</tr>
									</c:when>
									
									<c:otherwise>
										<!-- 老师的申请表  -->
									</c:otherwise>
									
									</c:choose>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row myPage">
					<c:choose>
						<c:when test="${empty verified || verified == 0 }">
							<imaw:page url="${pageContext.request.contextPath }/benificiary/examineBonusApps.action?projectId=${p.projectId }&verified=0"/>
						</c:when>
						<c:otherwise>
							<imaw:page url="${pageContext.request.contextPath }/proAdmin/examineBonusApps.action?projectId=${p.projectId }&verified=1"/>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
</body>
</html>