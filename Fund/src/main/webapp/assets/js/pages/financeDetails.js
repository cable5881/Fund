$(document).ready(function(){
	$('.date').Zebra_DatePicker().css("cursor","pointer");
	
	$(".text-financeNum-check").blur(function(){
		if($.trim($(".text-financeNum-land").val())==""){
		
			$(".span-financeNum-land").html("财务项目编号不能为空！");
		}
		if((!$.trim($(".text-financeNum-land").val()).match(/\d{3}-\d{6}/))&&
				($.trim($(".text-financeNum-land").val()))!=""){
		
			$(".span-financeNum-land").html("财务项目编号格式不对！");
		}
		if(($.trim($(".text-financeNum-land").val())!="")&&
				($.trim($(".text-financeNum-land").val()).match(/\d{3}-\d{6}/))){
			$(".span-financeNum-land").html("");
		}
	});
	
	$(".text-payUnit-check").blur(function(){
		if($.trim($(".text-payUnit-land").val())==""){
			$(".span-payUnit-land").html("付款单位不能为空！");
		}
		if($.trim($(".text-payUnit-land").val())!=""){
			$(".span-payUnit-land").html("");
		}  
	});
	
	$(".text-getMoney-check").blur(function(){
		if($.trim($(".text-getMoney-land").val())==""){
			$(".span-getMoney-land").html("金额不能为空！");
		}
		if($.trim($(".text-getMoney-land").val())!=""){
			$(".span-getMoney-land").html("");
		}   
	});
	
	$(".text-payMoney-check").blur(function(){
		if($.trim($(".text-payMoney-land").val())==""){
			$(".span-payMoney-land").html("金额不能为空！");
		}
		if($.trim($(".text-payMoney-land").val())!=""){
			$(".span-payMoney-land").html("");
		}  
	});
});