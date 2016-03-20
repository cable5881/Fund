<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>立项申请表</title>
<jsp:include page="../Model.jsp"></jsp:include>
<link rel="stylesheet"
	href="/Fund/static/zebra_datepicker/css/metallic.css" type="text/css">
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<form id="projectApp" class="form-horizontal ">
			<input type="hidden" name="contextPath"
				value="${pageContext.request.contextPath}" />
			<!-- Page Header -->
			<div class="page-header">
				<div class="pull-left">
					<ol class="breadcrumb visible-sm visible-md visible-lg">
						<li class="active"><i class="fa fa-folder"></i>立项管理</li>
						<li class="active"><a
							href="<c:url value='/benificiary/beforeSetUp.action'/>"><i
								class="fa fa-plus-circle"></i>创建立项</a></li>
						<li class="active"><a
							href="<c:url value='/benificiary/toSetUp.action'/>"><i
								class="fa fa-file-text-o"></i>立项申请表</a></li>
					</ol>
				</div>
				<div class="pull-right">
					<h2>立项申请表</h2>
				</div>
			</div>
			<!-- End Page Header -->

			<div class="row">
				<div class=" progress thin progress-striped active">
					<div class="progress-bar progress-bar-success" id="proProgress"></div>
				</div>
			</div>


			<div class="row" id="div1">
				<div
					class=" col-md-offset-2 col-md-8 panel bk-bg-white bk-margin-bottom-20">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>项目信息
						</h6>
						<div class="panel-actions">
							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body panel-default">
						<!-- <div class="row"> -->
						<div class="form-group">
							<label class="col-md-3 control-label" for="text1">捐赠项目名称</label>
							<div class="col-md-9">
								<input type="text" id="text1" name="projectName"
									class="form-control text-proName-check text-proName-land"
									placeholder="必填"> <span
									class="help-block span-proName-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label" for="text2">项目负责人</label>
							<div class="col-md-9">
								<input type="text" id="text2" name="leader"
									class="form-control text-proPer-check text-proPer-land"
									placeholder="必填"> <span
									class="help-block span-proPer-info" style="color: red"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label"></label>
							<div class="col-md-9">
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio5"
										name="donationMode.realEstate" value="1" checked="checked">
									<label for="inline-radio5"> 动本</label>
								</div>
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio6"
										name="donationMode.realEstate" value="0"> <label
										for="inline-radio6"> 不动本</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">捐赠内容</label>
							<div class="col-md-9">
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio7" name="donationMode.form"
										value="1" checked="checked"> <label
										for="inline-radio7"> 现金</label>
								</div>
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio8" name="donationMode.form"
										value="2"> <label for="inline-radio8"> 支票</label>
								</div>
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio9" name="donationMode.form"
										value="3"> <label for="inline-radio9"> 汇票</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">捐赠周期</label>
							<div class="col-md-9">
								<div class="radio-custom ">
									<input type="radio" id="radio1" name="donationMode.isOnetime"
										checked="checked" value="1" class="radio-OneTime"
										onclick="donTimeRadio()"> <label for="radio1">
										一次性捐赠</label>
								</div>
							</div>
						</div>
						<div class="form-group div-OneTime" id="donation-div1">
							<div class="panel panel-default   ">
								<div class="panel-body">
									<div class="form-group">
										<label class="col-md-3 control-label " for="text3">金额</label>
										<div class="col-md-5">
											<input type="text" id="text3"
												name="donationMode.oneTimeAmount"
												class="form-control text-donMon-check text-donMon-land"
												placeholder="必填"> <span
												class="help-block span-donMon-info" style="color: red"></span>
										</div>
										<div class="col-md-4">
											<select class="form-control"
												name="donationMode.currencytypeId">
												<option value="1" selected="selected">人民币</option>
												<option value="2">美元</option>
												<option value="3">日元</option>
												<option value="4">英镑</option>
												<option value="5">港币</option>
												<option value="6">欧元</option>
												<option value="7">台币</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-3 control-label" for="text4">捐赠时间</label>
										<div class="col-md-8">
											<input type="text" id="executeDate"
												name="donationMode.deadline"
												class="form-control text-donTime-check text-donTime-land"
												placeholder="必填"> <span
												class="help-block span-donTime-info" style="color: red"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label"></label>
							<div class="col-md-9">
								<div class="radio-custom radio-inline">
									<input type="radio" id="radio2" name="donationMode.isOnetime"
										value="0" class="radio-MoreTime" onclick="donTimeRadio()">
									<label for="radio2"> 逐年捐赠</label>
								</div>
							</div>
						</div>
						<div class="form-group div-MoreTime" id="donation-div2">
							<div class="panel panel-default ">
								<div class="panel-body">
									<div class="form-group">
										<label class="col-md-3 control-label " for="text5">年度捐赠金额</label>
										<div class="col-md-5">
											<input type="text" id="text5" name="donationMode.yearAmount"
												class="form-control text-eachYearMon-check text-eachYearMon-land">
											<span class="help-block span-eachYearMon-info"
												style="color: red"></span>
										</div>
										<div class="col-md-4">
											<select class="form-control">
												<option value="1" selected="selected">人民币</option>
												<option value="2">美元</option>
												<option value="3">日元</option>
												<option value="4">英镑</option>
												<option value="5">港币</option>
												<option value="6">欧元</option>
												<option value="7">台币</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-3 control-label" for="text6">年限</label>
										<div class="col-md-9">
											<input type="text" id="text6" name="donationMode.span"
												class="form-control text-year-check text-year-land">
											<span class="help-block span-year-info" style="color: red"></span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-3 control-label " for="text30">开始时间</label>
										<div class="col-md-9">
											<input type="text" id="startDate"
												name="donationMode.startTime"
												class="form-control text-staTime-check text-staTime-land">
											<span style="color: red"></span>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" for="text36">项目经费负责人</label>
							<div class="col-md-9">
								<input type="text" id="text36" name="donationMode.fundPrincipal"
									class="form-control text-moneyPrincipal-check text-moneyPrincipal-land"
									placeholder="必填"> <span
									class="help-block span-moneyPrincipal-info" style="color: red"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" for="textarea1">捐赠用途</label>
							<div class="col-md-9">
								<textarea id="textarea1" name="purpose" rows="6"
									class="form-control"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label" for="text8">受益单位</label>
							<div class="col-md-9">
								<input type="text" id="text8" name="benificiaryunitId"
									class="form-control text-beneUnit-check text-beneUnit-land"
									placeholder="必填"> <span
									class="help-block span-beneUnit-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">捐赠方式</label>
							<div class="col-md-9">
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio1" name="isUnit" value="0"
										class="personal" checked="checked" onclick="unitRadio()">
									<label for="inline-radio1"> 个人捐赠</label>
								</div>
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio2" name="isUnit" value="1"
										class="unit" onclick="unitRadio()"> <label
										for="inline-radio2"> 单位捐赠</label>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="row" id="div2">
				<div
					class="col-md-8 col-md-offset-2 panel bk-bg-white bk-margin-bottom-20">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>受益方信息
						</h6>
						<div class="panel-actions">

							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body panel-default">
						<!-- <div class="row"> -->
						<div class="form-group">
							<label class="col-md-3 control-label">项目联系人</label>
							<div class="col-md-9">
								<input type="text" id="text9" name="benificiaryContact.bcName"
									class="form-control text-proLinkman-check text-proLinkman-land"
									placeholder="必填"> <span
									class="help-block span-proLinkman-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">电话</label>
							<div class="col-md-9">
								<input type="text" id="text10"
									name="benificiaryContact.officephone"
									class="form-control text-benePhone-land"> <span
									class="help-block span-benePhone-info" style="color: red"></span>

							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">传真</label>
							<div class="col-md-9">
								<input type="text" id="text11" name="benificiaryContact.fax"
									class="form-control text-beneFax-land"> <span
									class="help-block span-beneFax-info" style="color: red"></span>

							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">手机</label>
							<div class="col-md-9">
								<input type="text" id="text12"
									name="benificiaryContact.mobilephone"
									class="form-control text-beneMobPho-check text-beneMobPho-land"
									placeholder="必填"> <span
									class="help-block span-beneMobPho-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">邮箱</label>
							<div class="col-md-9">
								<input type="text" id="text13" name="benificiaryContact.bcEmail"
									class="form-control text-beneLinEm-check text-beneLinEm-land"
									placeholder="必填"> <span
									class="help-block span-beneLinEm-info" style="color: red"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row" id="div3">
				<div
					class="col-md-offset-2 col-md-8 panel bk-bg-white bk-margin-bottom-20 div-Per">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>个人捐赠信息
						</h6>
						<div class="panel-actions">

							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body panel-default">
						<!-- <div class="row"> -->
						<div class="form-group">
							<label class="col-md-3 control-label">捐赠人姓名</label>
							<div class="col-md-9">
								<input type="text" id="text14" name="donor.dName"
									class="form-control text-donName-check text-donName-land"
									placeholder="必填"> <span
									class="help-block span-donName-info" style="color: red"></span>
							</div>

						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">性别</label>
							<div class="col-md-9">
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio3" name="donor.dSex"
										value="男" checked="checked"> <label
										for="inline-radio3"> 男</label>
								</div>
								<div class="radio-custom radio-inline">
									<input type="radio" id="inline-radio4" name="donor.dSex"
										value="女"> <label for="inline-radio4"> 女</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">出生日期</label>
							<div class="col-md-9">
								<input type="text" id="birthday_date" name="donor.dBirthday"
									class="form-control text-birthday-check text-birthday-land"
									placeholder="必填"> <span
									class="help-block span-birthday-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label" for="textarea2">业余爱好</label>
							<div class="col-md-9">
								<textarea id="textarea2" name="donor.hobbits" rows="6"
									class="form-control"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">是否校友</label>
							<div class="col-md-9">
								<div class="radio-custom ">
									<input type="radio" id="radio11" name="donor.isAlumni"
										value="1" class="radio-Sch"> <label for="radio11">
										是</label>
								</div>
								<div class="form-group div-gra" id="gra-div">
									<label class="col-md-4 control-label">毕业时间/院（系）</label>
									<div class="col-md-8">
										<input type="text" id="text16" name="donor.degreeinfo"
											class="form-control text-graTime-check text-graTime-land"
											placeholder="必填"> <span
											class="help-block span-graTime-info" style="color: red"></span>
									</div>
								</div>
								<div class="radio-custom ">
									<input type="radio" id="radio12" name="donor.isAlumni"
										value="0" class="radio-NoSch" checked="checked"> <label
										for="radio12"> 否</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">捐赠人单位</label>
							<div class="col-md-9">
								<input type="text" id="text17" name="donor.dUnit"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">职务</label>
							<div class="col-md-9">
								<input type="text" id="text18" name="donor.dJob"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">手机</label>
							<div class="col-md-9">
								<input type="text" id="text34" name="donor.mobilephone"
									class="form-control text-perMobPho-land"> <span
									class="help-block span-perMobPho-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">E-mail</label>
							<div class="col-md-9">
								<input type="text" id="text35" name="donor.dEmail"
									class="form-control text-perEm-land"> <span
									class="help-block span-perEm-info" style="color: red"></span>
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="row" id="div4">
				<div
					class="col-md-8 col-md-offset-2 panel bk-bg-white bk-margin-bottom-20 div-Unit">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>单位捐赠信息
						</h6>
						<div class="panel-actions">

							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body panel-default">
						<!-- <div class="row"> -->
						<div class="form-group">
							<label class="col-md-3 control-label" for="textarea4">捐赠单位名称</label>
							<div class="col-md-9">
								<input type="text" id="text32" name="donationUnit.duName"
									class="form-control text-donUnitName-check text-donUnitName-land"
									placeholder="必填"> <span
									class="help-block span-donUnitName-info" style="color: red"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" for="textarea3">单位地址</label>
							<div class="col-md-9">
								<textarea id="textarea3" name="donationUnit.address" rows="4"
									class="form-control"></textarea>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label">邮政编码</label>
							<div class="col-md-9">
								<input type="text" id="text33" name="donationUnit.zipCode"
									class="form-control  text-donUnitPostcode-land"
									> <span
									class="help-block span-donUnitPostcode-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">电话</label>
							<div class="col-md-9">
								<input type="text" id="text26" name="donationUnit.officephone"
									class="form-control text-donUnitPhone-land">
									<span
									class="help-block span-donUnitPhone-info" style="color: red"></span>

							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">传真</label>
							<div class="col-md-9">
								<input type="text" id="text27" name="donationUnit.fax"
									class="form-control text-donUnitFax-land">
									<span
									class="help-block span-donUnitFax-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">手机</label>
							<div class="col-md-9">
								<input type="text" id="text28" name="donationUnit.mobilephone"
									class="form-control text-donUnitMobPho-check text-donUnitMobPho-land"
									placeholder="必填"> <span
									class="help-block span-donUnitMobPho-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">E-mail</label>
							<div class="col-md-9">
								<input type="text" id="text29" name="donationUnit.duEmail"
									class="form-control text-donUnitEm-check text-donUnitEm-land"
									placeholder="必填"> <span
									class="help-block span-donUnitEm-info" style="color: red"></span>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row" id="div5">
				<div
					class="col-md-8 col-md-offset-2 panel bk-bg-white bk-margin-bottom-20 ">
					<div class="panel-heading bk-bg-primary">
						<h6>
							<i class="fa fa-paperclip"></i>捐赠方联系人
						</h6>
						<div class="panel-actions">

							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body">
						<!-- <div class="row"> -->
						<div class="form-group">
							<label class="col-md-3 control-label">捐赠方联系人</label>
							<div class="col-md-9">
								<input type="text" id="text24" name="donationContact.dcName"
									class="form-control text-donLinkman-check text-donLinkman-land"
									placeholder="必填"> <span
									class="help-block span-donLinkman-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">联系人职务</label>
							<div class="col-md-9">
								<input type="text" id="text25" name="donationContact.job"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">电话</label>
							<div class="col-md-9">
								<input type="text" id="text25"
									name="donationContact.officephone"
									class="form-control text-donPerPhone-land"> <span
									class="help-block span-donPerPhone-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">手机</label>
							<div class="col-md-9">
								<input type="text" id="text25"
									name="donationContact.mobilephone"
									class="form-control text-donPerMobPho-check text-donPerMobPho-land"
									placeholder="必填"> <span
									class="help-block span-donPerMobPho-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">传真</label>
							<div class="col-md-9">
								<input type="text" id="text25" name="donationContact.fax"
									class="form-control text-donPerFax-land"> <span
									class="help-block span-donPerFax-info" style="color: red"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-3 control-label">E-mail</label>
							<div class="col-md-9">
								<input type="text" id="text25" name="donationContact.dcEmail"
									class="form-control text-donPerEm-check text-donPerEm-land"
									placeholder="必填"> <span
									class="help-block span-donPerEm-info" style="color: red"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label">捐赠方是否同意在学校相关刊物和网站上公开鸣谢</label>
							<div class="col-md-9">
								<div class="radio-custom ">
									<input type="radio" id="radio3" name="publicationState"
										checked="checked" value="1"> <label for="radio3">
										可以公开姓名和捐赠额</label>
								</div>
								<div class="radio-custom ">
									<input type="radio" id="radio4" name="publicationState"
										value="2"> <label for="radio4"> 只公开姓名</label>
								</div>
								<div class="radio-custom ">
									<input type="radio" id="radio5" name="publicationState"
										value="3"> <label for="radio5"> 只公开金额</label>
								</div>
								<div class="radio-custom ">
									<input type="radio" id="radio6" name="publicationState"
										value="4"> <label for="radio6"> 不公开任何信息</label>
								</div>
							</div>
						</div>

					</div>
				</div>

			</div>
			<div class="row">
				<div class="col-md-6 col-md-offset-3" style="text-align: center;">
					<button id="lastBtn" type="button" class="btn btn-info"
						onclick="lastCheck()">
						<i class="fa fa-chevron-circle-left"></i> 上一步
					</button>
					<button id="nextBtn" type="button" class="btn btn-info"
						onclick="nextCheck()">
						<i class="fa fa-chevron-circle-right"></i> 下一步
					</button>
					<button id="saveBtn" type="button" class="btn btn-danger"
						onclick="executeAction(0)">
						<i class="fa fa-save (alias)"></i> 保存
					</button>
					<button id="submitBtn" type="button" class="btn btn-success"
						onclick="executeAction(1)">
						<i class="fa fa-check-circle"></i> 提交
					</button>
				</div>

			</div>
		</form>
	</div>
	<!-- End Main Page -->

	<script type="text/javascript"
		src="/Fund/static/zebra_datepicker/js/zebra_datepicker.js"></script>
	<script type="text/javascript"
		src="/Fund/assets/js/pages/dateFormatter.js"></script>
	<script type="text/javascript"
		src="/Fund/assets/js/pages/projectApplicationForm.js"></script>
	<script type="text/javascript"
		src="/Fund/assets/js/pages/submitProjectApplicationForm.js"></script>
</body>
</html>