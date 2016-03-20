<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>资金详细信息</title>
<jsp:include page="../Model.jsp"></jsp:include>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/zebra_datepicker/css/metallic.css" type="text/css">
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<input type="hidden" name="contextPath" value="${pageContext.request.contextPath}"/>
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><a href="#"><i class="fa fa-money"></i>项目财务管理</a></li>
					<li class="active"><a href="#"><i class="fa fa-files-o"></i>资金详细信息</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>资金详细信息</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
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
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
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
										<td><a class="btn btn-info fa fa-eye" href="${pageContext.request.contextPath }/fundAdmin/checkInBill.action?mCheckId=${p.moneyCheck.moneycheckId}"> 查看</a></td>
									</tr>
									<tr>
										<td>资金发放详情</td>
										<td><a class="btn btn-info fa fa-eye" href="${pageContext.request.contextPath }/fundAdmin/checkOutBill.action?mCheckId=${p.moneyCheck.moneycheckId}"> 查看</a></td>
									</tr>
								</tbody>
							</table>
						</div>

						<div>
							<div class="col-md-6" style="text-align: center">
								<button type="button" class="btn btn-warning btn-settingIn">到款</button>
							</div>
							<div class=" col-md-6" style="text-align: center">
								<button type="button" class="btn btn-danger btn-settingOut"
									onclick="changeMode()">发放</button>
							</div>
						</div>

					</div>
				</div>
			</div>


		</div>

		<!-- Modal Dialog -->
		<div class="modal fade" id="myModalIn">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close close-button"
							data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title bk-fg-primary">资金到款</h4>
					</div>
					<div class="modal-body">
						<form id="inbillForm" class="form-horizontal ">
							<div class="row form-group">
								<label class="col-md-3 control-label">日期</label>
								<div class="col-md-6">
									<input type="text" id="date" name="date"
										class="form-control date" placeholder="必填">
								</div>
							</div>
							<div class="row form-group">
								<label class="col-md-3 control-label">财务项目编号</label>
								<div class="col-md-6">
									<input type="text" name="moneyNum"
										class="form-control text-financeNum-check text-financeNum-land"
										placeholder="格式为“123-456789”"> <span
										class="help-block span-financeNum-land" style="color: red"></span>
								</div>
							</div>
							<div class="row form-group">
								<label class="col-md-3 control-label">付款单位</label>
								<div class="col-md-6">
									<input type="text" name="payer"
										class="form-control text-payUnit-check text-payUnit-land"
										placeholder="必填"> <span
										class="help-block span-payUnit-land" style="color: red"></span>
								</div>
							</div>
							<div class="row form-group">
								<label class="col-md-3 control-label" for="text2">金额</label>
								<div class="col-md-6">
									<input type="text" id="text2" name="amount"
										class="form-control  text-getMoney-check text-getMoney-land"
										placeholder="必填"> <span
										class="help-block span-getMoney-land" style="color: red"></span>
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button"
							class="btn btn-success close-button buttonIn"
							data-dismiss="modal" onclick="addBill(1,${p.projectId})">
							<i class="fa fa-check-circle">提交</i>
						</button>
					</div>
				</div>
			</div>
		</div>
		<!-- End Modal Dialog -->

		<!-- Modal Dialog -->
		<div class="modal fade" id="myModalOut">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close close-button"
							data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title bk-fg-primary">资金发放</h4>
					</div>
					<div class="modal-body">
						<form id="outbillForm" method="post" class="form-horizontal ">
							<div class="row form-group">
								<label class="col-md-3 control-label">日期</label>
								<div class="col-md-6">
									<input type="text" name="date" class="form-control date" placeholder="必填">
								</div>
							</div>
							<div class="row form-group">
								<label class="col-md-3 control-label">金额</label>
								<div class="col-md-6">
									<input type="text" name="amount"
										class="form-control  text-payMoney-check text-payMoney-land"
										placeholder="必填"> <span
										class="help-block span-payMoney-land" style="color: red"></span>
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button"
							class="btn btn-success close-button buttonOut"
							data-dismiss="modal" onclick="addBill(0,${p.projectId})">
							<i class="fa fa-check-circle">提交</i>
						</button>
					</div>
				</div>
			</div>
		</div>
		<!-- End Modal Dialog -->

	</div>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/zebra_datepicker/js/zebra_datepicker.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/pages/financeDetails.js"></script>
	<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/pages/submitFinanceDetail.js"></script> --%>
	<script type="text/javascript">
		function addBill(mode,projectId){
			var params;
			if(mode==1){
				params = $("#inbillForm").serialize();
			}else{
				params = $("#outbillForm").serialize();
			}
			$.ajax({
	             type: "POST",
	             url: "${pageContext.request.contextPath}/fundAdmin/addBill.action",
	             data: params + "&mode=" + mode + "&projectId=" + projectId,
	             dataType: "json",
	             success: function(result){
	            	 if(result.resultCode == 1){
	            		 if(mode==1){
	            			 alert("到款成功！")
	            		 }else{
	            			 alert("发放成功！")
	            		 }
	            		 history.go(0);
	            	 }else if(result.resultCode == 0){
	            		 if(mode==1){
	            			 alert("到款失败！")
	            		 }else{
	            			 alert("发放失败！")
	            		 }
	            	 }else{
	            		 alert(result.resultMessage);
	            	 }
	             }
	         });
		}
	</script>
</body>
</html>