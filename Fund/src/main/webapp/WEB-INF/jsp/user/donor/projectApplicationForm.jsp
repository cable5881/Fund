<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>立项申请表</title>
<jsp:include page="../Model.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><i class="fa fa-folder"></i>捐赠项目管理</li>
					<li class="active"><a href="#"><i
							class="fa fa-file-text-o"></i>项目信息</a></li>
					<li class="active"><a href="#"><i class="fa fa-file-text"></i>立项申请表</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>立项申请表</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="row">
			<div class="col-lg-6">
				<div class="panel">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>项目信息
						</h6>
						<div class="panel-actions">
							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>

					<div class="panel-body">
						<div class="form-horizontal">
							<div class="form-group">
								<label class="col-md-4 control-label" for="text1">捐赠项目名称</label>
								<div class="col-md-6">
									<label class="form-control">${p.projectName }</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="text2">项目负责人</label>
								<div class="col-md-6">
									<label class="form-control">${p.leader}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">捐赠类型</label>
								<div class="col-md-6">
									<c:choose>
										<c:when test="${p.donationMode.realEstate eq 1 }">
											<div class="radio-custom radio-inline">
												<input type="radio" checked="checked" disabled="disabled"> 
												<label for="inline-radio1">动本</label>
											</div>
										</c:when>
										<c:when test="${p.donationMode.realEstate eq 0 }">
											<div class="radio-custom radio-inline">
												<input type="radio" checked="checked" disabled="disabled"> 
												<label for="inline-radio1">不动本</label>
											</div>
										</c:when>
									</c:choose>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">捐赠内容</label>
								<div class="col-md-6">
									<c:choose>
										<c:when test="${p.donationMode.form eq 1 }">
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio3" checked="checked" disabled="disabled"> 
												<label for="inline-radio3">现金</label>
											</div>
										</c:when>
										<c:when test="${p.donationMode.form eq 2 }">
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio4" checked="checked" disabled="disabled"> 
												<label for="inline-radio4">支票</label>
											</div>
										</c:when>
										<c:when test="${p.donationMode.form eq 3 }">
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio5" checked="checked" disabled="disabled"> 
												<label for="inline-radio5">汇票</label>
											</div>
										</c:when>
									</c:choose>
								</div>
							</div>

							<c:choose>
								<c:when test="${p.donationMode.isOnetime eq 1}">
									<div class="form-group">
										<label class="col-md-4 control-label">捐赠周期</label>
										<div class="col-md-6">
											<label class="form-control">一次性捐赠</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label " for="text3">金额</label>
										<div class="col-md-6">
											<label class="form-control"> <fmt:formatNumber
													value='${p.donationMode.amount }' type='number'
													groupingUsed='false' maxFractionDigits='2' />
											</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label " for="text3">捐赠时间</label>
										<div class="col-md-6">
											<label class="form-control"> <fmt:formatDate
													value='${p.donationMode.executeTime }' pattern="yyyy-MM-dd" />
											</label>
										</div>
									</div>
								</c:when>
								<c:otherwise>
									<div class="form-group">
										<label class="col-md-4 control-label">捐赠周期</label>
										<div class="col-md-6">
											<label class="form-control">逐年捐赠</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label " for="text3">年度捐赠金额</label>
										<div class="col-md-6">
											<label class="form-control"> <fmt:formatNumber
													value='${p.donationMode.amount }' type='number'
													groupingUsed='false' maxFractionDigits='2' />
											</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label " for="text3">开始时间</label>
										<div class="col-md-6">
											<label class="form-control"> <fmt:formatDate
													value='${p.donationMode.executeTime }' pattern="yyyy-MM-dd" />
											</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label " for="text3">年限</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationMode.span}</label>
										</div>
									</div>
								</c:otherwise>
							</c:choose>
							
							<div class="form-group">
								<label class="col-md-4 control-label" >项目经费负责人</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationMode.fundPrincipal }</label>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-4 control-label" for="textarea1">捐赠用途</label>
								<div class="col-md-6">
									<textarea id="textarea1" name="textarea1" rows="4"
										class="form-control" readonly="readonly"
										style="cursor: text; background-color: white;">${p.purpose}</textarea>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="text8">受益单位</label>
								<div class="col-md-6">
									<label class="form-control">${p.benificiaryunit}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">捐赠方式</label>
								<div class="col-md-6">
									<label class="form-control"> <c:choose>
											<c:when test="${p.isUnit eq 0}">个人捐赠</c:when>
											<c:otherwise>单位捐赠</c:otherwise>
										</c:choose>
									</label>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-lg-6">
				<div class="panel">
					<div class="form-horizontal">
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>受益方信息
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<label class="col-md-4 control-label">项目联系人</label>
								<div class="col-md-6">
									<label class="form-control">${p.benificiaryContact.bcName}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">电话</label>
								<div class="col-md-6">
									<label class="form-control">${p.benificiaryContact.officephone}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">传真</label>
								<div class="col-md-6">
									<label class="form-control">${p.benificiaryContact.fax}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">手机</label>
								<div class="col-md-6">
									<label class="form-control">${p.benificiaryContact.mobilephone}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">E-mail</label>
								<div class="col-md-6">
									<label class="form-control">${p.benificiaryContact.bcEmail}</label>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="col-lg-6">
				<div class="panel">
					<div class="form-horizontal">
						<c:choose>
							<c:when test="${p.isUnit eq 0}">
								<div class="panel-heading bk-bg-primary">
									<h6>
										<i class="fa fa-paperclip"></i>个人捐赠信息
									</h6>
									<div class="panel-actions">
										<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
									</div>
								</div>
								<div class="panel-body">
									<div class="form-group">
										<label class="col-md-4 control-label">捐赠人姓名</label>
										<div class="col-md-6">
											<label class="form-control">${p.donor.dName}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">性别</label>
										<div class="col-md-6">
											<label class="form-control">${donor.dSex}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">出生日期</label>
										<div class="col-md-6">
											<label class="form-control"> <fmt:formatDate
													value='${p.donor.dBirthday }' pattern="yyyy-MM-dd" />
											</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label" for="textarea2">业余爱好</label>
										<div class="col-md-6">
											<textarea id="textarea2" name="textarea2" rows="4"
												class="form-control" readonly="readonly"
												style="cursor: text; background-color: white;">${p.donor.hobbits}</textarea>
										</div>
									</div>
									<c:choose>
										<c:when test="${p.donor.isAlumni eq 1 }">
											<div class="form-group">
												<label class="col-md-4 control-label">是否校友</label>
												<div class="col-md-6">
													<label class="form-control">是</label>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-4 control-label">毕业时间/院（系）</label>
												<div class="col-md-6">
													<label class="form-control">${p.donor.degreeinfo}</label>
												</div>
											</div>
										</c:when>
										<c:otherwise>
											<div class="form-group">
												<label class="col-md-4 control-label">是否校友</label>
												<div class="col-md-6">
													<label class="form-control">否</label>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-4 control-label">毕业时间/院（系）</label>
												<div class="col-md-6">
													<label class="form-control">${p.donor.degreeinfo}</label>
												</div>
											</div>
										</c:otherwise>
									</c:choose>
									<div class="form-group">
										<label class="col-md-4 control-label">捐赠人单位</label>
										<div class="col-md-6">
											<label class="form-control">${p.donor.dUnit}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">职务</label>
										<div class="col-md-6">
											<label class="form-control">${p.donor.dJob}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">手机</label>
										<div class="col-md-6">
											<label class="form-control">${p.donor.mobilephone}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">E-mail</label>
										<div class="col-md-6">
											<label class="form-control">${p.donor.dEmail}</label>
										</div>
									</div>
								</div>
							</c:when>
							<c:otherwise>
								<div class="panel-heading bk-bg-primary">
									<h6>
										<i class="fa fa-paperclip"></i>单位捐赠信息
									</h6>
									<div class="panel-actions">
										<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
									</div>
								</div>
								<div class="panel-body">
									<div class="form-group">
										<label class="col-md-4 control-label">捐赠单位名称</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.duName}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">单位地址</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.address }</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">邮编</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.zipCode}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">电话</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.officephone}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">传真</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.fax}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">手机</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.mobilephone}</label>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">E-mail</label>
										<div class="col-md-6">
											<label class="form-control">${p.donationUnit.duEmail}</label>
										</div>
									</div>
								</div>
							</c:otherwise>
						</c:choose>
					</div>

				</div>
			</div>

			<div class="col-lg-6">
				<div class="panel">
					<div class="form-horizontal">
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>捐赠方联系人
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<label class="col-md-4 control-label">捐赠方联系人</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationContact.dcName}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">联系人职务</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationContact.job}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">电话</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationContact.officephone}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">传真</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationContact.fax}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">手机</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationContact.mobilephone}</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">E-mail</label>
								<div class="col-md-6">
									<label class="form-control">${p.donationContact.dcEmail}</label>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-4 control-label">捐赠类型</label>
								<div class="col-md-6">
									<c:choose>
										<c:when test="${p.publicationState eq 1 }">
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio1" checked="checked" disabled="disabled"> 
												<label for="inline-radio1">可以公开姓名和捐赠额</label>
											</div>
										</c:when>
										<c:when test="${p.publicationState eq 2 }">
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio1" checked="checked" disabled="disabled"> 
												<label for="inline-radio1">只公开姓名</label>
											</div>
										</c:when>
										<c:when test="${p.publicationState eq 3 }">
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio1" checked="checked" disabled="disabled"> 
												<label for="inline-radio1">只公开金额</label>
											</div>
										</c:when>
										<c:otherwise>
											<div class="radio-custom radio-inline">
												<input type="radio" id="inline-radio1" checked="checked" disabled="disabled"> 
												<label for="inline-radio1">不公开任何信息</label>
											</div>
										</c:otherwise>
									</c:choose>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>