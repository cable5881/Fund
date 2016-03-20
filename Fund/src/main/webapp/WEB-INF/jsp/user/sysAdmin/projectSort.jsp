<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>项目分类</title>
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
					<li class="active"><i class="fa fa-list-alt"></i>项目管理</li>
					<li class="active"><a href="${pageContext.request.contextPath}/sysAdmin/projectSort.action"><i
							class="fa fa-sort-amount-asc"></i>项目分类</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>项目分类</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-sort-amount-asc"></i>项目分类
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="panel panel-default col-md-8 col-md-offset-2 ">
						<div class="panel-body">
							<div class="col-md-12">
								<div class="col-md-6">
									<h4 style="color: red; font-weight: bold">学生培养项目</h4>
									<ul class="bulletList">
										<li class="red"><span class="title">奖学金</span></li>
										<li class="green"><span class="title">助学金</span></li>
										<li class="blue"><span class="title">爱心援助基金</span></li>
										<li class="orange"><span class="title">名师名导基金</span></li>
										<li class="red"><span class="title">创新实践基金</span></li>
										<li class="green"><span class="title">校园文化活动基金</span></li>
									</ul>
								</div>
								<div class="col-md-6">
									<h4 style="color: red; font-weight: bold">教师发展项目</h4>
									<ul class="bulletList">
										<li class="red"><span class="title">奖教金</span></li>
										<li class="green"><span class="title">优秀辅导员培养基金</span></li>
										<li class="blue"><span class="title">创业教育发展基金</span></li>
										<li class="orange"><span class="title">科研、著作出版基金</span></li>
									</ul>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-6">
									<h4 style="color: red; font-weight: bold">校园建设项目</h4>
									<ul class="bulletList">
										<li class="red"><span class="title">老建筑修缮基金</span></li>
										<li class="green"><span class="title">老设施建设基金</span></li>
										<li class="blue"><span class="title">图书基金</span></li>
									</ul>
								</div>
								<div class="col-md-6">
									<h4 style="color: red; font-weight: bold">学校发展基金</h4>
									<ul class="bulletList">
										<li class="red"><span class="title">校友年度捐赠</span></li>
										<li class="green"><span class="title">毕业生“一卡通”在线捐赠</span>
										</li>
										<li class="blue"><span class="title">非限定用途的小额捐赠</span></li>
										<li class="orange"><span class="title">非限定用途的大额捐赠</span>
										</li>
									</ul>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-6">
									<h4 style="color: red; font-weight: bold">其他专项基金</h4>
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