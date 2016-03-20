var t = 0;
var num = 0;
function div1Check() {

	if ($.trim($(".text-proName-land").val()) == "") {
		t = 0;
		$(".span-proName-info").html("捐赠项目名称不能为空！");
		return;

	} else {
		t = 1;
	}

	if ($.trim($(".text-proPer-land").val()) == "") {
		t = 0;
		$(".span-proPer-info").html("项目负责人不能为空！");
		return;
	} else {
		t = 1;
	}

	/*
	 * if ((num = boxcheck("donationMode.realEstate")) > 0) { t = 1; } else { t =
	 * 0; return; }
	 */

	/*if ((num = boxcheck("donationMode.form")) > 0) {
		t = 1;
	} else {
		t = 0;
		return;
	}*/

	if ($(".radio-OneTime").attr("checked") == "checked") {
		if ($.trim($(".text-donMon-land").val()) == "") {
			t = 0;
			$(".span-donMon-info").html("捐赠金额不能为空！");
			return;
		} else {
			t = 1;
		}

		if ($.trim($(".text-donTime-land").val()) == "") {
			t = 0;
			return;
		} else {
			t = 1;
		}
	}

	else if ($(".radio-MoreTime").attr("checked") == "checked") {
		if ($.trim($(".text-eachYearMon-land").val()) == "") {
			t = 0;
			$(".span-eachYearMon-info").html("年度捐赠金额不能为空！");
			return;
		} else {
			t = 1;
		}
		if ($.trim($(".text-staTime-land").val()) == "") {
			t = 0;
			$(".span-staTime-info").html("开始时间不能为空！");
			return;
		} else {
			t = 1;
		}
		if ($.trim($(".text-year-land").val()) == "") {
			t = 0;
			$(".span-year-info").html("年限不能为空！");
			return;
		} else {
			t = 1;
		}
	}

	else {
		t = 0;
		return;
	}

	if ($.trim($(".text-moneyPrincipal-land").val()) == "") {
		t = 0;
		$(".span-moneyPrincipal-info").html("项目经费负责人不能为空！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-beneUnit-land").val()) == "") {
		t = 0;
		$(".span-beneUnit-info").html("受益单位不能为空！");
		return;
	} else {
		t = 1;
	}

}

