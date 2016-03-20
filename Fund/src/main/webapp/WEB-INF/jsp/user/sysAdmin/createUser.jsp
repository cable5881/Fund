<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建账号</title>
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
					<li class="active"><i class="fa fa-user"></i>账号管理</li>
					<li class="active"><a href="${pageContext.request.contextPath}/sysAdmin/createAccount.action"><i class="fa fa-plus-circle"></i>创建账号</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>创建账号</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-plus-circle"></i>创建账号
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="panel panel-default col-md-6 col-md-offset-3 ">
					<div class="panel-body">
						<form id="accountForm" method="post" enctype="multipart/form-data"
							class="form-horizontal ">
							<div class="form-group">
								<label class="col-md-4 control-label" for="username">用户名</label>
								<div class="col-md-8">
									<input type="text" id="username" name="username" placeholder="请输入用户名"
										class="form-control text-userName-check text-userName-land">
									<span class="help-block span-userName-info" style="color: red"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="password">密码</label>
								<div class="col-md-8">
									<input type="text" id="password" name="password" placeholder="请输入密码"
										class="form-control text-password-check text-password-land">
									<span class="help-block span-password-info" style="color: red"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="realName">使用者</label>
								<div class="col-md-8">
									<input type="text" id="realName" name="realName" placeholder="请输入真实姓名"
										class="form-control text-user-check text-user-land">
									<span class="help-block span-user-info" style="color: red"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">权限</label>
								<div class="col-md-8">
									<select id="positionId" class="form-control" name="positionId">
										<option value="1">系统管理员</option>
										<option value="5">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
								</div>
							</div>
						</form>

						<div>
							<div class="col-md-3 col-md-offset-3" style="text-align: center">
								<input id="clearbutton" name="clearbutton" type="button" class="btn btn-warning"  value="重置">
							</div>
							<div class="col-md-3 " style="text-align: center">
								<input name="submitbutton" type="button" class="btn btn-success" onclick="submitAccount()" value="提交">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/pages/modifyAccount.js"></script>
	<script type="text/javascript">
		$.fn.serializeObject = function() {     
		    var o = {};     
		    var a = this.serializeArray();     
		    $.each(a, function() {     
		      if (o[this.name]) {     
		        if (!o[this.name].push) {     
		          o[this.name] = [ o[this.name] ];     
		        }     
		        o[this.name].push(this.value || '');     
		      } else {     
		        o[this.name] = this.value || '';     
		      }     
		    });     
		    return o;     
		}; 
		
		function submitAccount(){
			var datasent = $("#accountForm").serializeObject();
			params = JSON.stringify(datasent); 
			$.ajax({
				type:'post',
				url:'${pageContext.request.contextPath}/sysAdmin/createUser.action',
				dataType : "json",
				contentType : "application/json;charset=utf-8",
				data : params,
				success:function(data){
					if (data.resultCode == 0) {
						alert("创建用户失败！");
					} else if (data.resultCode == 1) {
						alert("创建用户成功");
						document.getElementById("password").value = "";
						document.getElementById("realName").value = "";
						document.getElementById("positionId").value = "";
						document.getElementById("username").value = "";
					} else if (data.resultCode == -1) {
						alert("该用户名已存在！");
						document.getElementById("username").value = "";
					} 
					}});
		}
		$("#clearbutton").click(function(){
			$("#username").val('');
			$("#password").val('');
			$("#realName").val('');
		})
	</script>
</body>
</html>