<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<jsp:include page="../Model.jsp"></jsp:include>
<script type="text/javascript" src="/Fund/assets/js/pages/changePwd.js"></script>
<script type="text/javascript">
function submitPwd(){
	var oldPwd = $("#oldPwd").val();
	var newPwd = $("#newPwd").val();
	var reNewPwd = $("#reNewPwd").val();
	var authCode = $("#authCode").val();
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/modifyPwd.action',
		data:'oldPwd='+oldPwd+'&newPwd='+newPwd+'&reNewPwd='+reNewPwd+'&authCode='+authCode,
		success:function(data){
			if (data.resultCode == 0) {
				alert("密码错误");
				document.getElementById("oldPwd").value = "";
			} else if (data.resultCode == 1) {
				alert("密码修改成功");
			} else if (data.resultCode == 2) {
				alert("两次密码不一致");
				document.getElementById("newPwd").value = "";
				document.getElementById("reNewPwd").value = "";
			} else if (data.resultCode == 3) {
				alert("验证码错误");
				document.getElementById("authCode").value = "";
			}
				changeCode();
			}});
}
$(document).ready(function() {
	changeCode();
	$("#codeImg").bind("click", changeCode);
});

function genTimestamp() {
	var time = new Date();
	return time.getTime();
}

function changeCode() {
	$("#codeImg").attr("src", "${pageContext.request.contextPath}/code.action?t=" + genTimestamp());
}
</script>
<style type="text/css">
	.center {  
  height:35%;
  width:5%;
  margin-top: 25px;
  overflow:hidden;
  position: absolute;  
 /*  top: 0; left: 0; bottom: 0; right: 0;   */
} 
</style>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
				<div class="main ">
					<!-- Page Header -->
					<div class="page-header">
						<div class="pull-left">
							<ol class="breadcrumb visible-sm visible-md visible-lg">
								<li class="active"><a href="changePwd"><i class="fa fa-wrench"></i>修改密码</a></li>
							</ol>						
						</div>
						<div class="pull-right">
							<h2>修改密码</h2>
						</div>					
					</div>
					<!-- End Page Header -->
					<div class="panel bk-bg-white bk-margin-bottom-20">
						<div class="panel-heading bk-bg-primary">
							<h6><i class="fa fa-wrench"></i>修改密码</h6>
							<div class="panel-actions">								
								<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="panel panel-default col-lg-6 col-lg-offset-3 "  >
									<div class="panel-body">
										<table class="table ">
											<tr >
												<td class="col-lg-3 text-right ">旧密码：</td>
												<td class="col-lg-4 "><input id="oldPwd" type="password" name="oldPwd"  class="text-oldPwd-check text-oldPwd-land"></td>
												<td class="td-oldPwd-info" style="color: red"></td>
											</tr>
											<tr>
												<td class="text-right">新密码：</td>
												<td><input id="newPwd" type="password" name="newPwd" class="text-newPwd-check text-newPwd-land"></td>
												<td class="td-newPwd-info" style="color: red"></td>
											</tr>
											<tr>
												<td class="text-right">确认新密码：</td>
												<td><input id="reNewPwd" type="password" name="reNewPwd" class="text-reNewPwd-check text-reNewPwd-land"></td>
												<td class="td-reNewPwd-info" style="color: red"></td>
											</tr>
											<tr>
												<td class="text-right">验证码：</td>
												<td >
													<input id="authCode" type="text" name="authCode" class="col-md-6 text-veriCode-check text-veriCode-land" >
													<img id="codeImg" title="点击更换" alt="验证码" src=""  />
												</td>
												<td class="td-veriCode-info" style="color: red"></td>
											</tr>
										</table>
										<div class="text-center">
											<input type="button" name="bt1" value="提交" class="btn btn-primary hidden-xs btn-setting" onclick="submitPwd()">
										</div>
									</div>
								</div>
														
					
						</div>
					</div>			
				</div>
				<!-- End Main Page -->
				
				<!-- Modal Dialog -->
		<!-- <div class="modal fade" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title bk-fg-primary">提示信息</h4>
					</div>
					<div class="modal-body">
						<p class="bk-fg-danger">密码修改成功</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">确定</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
				</div>
			</div>
		</div> -->
		<!-- End Modal Dialog -->	
	</div>
			
</body>
</html>