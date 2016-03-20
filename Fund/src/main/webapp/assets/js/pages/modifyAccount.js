$(document).ready(function(){
	$(".text-userName-check").blur(function(){
		if($.trim($(".text-userName-land").val())==""){
			$(".span-userName-info").html("用户名不能为空！");
		}
		if($.trim($(".text-userName-land").val())!=""){
			$(".span-userName-info").html("");
		}  
	});
	
	$(".text-user-check").blur(function(){
		if($.trim($(".text-user-land").val())==""){
			$(".span-user-info").html("使用者不能为空！");
		}
		if($.trim($(".text-user-land").val())!=""){
			$(".span-user-info").html("");
		}  
	});
	
	$(".text-password-check").blur(function(){
		if($.trim($(".text-password-land").val())==""){
			$(".span-password-info").html("密码不能为空！");
		}
		if($.trim($(".text-password-land").val())!=""){
			$(".span-password-info").html("");
		}  
	});
});

function submitModifyUserCheck(){
	if($.trim($(".text-userName-land").val())==""){
		$(".span-userName-info").html("用户名不能为空！");
		return false;
	}
	if($.trim($(".text-user-land").val())==""){
		$(".span-user-info").html("使用者不能为空！");
		return false;
	}
	if($.trim($(".text-password-land").val())==""){
		$(".span-password-info").html("密码不能为空！");
		return false;
	}
	return true;
}