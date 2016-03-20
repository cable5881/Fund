<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="../Model.jsp" %>
<title>申请奖教金</title>
</head>
<body>
<%@ include file="masterPage.jsp" %>
	<!-- Main Page -->
				<div class="main ">
					<!-- Page Header -->
					<div class="page-header">
						<div class="pull-left">
							<ol class="breadcrumb visible-sm visible-md visible-lg">
								<li class="active"><i class="fa fa-folder"></i>申请奖教金</li>							
							</ol>						
						</div>
						<div class="pull-right">
							<h2>申请奖教金</h2>
						</div>					
					</div>
					<!-- End Page Header -->
					<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
						<div class="panel-heading bk-bg-primary">
							<h6><i class="fa fa-paperclip"></i>申请列表</h6>
							<div class="panel-actions">
								<a href="#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
					<!-- Search Form -->					
						<label>请输入关键字：</label>
							<input type="text" class="form-control" name="q" id="q" placeholder="查找...">
								<button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
							<!-- <div class="row"> -->		
									<div class="table-responsive">	
										<table class="table table-striped table-bordered bootstrap-datatable datatable">
											<thead>
												<tr>
													<th>日期</th>
													<th>奖助学金</th>
													<th>状态</th>
													<th>申请</th>
												</tr>
											</thead>   
											<tbody>								
												<tr>
													<td>2014.01.02</td>
													<td>******奖教金</td>
													<td>未申请</td>
													<td>
														<a class="btn btn-info" href="table.html#">
															<i class="fa fa-edit "></i>                                            
														</a>
													</td>
												</tr>
												<tr>
													<td>2014.06.22</td>
													<td>******奖教金</td>
													<td>未申请</td>
													<td>
														<a class="btn btn-info" href="table.html#">
															<i class="fa fa-edit "></i>                                            
														</a>
													</td>
												</tr>
												<tr>
													<td>2015.04.18</td>
													<td>******奖教金</td>
													<td>未申请</td>
													<td>
														<a class="btn btn-info" href="table.html#">
															<i class="fa fa-edit "></i>                                            
														</a>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
						</div>
					</div>
				</div>
</body>
</html>