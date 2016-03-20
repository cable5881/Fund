<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有申请表</title>
<jsp:include page="../Model.jsp"></jsp:include>
<script type="text/javascript" src="/Funds/assets/js/pages/applicationForms.js"></script>
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
				</ol>
			</div>
			<div class="pull-right">
				<h2>所有申请表</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-list"></i>所有申请表
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="row text-center">
					<h4 style="font-weight: bold;">【学生培养项目】武汉理工大学管理学院（奖学金）</h4>
				</div>
				<div class="bk-bg-white row text-center">
					<div class="btn-group">
						<button type="button" class="btn btn-primary unverified-button">未审核</button>
						<button type="button" class="btn btn-default verified-button">已审核</button>
					</div>
				</div>
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center unverified-table">
							<thead>
								<tr>
									<th>序号</th>
									<th>学院</th>
									<th>班级</th>
									<th>姓名</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>申请表1</td>
									<td>管理学院</td>
									<td>【信管】1301</td>
									<td>周杰伦</td>
									<td><label class="label label-warning">未审核</label></td>
									<td><a href="#"><button
												class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
								<tr>
									<td>申请表2</td>
									<td>管理学院</td>
									<td>【信管】1302</td>
									<td>刘德华</td>
									<td><label class="label label-warning">未审核</label></td>
									<td><a href="#"><button class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
								<tr>
									<td>申请表3</td>
									<td>管理学院</td>
									<td>【信管】1301</td>
									<td>陈奕迅</td>
									<td><label class="label label-warning">未审核</label></td>
									<td><a href="#"><button class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
								<tr>
									<td>申请表4</td>
									<td>管理学院</td>
									<td>【信管】1303</td>
									<td>吴彦祖</td>
									<td><label class="label label-warning">未审核</label></td>
									<td><a href="#"><button class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
							</tbody>
						</table>
						
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center verified-table">
							<thead>
								<tr>
									<th>序号</th>
									<th>学院</th>
									<th>班级</th>
									<th>姓名</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>申请表1</td>
									<td>管理学院</td>
									<td>【信管】1301</td>
									<td>周杰伦</td>
									<td ><span class="label label-success">已通过</span></td>
									<td><a href="#"><button
												class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
								<tr>
									<td>申请表2</td>
									<td>管理学院</td>
									<td>【信管】1302</td>
									<td>刘德华</td>
									<td><label class="label label-danger">未通过</label></td>
									<td><a href="#"><button class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
								<tr>
									<td>申请表3</td>
									<td>管理学院</td>
									<td>【信管】1301</td>
									<td>陈奕迅</td>
									<td ><span class="label label-success">已通过</span></td>
									<td><a href="#"><button class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
								<tr>
									<td>申请表4</td>
									<td>管理学院</td>
									<td>【信管】1303</td>
									<td>吴彦祖</td>
									<td><label class="label label-danger">未审核</label></td>
									<td><a href="#"><button class="btn btn-info fa fa-eye">查看</button></a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row col-md-8 col-md-offset-2">
					<div
						class="btn-group bk-margin-bottom-10 bk-margin-top-10 pull-right">
						<button type="button" class="btn btn-sm btn-primary ">1</button>
							<a class="btn btn-info" href="#"> <i
								class="fa fa-chevron-left "></i>
							</a>
							<button type="button" class="btn btn-sm btn-info " style="color: red;" disabled="disabled">3</button>
							<a class="btn btn-info" href="#"> <i
								class="fa fa-chevron-right "></i>
							</a>
							<button type="button" class="btn btn-sm btn-primary ">10</button>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>