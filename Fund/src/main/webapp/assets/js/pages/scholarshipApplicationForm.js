
$(document).ready(function(){
	$(".text-proName-check").blur(function(){
		if($.trim($(".text-proName-land").val())==""){
			$(".span-proName-info").html("学院名称不能为空！");
		}
		if($.trim($(".text-proName-land").val())!=""){
			$(".span-proName-info").html("");
		}  
	});
});

$(document).ready(function(){
	$(".text-proPer-check").blur(function(){
		if($.trim($(".text-proPer-land").val())==""){
			$(".span-proPer-info").html("学历不能为空！");
		}
		if($.trim($(".text-proPer-land").val())!=""){
			$(".span-proPer-info").html("");
		}  
	});
});

$(document).ready(function(){
	$(".text-donMon-check").blur(function(){
		if($.trim($(".text-donMon-land").val())==""){
			$(".span-donMon-info").html("专业不能为空！");
		}
		if($.trim($(".text-donMon-land").val())!=""){
			$(".span-donMon-info").html("");
		}  
	});
});
$(document).ready(function(){
	$(".text-donTime-check").blur(function(){
		if($.trim($(".text-donTime-land").val())==""){
			$(".span-donTime-info").html("班级不能为空！");
		}
		if($.trim($(".text-donTime-land").val())!=""){
			$(".span-donTime-info").html("");
		}  
	});
});

$(document).ready(function(){
	$(".text-eachYearMon-check").blur(function(){
		if($.trim($(".text-eachYearMon-land").val())==""){
			$(".span-eachYearMon-info").html("姓名不能为空！");
		}
		if($.trim($(".text-eachYearMon-land").val())!=""){
			$(".span-eachYearMon-info").html("");
		}  
	});
});

$(document).ready(function(){
	    //显示生日时间控件
	    $('.birthday_date').Zebra_DatePicker().css("cursor","pointer");
});
	 
$(document).ready(function(){
	$(".text-beneUnit-check").blur(function(){
		if($.trim($(".text-beneUnit-land").val())==""){
			$(".span-beneUnit-info").html("民族不能为空！");
		}
		if($.trim($(".text-beneUnit-land").val())!=""){
			$(".span-beneUnit-info").html("");
		}  
	});
});

/*$(document).ready(function(){
	$(".text-proLinkman-check").blur(function(){
		if($.trim($(".text-proLinkman-land").val())==""){
			$(".span-proLinkman-info").html("政治面貌不能为空！");
		}
		if($.trim($(".text-proLinkman-land").val())!=""){
			$(".span-proLinkman-info").html("");
		}  
	});
});*/

$(document).ready(function(){
	$(".text-donName-check").blur(function(){
		if($.trim($(".text-donName-land").val())==""){
			$(".span-donName-info").html("智育成绩不能为空！");
		}
		if($.trim($(".text-donName-land").val())!=""){
			$(".span-donName-info").html("");
		}  
	});
});

$(document).ready(function(){
	$(".text-birthday-check").blur(function(){
		if($.trim($(".text-birthday-land").val())==""){
			$(".span-birthday-info").html("综合测评等级不能为空！");
		}
		if($.trim($(".text-birthday-land").val())!=""){
			$(".span-birthday-info").html("");
		}  
	}); 
});

$(document).ready(function(){
	$(".text-donUnitName-check").blur(function(){
		if($.trim($(".text-donUnitName-land").val())==""){
			$(".span-donUnitName-info").html("家庭住址不能为空！");
		}
		if($.trim($(".text-donUnitName-land").val())!=""){
			$(".span-donUnitName-info").html("");
		}  
	});
});



$(document).ready(function(){
	$(".text-beneMobPho-check").blur(function(){
		if($.trim($(".text-beneMobPho-land").val())==""){
		
			$(".span-beneMobPho-info").html("联系电话不能为空！");
		}
		if((!$.trim($(".text-beneMobPho-land").val()).match(/^1[3|4|5|8][0-9]{9}$/))&&
				($.trim($(".text-beneMobPho-land").val()))!=""){
		
			$(".span-beneMobPho-info").html("联系电话号码格式不对！");
		}
		if(($.trim($(".text-beneMobPho-land").val())!="")&&
				($.trim($(".text-beneMobPho-land").val()).match(/^1[3|4|5|8][0-9]{9}$/))){
			$(".span-beneMobPho-info").html("");
		}
	});
});

$(document).ready(function(){
	$(".text-beneLinEm-check").blur(function(){
		if($.trim($(".text-beneLinEm-land").val())==""){
			
			$(".span-beneLinEm-info").html("邮箱不能为空！");
		}
		if((!$.trim($(".text-beneLinEm-land").val()).match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))&&
				($.trim($(".text-beneLinEm-land").val()))!=""){
			
			$(".span-beneLinEm-info").html("邮箱格式不对！");
		}
		if(($.trim($(".text-beneLinEm-land").val())!="")&&
				($.trim($(".text-beneLinEm-land").val()).match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))){
			$(".span-beneLinEm-info").html("");
		}
	});
});


$(document).ready(function(){
	$(".text-donUnitMobPho-check").blur(function(){
		if($.trim($(".text-donUnitMobPho-land").val())==""){
			
			$(".span-donUnitMobPho-info").html("学号不能为空！");
		}
		if((!$.trim($(".text-donUnitMobPho-land").val()).match(/^[0-9]{13}$/))&&
				($.trim($(".text-donUnitMobPho-land").val()))!=""){
			
			$(".span-donUnitMobPho-info").html("学号格式不对！");
		}
		if(($.trim($(".text-donUnitMobPho-land").val())!="")&&
				($.trim($(".text-donUnitMobPho-land").val()).match(/^[0-9]{13}$/))){
			$(".span-donUnitMobPho-info").html("");
		}
	});
});

















