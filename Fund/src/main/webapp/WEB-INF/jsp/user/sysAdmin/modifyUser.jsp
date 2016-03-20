<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改账号</title>
<jsp:include page="../Model.jsp"></jsp:include>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><i class="fa fa-user"></i>账号管理</li>
					<li class="active"><a href="#"><i class="fa fa-users"></i>所有账号</a></li>
					<li class="active"><a href="#"><i class="fa fa-pencil"></i>修改账号</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>修改账号</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-pencil"></i>修改账号
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="panel panel-default col-md-6 col-md-offset-3 ">
					<div class="panel-body">
						<form id="modifyUserForm" class="form-horizontal ">
							<input id="userId" type="hidden" value="${oldUser.userId }" name="userId" >
							<div class="form-group">
								<label class="col-md-4 control-label" for="username">用户名</label>
								<div class="col-md-8">
									<input type="text" id="username" name="username" value="${oldUser.username }"
										class="form-control text-userName-check text-userName-land">
									<span class="help-block span-userName-info" style="color: red"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="password">密码</label>
								<div class="col-md-8">
									<input type="text" id="password" name="password"
										class="form-control text-password-check text-password-land">
									<span class="help-block span-password-info" style="color: red"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label">权限</label>
								<div class="col-md-8">
									<c:choose>
									<c:when test="${oldUser.positionId eq 1 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1" selected="selected">系统管理员</option>
										<option value="5">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
									</c:when>
									<c:when test="${oldUser.positionId eq 2 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1">系统管理员</option>
										<option value="5">管理员-受益方</option>
										<option value="2" selected="selected">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
									</c:when>
									<c:when test="${oldUser.positionId eq 3 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1">系统管理员</option>
										<option value="5">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3" selected="selected">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
									</c:when>
									<c:when test="${oldUser.positionId eq 4 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1">系统管理员</option>
										<option value="5">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4" selected="selected">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
									</c:when>
									<c:when test="${oldUser.positionId eq 5 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1">系统管理员</option>
										<option value="5" selected="selected">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
									</c:when>
									<c:when test="${oldUser.positionId eq 6 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1">系统管理员</option>
										<option value="5">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6" selected="selected">访客-基金会</option>
										<option value="7">访客-捐赠方</option>
									</select>
									</c:when>
									<c:when test="${oldUser.positionId eq 7 }">
									<select id="positionId" class="form-control" name="positionId" >
										<option value="1">系统管理员</option>
										<option value="5" selected="selected">管理员-受益方</option>
										<option value="2">管理员-项目拓展</option>
										<option value="4">管理员-财务管理</option>
										<option value="3">管理员-项目管理</option>
										<option value="6">访客-基金会</option>
										<option value="7" selected="selected">访客-捐赠方</option>
									</select>
									</c:when>
									</c:choose>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="realName">使用者</label>
								<div class="col-md-8">
									<input type="text" id="realName" name="realName" value="${oldUser.realName }"
										class="form-control text-user-check text-user-land">
									<span class="help-block span-user-info" style="color: red"></span>
								</div>
							</div>
						</form>
						<div>
							<div class="col-md-3 col-md-offset-3" style="text-align: center">
								<a href="${pageContext.request.contextPath}/sysAdmin/allUsers.action"><button type="button" class="btn btn-warning">
									<i class="fa fa-ban"></i> 取消
								</button></a>
							</div>
							<div class="col-md-3 " style="text-align: center">
								<button type="button" class="btn btn-success" onclick="modifyUser()">
									<i class="fa fa-check-circle"></i> 提交
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/pages/modifyAccount.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/pages/serializeObject.js"></script>
	<script type="text/javascript">
		function modifyUser(){
			if(submitModifyUserCheck()){
				var datasent = $("#modifyUserForm").serializeObject();
				params = JSON.stringify(datasent); 
				$.ajax({
					type:'post',
					url:'${pageContext.request.contextPath}/sysAdmin/modifyUser.action',
					dataType : "json",
					contentType : "application/json;charset=utf-8",
					data : params,
					success:function(data){
						if (data.resultCode == 0) {
							alert(data.resultMessage);
						}else if (data.resultCode == 1) {
							alert("账号修改成功！");
							window.location = "${pageContext.request.contextPath}/sysAdmin/allUsers.action?level=1";
						} 
					}
				});
			}
		}
	</script>
</body>
</html>