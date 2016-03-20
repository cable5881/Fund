var t = 0;
var num;
function mycheck() {
	if ($.trim($(".text-proName-land").val()) == "") {
		t=0;
		$(".span-proName-info").html("学院名称不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-proPer-land").val()) == "") {
		t=0;
		$(".span-proPer-info").html("学历不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-donMon-land").val()) == "") {
		t=0;
		$(".span-donMon-info").html("专业不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-donTime-land").val()) == "") {
		t=0;
		$(".span-donTime-info").html("班级不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-eachYearMon-land").val()) == "") {
		t=0;
		$(".span-eachYearMon-info").html("姓名不能为空！");
		return;
	}
	else {
		t=1;
	}
	
	if ((num = boxcheck("scindivinfo.scSex")) > 0) {
		t = 1;
	} else {
		t = 0;
		return;
	}

	if ($.trim($(".text-beneUnit-land").val()) == "") {
		t=0;
		$(".span-beneUnit-info").html("民族不能为空！");
		return;
	}
	else {
		t=1;
	}

	/*if ($.trim($(".text-proLinkman-land").val()) == "") {
		t=0;
		$(".span-proLinkman-info").html("政治面貌不能为空！");
		return;
	}
	else {
		t=1;
	}*/

	if ($.trim($(".text-donName-land").val()) == "") {
		t=0;
		$(".span-donName-info").html("智育成绩不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-birthday-land").val()) == "") {
		t=0;
		$(".span-birthday-info").html("综合测评等级不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-donUnitName-land").val()) == "") {
		t=0;
		$(".span-donUnitName-info").html("家庭住址不能为空！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-beneMobPho-land").val()) == "") {
		t=0;
		$(".span-beneMobPho-info").html("联系电话不能为空！");
		return;
	}
	else if ((!$.trim($(".text-beneMobPho-land").val())
			.match(/^1[3|4|5|8][0-9]{9}$/))
			&& ($.trim($(".text-beneMobPho-land").val())) != "") {
		t=0;
		$(".span-beneMobPho-info").html("联系电话号码格式不对！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-beneLinEm-land").val()) == "") {
		t=0;
		$(".span-beneLinEm-info").html("邮箱不能为空！");
		return;
	}
	else if ((!$.trim($(".text-beneLinEm-land").val()).match(
			/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
			&& ($.trim($(".text-beneLinEm-land").val())) != "") {
		t=0;
		$(".span-beneLinEm-info").html("邮箱格式不对！");
		return;
	}
	else {
		t=1;
	}

	if ($.trim($(".text-donUnitMobPho-land").val()) == "") {

		t=0;
		$(".span-donUnitMobPho-info").html("学号不能为空！");
		return;
		
	}
	else if ((!$.trim($(".text-donUnitMobPho-land").val()).match(/^[0-9]{13}$/))
			&& ($.trim($(".text-donUnitMobPho-land").val())) != "") {

		t=0;
		$(".span-donUnitMobPho-info").html("学号格式不对！");
		return;
	}
	else {
		t=1;
	}

}

function boxcheck(checkName) {
	var n = 0;
	$("[name='" + checkName + "']").each(function() {
		if ($(this)[0].checked) {
			++n;
		}
	});
	return n;
}

function check() {
	mycheck();
	if (t == 0) {
		alert("奖学金申请表的信息没有完善，请您先完善申请表！");
		return false;
	}
	return true;

}
