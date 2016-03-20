<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    
<head>
        <title>武汉理工大学基金管理系统</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="shortcut icon" href="/Fund/assets/ico/whut.ico" type="image/x-icon" />
		<link rel="stylesheet" href="/Fund/static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/Fund/static/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="/Fund/static/css/matrix-login.css" />
        <link href="/Fund/static/font-awesome/css/font-awesome.css" rel="stylesheet"  />
		<link href='http://fonts.useso.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div id="loginbox">            
            <form id="loginform" class="form-vertical" >
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i><img height="35" src="/Fund/static/image/user.png" /></i></span><input type="text" name="username" id="username" placeholder="请输入用户名" >
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i><img height="35" src="/Fund/static/image/suo.png" /></i></span><input type="password"  name="password" id="password" placeholder="请输入密码" >
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lv"><i><img height="35" src="/Fund/static/image/yan.png" /></i></span><input type="text" name="authcode" id="authcode" placeholder="请输入验证码" >
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                         <img id="codeImg" title="点击更换" alt="验证码" src=""  />
	                    	<a class="" href="javascript:;" onclick="changeCode()" >点击换一张</a>
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-right"><a onclick="severCheck();" class="btn btn-success" id="to-recover" >登录</a></span>
                    
                </div>
            </form>
        </div>
        <script type="text/javascript" src="/Fund/static/js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="/Fund/static/js/jquery.tips.js"></script>
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
      //服务器校验
 		function severCheck(){
			if(check()){ 
				var datasent = $("#loginform").serializeObject();
				params = JSON.stringify(datasent); 
				$.ajax({
					type : 'post',
					url : '${pageContext.request.contextPath}/loginCheck.action',
					dataType : "json",
					contentType : "application/json;charset=utf-8",
					data : params,
					async : false,
					success: function(data){
						if(data.resultCode == 0){   //登录成功
							if(data.data.positionId==1){
								window.location.href="${pageContext.request.contextPath}/sysAdmin/index.action";
							}else if(data.data.positionId==2){
								window.location.href= "${pageContext.request.contextPath}/proExpand/index.action";
							}else if(data.data.positionId==3){
								window.location.href="${pageContext.request.contextPath}/proAdmin/index.action";
							}else if(data.data.positionId==4){
								window.location.href="${pageContext.request.contextPath}/fundAdmin/index.action";
							}else if(data.data.positionId==5){
								window.location.href= "${pageContext.request.contextPath}/benificiary/index.action";
							}else if(data.data.positionId==6){
								window.location.href= "${pageContext.request.contextPath}/foundation/index.action";
							}else if(data.data.positionId==7){
								window.location.href= "${pageContext.request.contextPath}/donor/index.action";
							}else if(data.data.positionId==8){
								window.location.href= "${pageContext.request.contextPath}/student/index.action";
							}else if(data.data.positionId==9){
								window.location.href= "${pageContext.request.contextPath}/teacher/index.action";
							}
						}
						else{
							changeCode();
							alert(data.resultMessage);
							
						}
					}
				});  
				
			}
		} 
	
		$(document).ready(function() {
			changeCode();
			$("#codeImg").bind("click", changeCode);
		});

		$(document).keyup(function(event) {
			if (event.keyCode == 13) {
				$("#to-recover").trigger("click");
			}
		});

		function genTimestamp() {
			var time = new Date();
			return time.getTime();
		}

		function changeCode() {
			$("#codeImg").attr("src", "code.action?t=" + genTimestamp());
		}

		//客户端校验
		function check() {

			if ($("#username").val() == "") {

				$("#username").tips({
					side : 2,
					msg : '用户名不得为空',
					bg : '#AE81FF',
					time : 3
				});

				$("#username").focus();
				return false;
			} else {
				$("#username").val(jQuery.trim($('#username').val()));
			}

			if ($("#password").val() == "") {

				$("#password").tips({
					side : 2,
					msg : '密码不得为空',
					bg : '#AE81FF',
					time : 3
				});

				$("#password").focus();
				return false;
			}
			if ($("#authcode").val() == "") {

				$("#authcode").tips({
					side : 1,
					msg : '验证码不得为空',
					bg : '#AE81FF',
					time : 3
				});

				$("#authcode").focus();
				return false;
			}

 			/* $("#loginbox").tips({
				side : 1,
				msg : '正在登录 , 请稍后 ...',
				bg : '#68B500',
				time : 10
			});
 */
			return true;
		}
        </script>

</body>
</html>


