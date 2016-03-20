<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>项目信息</title>
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
					<li class="active"><a href="${pageContext.request.contextPath}/sysAdmin/projectManage.action"><i class="fa fa-folder"></i>立项管理</a></li>
					<li class="active"><a href="#"><i
							class="fa fa-file-text-o"></i>项目信息</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>项目信息</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="row">
			<div class="col-lg-6">
				<div class="panel">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>立项基本信息
						</h6>
						<div class="panel-actions">
							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>

					<div class="panel-body">


						<div class="table-responsive ">
							<table class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
								<tbody>
									<tr>
										<td>立项编号</td>
										<td>${p.projectNum }</td>

									</tr>
									<tr>
										<td>项目类型</td>
										<td>${p.projectType.projecttypeName }</td>
									</tr>
									<tr>
										<td>基金类型</td>
										<td>${p.fundType.fundName }</td>
									</tr>
									<tr>
										<td>立项名</td>
										<td>${p.projectName }</td>
									</tr>
									<tr>
										<td>立项时间</td>
										<td><fmt:formatDate value="${p.setupTime }" pattern="yyyy-MM-dd"/></td>
									</tr>
									<tr>
										<td>立项申请表审核状态</td>
										<c:choose>
										<c:when test="${p.isPassed eq 1 }">
										<td><span class="label label-warning">等待审核</span></td>
										</c:when>
										<c:when test="${p.isPassed eq 2 }">
										<td><span class="label label-success">审核通过</span></td>
										</c:when>
										<c:when test="${p.isPassed eq 3 }">
										<td><span class="label label-danger">审核未通过</span></td>
										</c:when>
										<c:otherwise>
										<td><span class="label label-danger">未知</span></td>
										</c:otherwise>
										</c:choose>
									</tr>
									<tr>
										<td>立项申请表</td>
										<td><a href="${pageContext.request.contextPath}/sysAdmin/projectApplicationForm.action?projectId=${p.projectId}"><button
													class="btn btn-info fa fa-eye">查看</button></a></td>
									</tr>
									<tr>
										<td>捐赠协议</td>
										<td>
											<a href="${pageContext.request.contextPath}/download/downloadProtocol.action"><button class="btn btn-primary fa fa-download">下载</button></a>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

			<div class="col-lg-6">
				<div class="panel">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>立项评审信息
						</h6>
						<div class="panel-actions">
							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body">
						<div class="table-responsive ">
							<table class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
								<tbody>
									<tr>
										<td>评审状态</td>
										<c:choose>
											<c:when test="${p.bonusNotice.judgeState eq 0 }">
												<td><span class="btn-sm btn-danger">尚未开始评审</span></td>
											</c:when>
											<c:when test="${p.bonusNotice.judgeState eq 1 }">
												<td><span class="btn-sm btn-warning">正在评审</span></td>
											</c:when>
											<c:when test="${p.bonusNotice.judgeState eq 2 }">
												<td><span class="btn-sm btn-success">评审结束</span></td>
											</c:when>
											<c:otherwise>
												<td><span class="btn-sm btn-danger">其他</span></td>
											</c:otherwise>
										</c:choose>
									</tr>
									<tr>
										<td>报名表</td>
										<td><a href="${pageContext.request.contextPath}/sysAdmin/allBonusAppForms.action">
											<button class="btn btn-info fa fa-eye">查看</button></a>
										</td>
									</tr>
									<tr>
										<td>感谢信</td>
										<td>
											<button class="btn btn-primary fa fa-download">下载</button>
										</td>
									</tr>
									<tr>
										<td>相关新闻链接</td>
										<td><a
											href="${pageContext.request.contextPath}/sysAdmin/newsLink.action">
												<button class="btn btn-info fa fa-eye">查看</button></a>
										</td>
									</tr>
									<tr>
										<td>其他相关文件</td>
										<td>
											<button class="btn btn-primary fa fa-download">下载</button>
										</td>
									</tr>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-6 ">
				<div class="panel">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>立项资金信息
						</h6>
						<div class="panel-actions">
							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body">
						<div class="table-responsive ">
							<table class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
								<tbody>
									<tr>
										<td class="col-md-6">总金额</td>
										<td><c:choose>
												<c:when test="${p.donationMode.isOnetime eq 1 }">
													<fmt:formatNumber groupingUsed="false"
														maxFractionDigits="2" value="${p.donationMode.amount }" />
												</c:when>
												<c:otherwise>
													<fmt:formatNumber groupingUsed="false"
														maxFractionDigits="2"
														value="${p.donationMode.amount * p.donationMode.span }" />
												</c:otherwise>
											</c:choose></td>
									</tr>
									<tr>
										<td>分期数</td>
										<td>${p.donationMode.span }</td>
									</tr>
									<tr>
										<td>每期发放金额</td>
										<td><fmt:formatNumber groupingUsed="false"
												maxFractionDigits="2" value="${p.donationMode.amount}" /></td>
									</tr>
									<tr>
										<td>已到款金额</td>
										<td><fmt:formatNumber groupingUsed="false"
												maxFractionDigits="2" value="${p.moneyCheck.moneyInCount }" />
										</td>
									</tr>
									<tr>
										<td>剩余未到款金额</td>
										<td><c:choose>
												<c:when test="${p.donationMode.isOnetime eq 1 }">
													<fmt:formatNumber groupingUsed="false"
														maxFractionDigits="2"
														value="${p.donationMode.amount - p.moneyCheck.moneyInCount}" />
												</c:when>
												<c:otherwise>
													<fmt:formatNumber groupingUsed="false"
														maxFractionDigits="2"
														value="${p.donationMode.amount * p.donationMode.span - p.moneyCheck.moneyInCount}" />
												</c:otherwise>
											</c:choose></td>
									</tr>
									<tr>
										<td>已发放金额</td>
										<td><fmt:formatNumber groupingUsed="false"
												maxFractionDigits="2" value="${p.moneyCheck.moneyOutCount }" />
										</td>
									</tr>
									<tr>
										<td>未发放金额</td>
										<td><fmt:formatNumber groupingUsed="false"
												maxFractionDigits="2"
												value="${p.moneyCheck.moneyInCount-p.moneyCheck.moneyOutCount }" />
										</td>
									</tr>
									<tr>
										<td>资金到款详情</td>
										<td><a class="btn btn-info fa fa-eye" href="${pageContext.request.contextPath }/sysAdmin/checkInBill.action?mCheckId=${p.moneyCheck.moneycheckId}"> 查看</a></td>
									</tr>
									<tr>
										<td>资金发放详情</td>
										<td><a class="btn btn-info fa fa-eye" href="${pageContext.request.contextPath }/sysAdmin/checkOutBill.action?mCheckId=${p.moneyCheck.moneycheckId}"> 查看</a></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>