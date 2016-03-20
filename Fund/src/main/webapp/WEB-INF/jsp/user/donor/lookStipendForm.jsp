<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>助学金申请表</title>
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
					<!--  -->
					<li class="active"><a href="#"><i
							class="fa fa-file-text-o"></i>项目信息</a></li>
					<li class="active"><a href="#"><i class="fa fa-list"></i>所有报名表</a></li>
					<li class="active"><a href="#"><i class="fa fa-file"></i>助学金申请表</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>助学金申请表</h2>
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
								<h4>*****助学金申请表</h4>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text1">学院</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text2">学历</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group  col-md-6">
								<label class="col-md-4 control-label" for="text3">专业</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text4">班级</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text5">姓名</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text6">性别</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text6">出生年月</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label class="col-md-4 control-label" for="text7">学号</label>
								<div class="col-md-8">
									<label class="form-control"></label>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text8">民族</label>
									<div class="col-md-8">
										<label class="form-control"></label>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text9">入学时间</label>
									<div class="col-md-8">
										<label class="form-control"></label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text10">政治面貌</label>
									<div class="col-md-8">
										<label class="form-control"></label>
									</div>
								</div>
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text11">联系电话</label>
									<div class="col-md-8">
										<label class="form-control"></label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label class="col-md-4 control-label" for="text12">电子邮箱</label>
									<div class="col-md-8">
										<label class="form-control"></label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group ">
									<label class="col-md-2 control-label" for="text13">家庭住址</label>
									<div class="col-md-8">
										<label class="form-control"></label>
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
							<i class="fa fa-paperclip"></i>对助学金设立企业或个人的了解
						</h6>
						<div class="panel-actions">
							<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div class="panel-body">
						<div class="form-group">
							<div>
								<textarea id="textarea1" name="textarea1" rows="10"
									class="form-control" readonly="readonly"
									style="cursor: text; background-color: white;"></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel bk-bg-white bk-margin-bottom-20 ">
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
								<textarea id="textarea2" name="textarea2" rows="10"
									class="form-control" readonly="readonly"
									style="cursor: text; background-color: white;"></textarea>
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
									class="form-control" readonly="readonly"
									style="cursor: text; background-color: white;"></textarea>
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
									class="form-control" readonly="readonly"
									style="cursor: text; background-color: white;"></textarea>
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
									class="form-control" readonly="readonly"
									style="cursor: text; background-color: white;"></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>