function div2Check() {
	if ($.trim($(".text-proLinkman-land").val()) == "") {
		t = 0;
		$(".span-proLinkman-info").html("项目联系人不能为空！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-benePhone-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-benePhone-land").val()).match(
			/^\d{3}-\d{8}|\d{4}-\d{7}$/))
			&& ($.trim($(".text-benePhone-land").val())) != "") {

		t = 0;
		$(".span-benePhone-info").html("电话号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-beneFax-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-beneFax-land").val()).match(
			/^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))
			&& ($.trim($(".text-beneFax-land").val())) != "") {

		t = 0;
		$(".span-beneFax-info").html("传真号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-beneMobPho-land").val()) == "") {
		t = 0;
		$(".span-beneMobPho-info").html("手机不能为空！");
		return;
	} else if ((!$.trim($(".text-beneMobPho-land").val()).match(
			/^1[3|4|5|8][0-9]{9}$/))
			&& ($.trim($(".text-beneMobPho-land").val())) != "") {

		t = 0;
		$(".span-beneMobPho-info").html("手机号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-beneLinEm-land").val()) == "") {

		t = 0;
		$(".span-beneLinEm-info").html("邮箱不能为空！");
		return;
	} else if ((!$.trim($(".text-beneLinEm-land").val()).match(
			/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
			&& ($.trim($(".text-beneLinEm-land").val())) != "") {

		t = 0;
		$(".span-beneLinEm-info").html("邮箱格式不对！");
		return;
	} else {
		t = 1;
	}
}

function div3Check() {
	// if ($(".personal").attr("checked") == "checked") {
	if ($.trim($(".text-donName-land").val()) == "") {
		t = 0;
		$(".span-donName-info").html("捐赠人姓名不能为空！");
		return;
	} else {
		t = 1;
	}

	if ((num = boxcheck("donor.dSex")) > 0) {
		t = 1;
	} else {
		t = 0;
		return;
	}

	if ($.trim($(".text-birthday-land").val()) == "") {
		t = 0;
		$(".span-birthday-info").html("出生日期不能为空！")
		return;
	} else {
		t = 1;
	}

	if ($(".radio-Sch").attr("checked") == "checked") {
		if ($.trim($(".text-graTime-land").val()) == "") {
			t = 0;
			$(".span-graTime-info").html("毕业时间和年份不能为空！");
			return;
		} else {
			t = 1;
		}
	} else if ($(".radio-NoSch").attr("checked") == "checked") {
		t = 1;
	} else {
		t = 0;
		return;
	}

	if ($.trim($(".text-perMobPho-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-perMobPho-land").val()).match(
			/^1[3|4|5|8][0-9]{9}$/))
			&& ($.trim($(".text-perMobPho-land").val())) != "") {

		t = 0;
		$(".span-perMobPho-info").html("手机号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-perEm-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-perEm-land").val()).match(
			/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
			&& ($.trim($(".text-perEm-land").val())) != "") {

		t = 0;
		$(".span-perEm-info").html("邮箱格式不对！");
		return;
	} else {
		t = 1;
	}

}
function div4Check() {
	if ($.trim($(".text-donUnitName-land").val()) == "") {
		t = 0;
		$(".span-donUnitName-info").html("捐赠单位名称不能为空！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donUnitPostcode-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-donUnitPostcode-land").val()).match(
			/^[1-9]\d{5}(?!\d)$/))
			&& ($.trim($(".text-donUnitPostcode-land").val())) != "") {

		t = 0;
		$(".span-donUnitPostcode-info").html("邮政编码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donUnitPhone-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-donUnitPhone-land").val()).match(
			/^\d{3}-\d{8}|\d{4}-\d{7}$/))
			&& ($.trim($(".text-donUnitPhone-land").val())) != "") {

		t = 0;
		$(".span-donUnitPhone-info").html("电话号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donUnitFax-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-donUnitFax-land").val()).match(
			/^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))
			&& ($.trim($(".text-donUnitFax-land").val())) != "") {

		t = 0;
		$(".span-donUnitFax-info").html("传真号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donUnitMobPho-land").val()) == "") {
		t = 0;
		$(".span-donUnitMobPho-info").html("手机不能为空！");
		return;
	} else if ((!$.trim($(".text-donUnitMobPho-land").val()).match(
			/^1[3|4|5|8][0-9]{9}$/))
			&& ($.trim($(".text-donUnitMobPho-land").val())) != "") {

		t = 0;
		$(".span-donUnitMobPho-info").html("手机号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donUnitEm-land").val()) == "") {

		t = 0;
		$(".span-donUnitEm-info").html("邮箱不能为空！");
		return;
	} else if ((!$.trim($(".text-donUnitEm-land").val()).match(
			/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
			&& ($.trim($(".text-donUnitEm-land").val())) != "") {

		t = 0;
		$(".span-donUnitEm-info").html("邮箱格式不对！");
		return;
	} else {
		t = 1;
	}
}

function div5Check() {
	if ($.trim($(".text-donLinkman-land").val()) == "") {
		t = 0;
		$(".span-donLinkman-info").html("捐赠方联系人不能为空！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donPerPhone-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-donPerPhone-land").val()).match(
			/^\d{3}-\d{8}|\d{4}-\d{7}$/))
			&& ($.trim($(".text-donPerPhone-land").val())) != "") {

		t = 0;
		$(".span-donPerPhone-info").html("电话号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donPerFax-land").val()) == "") {
		t = 1;
	} else if ((!$.trim($(".text-donPerFax-land").val()).match(
			/^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))
			&& ($.trim($(".text-donPerFax-land").val())) != "") {

		t = 0;
		$(".span-donPerFax-info").html("传真号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donPerMobPho-land").val()) == "") {

		t = 0;
		$(".span-donPerMobPho-info").html("手机不能为空！");
		return;
	} else if ((!$.trim($(".text-donPerMobPho-land").val()).match(
			/^1[3|4|5|8][0-9]{9}$/))
			&& ($.trim($(".text-donPerMobPho-land").val())) != "") {

		t = 0;
		$(".span-donPerMobPho-info").html("手机号码格式不对！");
		return;
	} else {
		t = 1;
	}

	if ($.trim($(".text-donPerEm-land").val()) == "") {

		t = 0;
		$(".span-donPerEm-info").html("邮箱不能为空！");
		return;
	} else if ((!$.trim($(".text-donPerEm-land").val()).match(
			/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
			&& ($.trim($(".text-donPerEm-land").val())) != "") {

		t = 0;
		$(".span-donPerEm-info").html("邮箱格式不对！");
		return;
	} else {
		t = 1;
	}

	if ((num = boxcheck("publicationState")) > 0) {
		t = 1;
	} else {
		t = 0;
		return;
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

function myCheck1(){
	var m=1;
	div1Check();
	if(t==0){
		m=0;
		return m;
	}
	div2Check();
	if(t==0){
		m=0;
		return m;
	}
	div3Check();
	if(t==0){
		m=0;
		return m;
	}
	div5Check();
	if(t==0){
		m=0;
		return m;
	}
	return m;
	
}

function myCheck2(){
	var m=1;
	div1Check();
	if(t==0){
		m=0;
		return m;
	}
	div2Check();
	if(t==0){
		m=0;
		return m;
	}
	div4Check();
	if(t==0){
		m=0;
		return m;
	}
	div5Check();
	if(t==0){
		m=0;
		return m;
	}
	return m;
	
}

function check() {
	var j;
	if ($(".personal").attr("checked") == "checked") {
		j=myCheck1();
		if ( j== 0) {
			alert("立项申请表信息没有完善，请您先完善信息！");
			return false;
		} else {
			return true;
		}
	} else {
		j=myCheck2();
		if (t == 0) {
			alert("立项申请表信息没有完善，请您先完善信息！");
			return false;
		} else {
			return true;
		}
	}
}

function div3Reset(){
	$(".text-donName-land").val("");
	$("[name='donor.dSex']").each(function(){
		if ($(this)[0].checked) {
			$(this)[0].checked=false;
		}
	});
	$(".text-birthday-land").val("");
	$("[name='donor.hobbits']").val("");
	$("[name='donor.isAlumni']").each(function(){
		if ($(this)[0].checked) {
			$(this)[0].checked=false;
		}
	});
	$(".text-graTime-land").val("");
	$("[name='donor.dUnit']").val("");
	$("[name='donor.dJob']").val("");
	$("#text34").val("");
	$("#text35").val("");
	
}

function div4Reset(){
	$("[name='donationUnit.duName']").val("");
	$("[name='donationUnit.address']").val("");
	$("[name='donationUnit.zipCode']").val("");
	$("[name='donationUnit.officephone']").val("");
	$("[name='donationUnit.fax']").val("");
	$("[name='donationUnit.mobilephone']").val("");
	$("[name='donationUnit.duEmail']").val("");
}

function unitRadio(){
 switch($("input[name=isUnit]:checked").attr("id")){
  case "inline-radio1":
	  div4Reset();
   break;
  case "inline-radio2":
	  div3Reset();
   break;
  default:
   break;
 }
}

function donTimeRadio(){
 switch($("input[name='donationMode.isOnetime']:checked").attr("id")){
  case "radio1":
	  $(".text-eachYearMon-land").val("");
	  $(".text-year-land").val("");
	  $(".text-staTime-land").val("");
   break;
  case "radio2":
	  $(".text-donMon-land").val("");
	  $(".text-donTime-land").val("");
   break;
  default:
   break;
 }
}
