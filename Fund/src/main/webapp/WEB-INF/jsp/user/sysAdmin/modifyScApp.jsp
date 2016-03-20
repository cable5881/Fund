<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>奖学金申请表</title>
<jsp:include page="../Model.jsp"></jsp:include>
<link rel="stylesheet" href="/Fund/static/zebra_datepicker/css/metallic.css" type="text/css">

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
					<li class="active"><a href="#"><i class="fa fa-file"></i>奖学金申请表</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>奖学金申请表</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<form action="${pageContext.request.contextPath}/sysAdmin/updateScApp.action" method="post" class="form-horizontal ">
			<input type="hidden" name="scholarshipappId" value="${app.scholarshipappId }"/>			<input type="hidden" name="scAppInfo.scappinfoId" value="${app.scAppInfo.scappinfoId }"/>
			<input type="hidden" name="scIndivInfo.scindivinfoId" value="${app.scIndivInfo.scindivinfoId }"/>
			<div class="row">
				<div class="col-md-8">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>个人基本信息
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
						    <div class="row">
								<div class="text-center form-group">
									<h4>${p.projectName }</h4>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.institute">学院</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.institute" name="scIndivInfo.institute" value="${app.scIndivInfo.institute }"
											class="form-control text-proName-check text-proName-land" placeholder="必填"> <span
											class="help-block span-proName-info" style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scIndivInfo.degrees">学历</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.degrees" name="scIndivInfo.degrees" value="${app.scIndivInfo.degrees }"
											class="form-control text-proPer-check text-proPer-land" placeholder="必填"> <span
											class="help-block span-proPer-info" style="color: red"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group  col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.major">专业</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.major" name="scIndivInfo.major" value="${app.scIndivInfo.major }"
											class="form-control text-donMon-check text-donMon-land" placeholder="必填"> <span
											class="help-block span-donMon-info" style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.classes">班级</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.classes" name="scIndivInfo.classes" value="${app.scIndivInfo.classes }"
											class="form-control text-donTime-check text-donTime-land" placeholder="必填"> <span
											class="help-block span-donTime-info" style="color: red"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.scName">姓名</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.scName" name="scIndivInfo.scName" value="${app.scIndivInfo.scName }"
											class="form-control text-eachYearMon-check text-eachYearMon-land" placeholder="必填"> <span
											class="help-block  span-eachYearMon-info" style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.scSex">性别</label>
									<div class="col-md-8">
									<c:choose>
									<c:when test="${app.scIndivInfo.scSex eq 0 }">
										<div class="radio-custom radio-inline">
											<input type="radio" id="scindivinfo.scSex1" name="scIndivInfo.scSex"
												value="0" checked="checked"> <label for="scindivinfo.scSex1">
												男</label>
										</div>
										<div class="radio-custom radio-inline">
											<input type="radio" id="scindivinfo.scSex2" name="scIndivInfo.scSex"
												value="1"> <label for="scindivinfo.scSex2">
												女</label>
										</div>
									</c:when>
									<c:otherwise>
									<div class="radio-custom radio-inline">
											<input type="radio" id="scindivinfo.scSex1" name="scIndivInfo.scSex"
												value="0" > <label for="scindivinfo.scSex1">
												男</label>
										</div>
										<div class="radio-custom radio-inline">
											<input type="radio" id="scindivinfo.scSex2" name="scIndivInfo.scSex"
												value="1" checked="checked"> <label for="scindivinfo.scSex2">
												女</label>
										</div>
									</c:otherwise>
									</c:choose>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.scBirthday">出生年月</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.scBirthday" name="scIndivInfo.scBirthday" value="<fmt:formatDate value='${app.scIndivInfo.scBirthday }' pattern="yyyy-MM-dd"/>"
											class="form-control birthday_date " placeholder="必填"> <span
											class="help-block " style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="scindivinfo.scStuid">学号</label>
									<div class="col-md-8">
										<input type="text" id="scindivinfo.scStuid" name="scIndivInfo.scStuid" value="${app.scIndivInfo.scStuid }"
											class="form-control text-donUnitMobPho-check text-donUnitMobPho-land" placeholder="必填"> <span
											class="help-block span-donUnitMobPho-info" style="color: red"></span>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scindivinfo.nation">民族</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.nation" name="scIndivInfo.nation" value="${app.scIndivInfo.nation }"
												class="form-control text-beneUnit-check text-beneUnit-land" placeholder="必填"> <span
												class="help-block span-beneUnit-info" style="color: red"></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scindivinfo.enrolledTime">入学时间</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.enrolledTime" name="scIndivInfo.enrolledTime" value="<fmt:formatDate value='${app.scIndivInfo.enrolledTime }' pattern="yyyy-MM-dd"/>"
												class="form-control birthday_date " placeholder="必填"> <span
												class="help-block " style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scindivinfo.politicalStatus">政治面貌</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.politicalStatus" name="scIndivInfo.politicalStatus" value="${app.scIndivInfo.politicalStatus }"
												class="form-control text-proLinkman-check text-proLinkman-land" placeholder="必填"> <span
												class="help-block span-proLinkman-info" style="color: red"></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scappinfo.acaScore">智育成绩（均分）</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.acaScore" name="scIndivInfo.acaScore" value="${app.scIndivInfo.acaScore }"
												class="form-control text-donName-check text-donName-land" placeholder="必填"> <span
												class="help-block span-donName-info" style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scindivinfo.alltestLevel">综合测评等级</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.alltestLevel" name="scIndivInfo.alltestLevel" value="${app.scIndivInfo.alltestLevel }"
												class="form-control text-birthday-check text-birthday-land" placeholder="必填"> <span
												class="help-block  span-birthday-info" style="color: red"></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scindivinfo.phoneNumber">联系电话</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.phoneNumber" name="scIndivInfo.phoneNumber" value="${app.scIndivInfo.phoneNumber }"
												class="form-control text-beneMobPho-check text-beneMobPho-land" placeholder="必填"> <span
												class="help-block span-beneMobPho-info" style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="scindivinfo.scEmail">电子邮箱</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.scEmail" name="scIndivInfo.scEmail" value="${app.scIndivInfo.scEmail }"
												class="form-control text-beneLinEm-check text-beneLinEm-land" placeholder="必填"> <span
												class="help-block span-beneLinEm-info" style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group ">
										<label class="col-md-2 control-label" for="scindivinfo.scAddress">家庭住址</label>
										<div class="col-md-8">
											<input type="text" id="scindivinfo.scAddress" name="scIndivInfo.scAddress" value="${app.scIndivInfo.scAddress }"
												class="form-control text-donUnitName-check text-donUnitName-land" placeholder="必填"> <span
												class="help-block span-donUnitName-info" style="color: red"></span>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
				<div class="col-md-4">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>对奖学金设立企业或个人的了解
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="scappinfo.description" name="scAppInfo.description" rows="10"
										class="form-control">${app.scAppInfo.description }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>申请理由
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="scappinfo.scCase" name="scAppInfo.scCase" rows="10"
										class="form-control">${app.scAppInfo.scCase }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>班级意见
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="scappinfo.viewClass" name="scAppInfo.viewClass" rows="10"
										class="form-control">${app.scAppInfo.viewClass }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>学院意见
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="scappinfo.viewInstitute" name="scAppInfo.viewInstitute" rows="10"
										class="form-control">${app.scAppInfo.viewInstitute }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>奖（助）学金评审委员会意见
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="scappinfo.viewJudge" name="scAppInfo.viewJudge" rows="10"
										class="form-control">${app.scAppInfo.viewJudge }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-md-offset-5" style="text-align: center">
					<button type="submit" class="btn btn-success"
						onclick="javascript:return true">
						<i class="fa fa-check-circle"></i> 保存修改
					</button>
				</div>
			</div>
		</form>
	</div>

<script type="text/javascript" src="/Fund/static/zebra_datepicker/js/zebra_datepicker.js"></script>
<script type="text/javascript" src="/Fund/assets/js/pages/scholarshipApplicationForm.js"></script>
<script type="text/javascript" src="/Fund/assets/js/pages/submitScholarshipApplicationForm.js"></script>
</body>
</html>