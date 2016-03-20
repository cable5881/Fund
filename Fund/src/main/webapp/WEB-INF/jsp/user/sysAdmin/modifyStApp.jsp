<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>助学金申请表</title>
<jsp:include page="../Model.jsp"></jsp:include>
<link rel="stylesheet" href="/Fund/static/zebra_datepicker/css/metallic.css" type="text/css">
    <script type="text/javascript" src="/Fund/static/zebra_datepicker/js/zebra_datepicker.js"></script>
<script type="text/javascript"
	src="/Fund/assets/js/pages/stipendApplicationForm.js"></script>
<script type="text/javascript"
	src="/Fund/assets/js/pages/submitStipendApplicationForm.js"></script>
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
					<li class="active"><a href="#"><i class="fa fa-file"></i>助学金申请表</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>助学金申请表</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<form action="${pageContext.request.contextPath}/sysAdmin/updateStApp.action" method="post" class="form-horizontal ">
			<input type="hidden" name="stAppInfo.stappinfoId" value="${app.stAppInfo.stappinfoId }"/>
			<input type="hidden" name="stIndivInfo.stindivinfoId" value="${app.stIndivInfo.stindivinfoId }"/>
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
									<label class="col-md-4 control-label" for="stindivinfo.institute">学院</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.institute" name="stIndivInfo.institute" value="${app.stIndivInfo.institute }"
											class="form-control text-proName-check text-proName-land" placeholder="必填"> <span
											class="help-block span-proName-info" style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.degrees">学历</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.degrees" name="stIndivInfo.degrees" value="${app.stIndivInfo.degrees }"
											class="form-control text-proPer-check text-proPer-land" placeholder="必填"> <span
											class="help-block span-proPer-info" style="color: red"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group  col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.major">专业</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.major" name="stIndivInfo.major" value="${app.stIndivInfo.major }"
											class="form-control text-donMon-check text-donMon-land" placeholder="必填"> <span
											class="help-block span-donMon-info" style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.classes">班级</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.classes" name="stIndivInfo.classes" value="${app.stIndivInfo.classes }"
											class="form-control text-donTime-check text-donTime-land" placeholder="必填"> <span
											class="help-block span-donTime-info" style="color: red"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.stName">姓名</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.stName" name="stIndivInfo.stName" value="${app.stIndivInfo.stName }"
											class="form-control text-eachYearMon-check text-eachYearMon-land" placeholder="必填"> <span
											class="help-block  span-eachYearMon-info" style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.stSex">性别</label>
									<div class="col-md-8">
									<c:choose>
									<c:when test="${app.stIndivInfo.stSex eq 0}">
										<div class="radio-custom radio-inline">
											<input type="radio" id="stindivinfo.stSex1" name="stIndivInfo.stSex"
												value="0" checked="checked"> <label for="stindivinfo.stSex1">
												男</label>
										</div>
										<div class="radio-custom radio-inline">
											<input type="radio" id="stindivinfo.stSex2" name="stIndivInfo.stSex"
												value="1"> <label for="stindivinfo.stSex2">
												女</label>
										</div>
									</c:when>
									<c:otherwise>
										<div class="radio-custom radio-inline">
											<input type="radio" id="stindivinfo.stSex1" name="stIndivInfo.stSex"
												value="0" > <label for="stindivinfo.stSex1">
												男</label>
										</div>
										<div class="radio-custom radio-inline">
											<input type="radio" id="stindivinfo.stSex2" name="stIndivInfo.stSex"
												value="1" checked="checked"> <label for="stindivinfo.stSex2">
												女</label>
										</div>
									</c:otherwise>
									</c:choose>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.stBirthday">出生年月</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.stBirthday" name="stIndivInfo.stBirthday" value="<fmt:formatDate value='${app.stIndivInfo.stBirthday }' pattern="yyyy-MM-dd"/>"
											class="form-control birthday_date " placeholder="必填"> <span
											class="help-block " style="color: red"></span>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="stindivinfo.stStuid">学号</label>
									<div class="col-md-8">
										<input type="text" id="stindivinfo.stStuid" name="stIndivInfo.stStuid" value="${app.stIndivInfo.stStuid }"
											class="form-control text-donUnitMobPho-check text-donUnitMobPho-land" placeholder="必填"> <span
											class="help-block span-donUnitMobPho-info" style="color: red"></span>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="stindivinfo.nation">民族</label>
										<div class="col-md-8">
											<input type="text" id="stindivinfo.nation" name="stIndivInfo.nation" value="${app.stIndivInfo.nation }"
												class="form-control text-beneUnit-check text-beneUnit-land" placeholder="必填"> <span
												class="help-block span-beneUnit-info" style="color: red"></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="stindivinfo.enrolledTime">入学时间</label>
										<div class="col-md-8">
											<input type="text" id="stindivinfo.enrolledTime" name="stIndivInfo.enrolledTime" value="<fmt:formatDate value='${app.stIndivInfo.stBirthday }' pattern="yyyy-MM-dd"/>"
												class="form-control birthday_date " placeholder="必填"> <span
												class="help-block " style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="stindivinfo.politicalStatus">政治面貌</label>
										<div class="col-md-8">
											<input type="text" id="stindivinfo.politicalStatus" name="stIndivInfo.politicalStatus" value="${app.stIndivInfo.politicalStatus }"
												class="form-control text-proLinkman-check text-proLinkman-land" placeholder="必填"> <span
												class="help-block span-proLinkman-info" style="color: red"></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="stindivinfo.phone">联系电话</label>
										<div class="col-md-8">
											<input type="text" id="stindivinfo.phone" name="stIndivInfo.phone" value="${app.stIndivInfo.phone }"
												class="form-control text-beneMobPho-check text-beneMobPho-land" placeholder="必填"> <span
												class="help-block span-beneMobPho-info" style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-6">
										<label class="col-md-4 control-label" for="stindivinfo.stEmail">电子邮箱</label>
										<div class="col-md-8">
											<input type="text" id="stindivinfo.stEmail" name="stIndivInfo.stEmail" value="${app.stIndivInfo.stEmail }"
												class="form-control text-beneLinEm-check text-beneLinEm-land" placeholder="必填"> <span
												class="help-block span-beneLinEm-info" style="color: red"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group ">
										<label class="col-md-2 control-label" for="stindivinfo.stAddress">家庭住址</label>
										<div class="col-md-8">
											<input type="text" id="stindivinfo.stAddress" name="stIndivInfo.stAddress" value="${app.stIndivInfo.stAddress }"
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
								<i class="fa fa-paperclip"></i>对助学金设立企业或个人的了解
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="stappinfo.description" name="stAppInfo.description" rows="10"
										class="form-control">${app.stAppInfo.description }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel bk-bg-white bk-margin-bottom-20 " >
						<div class="panel-heading bk-bg-primary">
							<h6>
								<i class="fa fa-paperclip"></i>家庭经济困难情况说明
							</h6>
							<div class="panel-actions">
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="form-group">
								<div>
									<textarea id="stappinfo.stCase" name="stAppInfo.stCase" rows="10"
										class="form-control">${app.stAppInfo.stCase }</textarea>
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
									<textarea id="stappinfo.viewClass" name="stAppInfo.viewClass" rows="10"
										class="form-control">${app.stAppInfo.viewClass }</textarea>
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
									<textarea id="stappinfo.viewInstitute" name="stAppInfo.viewInstitute" rows="10"
										class="form-control">${app.stAppInfo.viewInstitute }</textarea>
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
									<textarea id="stappinfo.viewJudge" name="stAppInfo.viewJudge" rows="10"
										class="form-control">${app.stAppInfo.viewJudge }</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div>
				<div class="col-md-2 col-md-offset-5" style="text-align: center">
					<button type="submit" class="btn btn-success" onclick="javascript:return check()">
						<i class="fa fa-check-circle"></i> 保存修改
					</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>