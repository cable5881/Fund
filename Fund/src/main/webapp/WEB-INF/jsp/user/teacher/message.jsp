<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>基金消息</title>
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
				</ol>
			</div>
			<div class="pull-right">
				<h2>消息通知</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-paperclip"></i>消息通知
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
							<thead>
								<tr>
									<th class="text-center">时间</th>
									<th class="text-center">消息</th>
									<th class="text-center">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										<div class="checkbox-custom">
											<input type="checkbox" id="checkbox1" name="checkbox1"
												value="option1"> <label for="checkbox1">
												2015-06-06</label>
										</div>
									</td>
									<td>亲爱的周杰伦，您的奖学金已经到账...</td>
									<td><a class="btn btn-info" href="table.html#"> <i
											class="fa fa-eye "></i>
									</a> <a class="btn btn-danger" href="table.html#"> <i
											class="fa fa-trash-o "></i>

									</a></td>
								</tr>
								<tr>
									<td><div class="checkbox-custom">
											<input type="checkbox" id="checkbox2" name="checkbox2"
												value="option2"> <label for="checkbox2">
												2015-06-06</label>
										</div></td>
									<td>亲爱的周杰伦，您的奖学金已经到账...</td>
									<td><a class="btn btn-info" href="table.html#"> <i
											class="fa fa-eye "></i>
									</a> <a class="btn btn-danger" href="table.html#"> <i
											class="fa fa-trash-o "></i>

									</a></td>
								</tr>
								<tr>
									<td><div class="checkbox-custom">
											<input type="checkbox" id="checkbox3" name="checkbox3"
												value="option3"> <label for="checkbox3">
												2015-06-06</label>
										</div></td>
									<td>亲爱的周杰伦，您的奖学金已经到账...</td>
									<td><a class="btn btn-info" href="table.html#"> <i
											class="fa fa-eye "></i>
									</a> <a class="btn btn-danger" href="table.html#"> <i
											class="fa fa-trash-o "></i>

									</a></td>
								</tr>
								<tr>
									<td><div class="checkbox-custom">
											<input type="checkbox" id="checkbox4" name="checkbox4"
												value="option4"> <label for="checkbox4">
												2015-06-06</label>
										</div></td>
									<td>亲爱的周杰伦，您的奖学金已经到账...</td>
									<td><a class="btn btn-info" href="table.html#"> <i
											class="fa fa-eye "></i>
									</a> <a class="btn btn-danger" href="table.html#"> <i
											class="fa fa-trash-o "></i>

									</a></td>
								</tr>
								<tr>
									<td><div class="checkbox-custom">
											<input type="checkbox" id="checkbox4" name="checkbox4"
												value="option4"> <label for="checkbox4">
												2015-06-06</label>
										</div></td>
									<td>亲爱的周杰伦，欢迎使用本系统！...</td>
									<td><a class="btn btn-info" href="table.html#"> <i
											class="fa fa-eye "></i>
									</a> <a class="btn btn-danger" href="table.html#"> <i
											class="fa fa-trash-o "></i>

									</a></td>
								</tr>
								<tr>
									<td><div class="checkbox-custom">
											<input type="checkbox" id="checkbox4" name="checkbox4"
												value="option4"> <label for="checkbox4">
												2015-06-06</label>
										</div></td>
									<td>密码初始化为123456，请尽快修改您的...</td>
									<td><a class="btn btn-info" href="table.html#"> <i
											class="fa fa-eye "></i>
									</a> <a class="btn btn-danger" href="table.html#"> <i
											class="fa fa-trash-o "></i>

									</a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row col-md-8 col-md-offset-2">
					<div class="col-md-2 bk-margin-top-10">
						<button class="btn btn-sm btn-danger"><i class="fa fa-trash-o"></i>一键删除</button>
					</div>
					<div
						class="btn-group  bk-margin-top-10 pull-right">
						<button class="btn btn-sm btn-default">1</button>
						<button class="btn btn-sm btn-default">
							<span class="fa fa-chevron-left"></span>
						</button>
						<button class="btn btn-sm btn-default" style="color: red">3</button>
						<button class="btn btn-sm btn-default">
							<span class="fa fa-chevron-right"></span>
						</button>
						<button class="btn btn-sm btn-default">10</button>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>