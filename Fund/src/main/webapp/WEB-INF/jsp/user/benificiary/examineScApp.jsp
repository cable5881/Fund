<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>奖学金申请表</title>
<jsp:include page="../Model.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
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
		<div class="row">
			<div class="col-md-8">
				<div class="panel bk-bg-white bk-margin-bottom-20 form-horizontal">
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
								<h4>${sessionScope.p.projectName }</h4>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text1">学院</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.institute }</label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text2">学历</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.degrees }</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group  col-md-6">
								<label class="col-md-4 control-label" for="text3">专业</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.major }</label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text4">班级</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.classes }</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text5">姓名</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.scName }</label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text6">性别</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.scSex}</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text6">出生年月</label>
								<div class="col-md-8">
									<label class="form-control"><fmt:formatDate value="${app.scIndivInfo.scBirthday }" pattern="yyyy-MM-dd"/></label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text7">学号</label>
								<div class="col-md-8">
									<label class="form-control">${app.scIndivInfo.scStuid }</label>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text8">民族</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.nation }</label>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text9">入学时间</label>
									<div class="col-md-8">
										<label class="form-control"><fmt:formatDate value="${app.scIndivInfo.enrolledTime }" pattern="yyyy-MM-dd"/></label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text10">政治面貌</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.politicalStatus }</label>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text11">智育成绩（均分）</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.acaScore }</label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text12">综合测评等级</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.alltestLevel }</label>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text13">联系电话</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.phoneNumber }</label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text14">电子邮箱</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.scEmail }</label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group ">
									<label class="col-md-2 control-label" for="text14">家庭住址</label>
									<div class="col-md-8">
										<label class="form-control">${app.scIndivInfo.scAddress }</label>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="col-md-4">
				<div class="panel bk-bg-white bk-margin-bottom-20 ">
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
								<textarea id="textarea1" name="textarea1" rows="10"
									class="form-control" onfocus="this.blur()">${app.scAppInfo.description }</textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel bk-bg-white bk-margin-bottom-20 ">
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
								<textarea id="textarea2" name="textarea2" rows="10"
									class="form-control" onfocus="this.blur()">${app.scAppInfo.scCase }</textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="panel bk-bg-white bk-margin-bottom-20 ">
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
								<textarea id="textarea3" name="textarea3" rows="10"
									class="form-control" onfocus="this.blur()">${app.scAppInfo.viewClass }</textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel bk-bg-white bk-margin-bottom-20 ">
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
								<textarea id="textarea4" name="textarea4" rows="10"
									class="form-control" onfocus="this.blur()">${app.scAppInfo.viewInstitute }</textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel bk-bg-white bk-margin-bottom-20 ">
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
								<textarea id="textarea5" name="textarea5" rows="10"
									class="form-control" onfocus="this.blur()">${app.scAppInfo.viewJudge }</textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div>
			<div class="col-md-3 col-md-offset-3" style="text-align: center">
				<button type="button" class="btn btn-danger" onclick="examineScApp(2,${app.scholarshipappId})">
					<i class="fa fa-times"></i> 审核失败
				</button>
				
			</div>
			<div class="col-md-3 " style="text-align: center">
				<button type="button" class="btn btn-success" onclick="examineScApp(1,${app.scholarshipappId})">
					<i class="fa fa-check"></i> 审核通过
				</button>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
	function examineScApp(mode,appId){
		var flag = false;
		if(mode==1)
		{
			flag = confirm("您确定要通过此学生的申请表?");
		}
		else if(mode==2)
		{
			flag = confirm("您确定要否决此学生的申请表?");
		}
		
		if(flag){
			$.ajax({
	             type: "POST",
	             url: "${pageContext.request.contextPath}/benificiary/examineBonusApp.action",
	             data: 'isPassed=' + mode + "&appId=" + appId,
	             dataType: "json",
	             success: function(result){
	            	 var pageNow = result.data.pageNow;
	            	 var verified = result.data.verified;
	            	 var projectId = result.data.projectId;
	            	 var url = "${pageContext.request.contextPath}/benificiary/examineBonusApps.action?pageNow="+pageNow+"&verified="+verified+"&projectId="+projectId;
	            	 if(result.resultCode == 1){
	            		 alert('通过此申请表成功！');
	            		 window.location = url;
	            	 }else if(result.resultCode == 2){
	            		 alert('否决此申请表成功！');
	            		 window.location = url;
	            	 }else if(result.resultCode == 0){
	            		 alert("审核申请表失败！");
	            	 }
	             }
	         });
		}
	}
</script>
</body>
</html>