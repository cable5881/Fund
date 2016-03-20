var t = 0;
var num = 0;
function mycheckIn() {
	if ($.trim($(".text-financeNum-land").val()) == "") {
		t = 0;
		$(".span-financeNum-land").html("财务项目编号不能为空！");
		return;
	} else if ((!$.trim($(".text-financeNum-land").val()).match(
			/\d{3}-\d{6}/))
			&& ($.trim($(".text-financeNum-land").val())) != "") {
		t = 0;
		$(".span-financeNum-land").html("财务项目编号格式不对！");
		return;
	} else {
		t = 1;
	}
	
	if ($.trim($(".text-payUnit-land").val()) == "") {
		t = 0;
		$(".span-payUnit-land").html("付款单位不能为空！");
		return;
	} else {
		t = 1;
	}
	
	if ($.trim($(".text-getMoney-land").val()) == "") {
		t = 0;
		$(".span-getMoney-land").html("金额不能为空！");
		return;
	} else {
		t = 1;
	}
}

function mycheckOut() {
	
	if ($.trim($(".text-payMoney-land").val()) == "") {
		t = 0;
		$(".span-payMoney-land").html("金额不能为空！");
		return;
	} else {
		t = 1;
	}
}

$(".buttonIn").click(function() {
	mycheckIn();
	if (t == 0) {
		alert("到款信息没有完善，请您先完善相关信息！");
		return false;
	}
	return true;

})

$(".buttonOut").click(function() {
	mycheckOut();
	if (t == 0) {
		alert("发放信息没有完善，请您先完善相关信息！");
		return false;
	}
	return true;

})


