<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有账号</title>
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
					<li class="active"><a
						href="${pageContext.request.contextPath}/sysAdmin/allUsers.action"><i
							class="fa fa-users"></i>所有账号</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>所有账号</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-users"></i>所有账号
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class=" row">
					<div
						class="bk-bg-white row text-center form-group col-md-offset-3 col-md-6">
						<div class="btn-group">
							<c:choose>
								<c:when test="${empty level || level eq 1}">
									<a href="<c:url value='/sysAdmin/allUsers.action?level=1&pageNow=1'/>"><button type="button" class="btn btn-primary sysAdmin-button">系统管理员</button></a>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=2&pageNow=1'/>"><button type="button" class="btn btn-default admin-button">管理员</button></a>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=3&pageNow=1'/>"><button type="button" class="btn btn-default visitor-button">访客</button></a>
								</c:when>
								<c:when test="${level eq 2 }">
									<a href="<c:url value='/sysAdmin/allUsers.action?level=1&pageNow=1'/>"><button type="button" class="btn btn-default sysAdmin-button">系统管理员</button></a>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=2&pageNow=1'/>"><button type="button" class="btn btn-primary admin-button">管理员</button></a>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=3&pageNow=1'/>"><button type="button" class="btn btn-default visitor-button">访客</button></a>
								</c:when>
								<c:otherwise>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=1&pageNow=1'/>"><button type="button" class="btn btn-default sysAdmin-button">系统管理员</button></a>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=2&pageNow=1'/>"><button type="button" class="btn btn-default admin-button">管理员</button></a>
									<a href="<c:url value='/sysAdmin/allUsers.action?level=3&pageNow=1'/>"><button type="button" class="btn btn-primary visitor-button">访客</button></a>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
					<div class="text-center">
						<a
							href="${pageContext.request.contextPath}/sysAdmin/toCreateUser.action"><button
								type="button" class="btn btn-success">
								<i class="fa fa-plus-circle"></i> 创建账号
							</button></a>
					</div>

				</div>
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table
							class="table table-striped table-bordered bootstrap-datatable datatable text-center sysAdmin-table">
							<thead>
								<tr>
									<th class="text-center">用户名</th>
									<th class="text-center">权限</th>
									<th class="text-center">使用者</th>
									<th class="text-center">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${userList}" var="user" varStatus="status">
									<tr>
										<td>${user.username }</td>
										<td>${user.position.positionName}</td>
										<td>${user.realName }</td>
										<td>
											<a href="${pageContext.request.contextPath}/sysAdmin/toModifyUser.action?userId=${user.userId }">
												<button class="btn btn-warning fa fa-edit " title="修改"></button>
											</a> 			
											<button type="button" class="btn btn-danger fa fa-trash-o " title="删除" onclick="deleteUser(${user.userId})"></button>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row myPage">
					<imaw:page url="${pageContext.request.contextPath }/sysAdmin/allUsers.action?level=${level }"/>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function deleteUser(uId){
			var flag = confirm('您确定要删除该用户吗？');
			if(flag){
				$.ajax({
		             type: "POST",
		             url: "${pageContext.request.contextPath}/sysAdmin/deleteUser.action",
		             data: 'userId=' + uId,
		             dataType: "json",
		             success: function(data){
		            	 if(data.resultCode == 1){
		            		 history.go(0);
		            	 }else if(data.resultCode == 0){
		            		 alert(data.resultMessage);
		            	 }
		             }
		         });
			}
		}
	</script>
</body>
</html>