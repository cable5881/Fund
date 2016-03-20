<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>详细消息</title>
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
					<li class="active"><a href="message.jsp"><i
							class="fa fa-envelope"></i>消息通知</a></li>
					<li class="active"><a href="message.jsp"><i
							class="fa fa-envelope-o"></i>详细消息</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>详细消息</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-paperclip"></i>详细消息
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="panel panel-default col-md-8 col-md-offset-2 ">
					<div class="panel-body ">
						<div class="row form-group">
							<label class="col-md-2 control-label">标题</label>
							<div class="col-md-8">
								<label class="form-control"></label>
							</div>
						</div>
						<div class="row form-group">
							<label class="col-md-2 control-label">时间</label>
							<div class="col-md-8">
								<label class="form-control"></label>
							</div>
						</div>
						<div class="form-group row">
							<label class="col-md-2 control-label">内容</label>
							<div class="col-md-8">
								<div class="test_box form-control" contenteditable="false" ></div>
							</div>
						</div>
						<div class="form-group row">
							<label class="col-md-2 control-label">附件</label>
							<div class="col-md-8">
								<div class="panel panel-default">
									<div class="panel-body">
										<div class="row form-group">
											<span class="label label-danger">pdf</span> <b>File.pdf</b> <i>(5.3KB)</i>
											<div class="pull-right">
												<a href="#" class="fa fa-cloud-download"><i></i></a>
											</div>
										</div>
										<div class="row form-group">
											<span class="label label-success">xls</span> <b>File.xls</b>
											<i>(984KB)</i>
											<div class="pull-right">
												<a href="#" class="fa fa-cloud-download"><i></i></a>
											</div>
										</div>
										<div class="row form-group">
											<span class="label label-primary">zip</span> <b>File.zip</b>
											<i>(1.25MB)</i>
											<div class="pull-right">
												<a href="#" class="fa fa-cloud-download"><i></i></a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div>
							<div class="text-center" style="text-align: center">
								<button type="button" class="btn btn-danger">
									<i class="fa fa-trash-o"></i> 删除
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
</html>