$(document).ready(function() {
	if($(".personal").attr("checked") == "checked"){
		$("#div3").css("display", "");
		$("#div4").css("display", "none");
	}
	else{
		$("#div4").css("display", "");
		$("#div3").css("display", "none");
	}
	
	$(".personal").change(function() {
		$("#div3").css("display", "");
		$("#div4").css("display", "none");
	});

	$(".unit").change(function() {
		$("#div4").css("display", "");
		$("#div3").css("display", "none");
	});
	
	$('#birthday_date').Zebra_DatePicker().css("cursor", "pointer");
});

$(document).ready(function() {
	if ($(".radio-OneTime").attr("checked") == "checked") {
		$(".div-MoreTime").css("display", "none");
		$('#executeDate').Zebra_DatePicker({
			direction : 1
		}).val(new Date().Format("yyyy-MM-dd")).css("cursor", "pointer");
	} else if ($(".radio-MoreTime").attr("checked") == "checked") {
		$(".div-OneTime").css("display", "none");
		$('#startDate').Zebra_DatePicker({
			direction : 1
		}).val(new Date().Format("yyyy-MM-dd")).css("cursor", "pointer");
	} else {
		$(".div-MoreTime").css("display", "none");
		$(".div-OneTime").css("display", "none");
	}

	$(".radio-OneTime").change(function() {
		$(".div-OneTime").css("display", "inline");
		$(".div-MoreTime").css("display", "none");
		// 显示捐赠时间控件
		$('#executeDate').Zebra_DatePicker({
			direction : 1
		// boolean true would've made the date picker future only
		// but starting from today, rather than tomorrow
		}).val(new Date().Format("yyyy-MM-dd")).css("cursor", "pointer");
	});

	$(".radio-MoreTime").change(function() {
		$(".div-MoreTime").css("display", "inline");
		$(".div-OneTime").css("display", "none");
		// 显示时间控件
		$('#startDate').Zebra_DatePicker({
			direction : 1
		// boolean true would've made the date picker future only
		// but starting from today, rather than tomorrow
		}).val(new Date().Format("yyyy-MM-dd")).css("cursor", "pointer");
	});
});

$(document).ready(function() {
	$(".text-proName-check").blur(function() {
		if ($.trim($(".text-proName-land").val()) == "") {
			$(".span-proName-info").html("捐赠项目名称不能为空！");
		}
		if ($.trim($(".text-proName-land").val()) != "") {
			$(".span-proName-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-proPer-check").blur(function() {
		if ($.trim($(".text-proPer-land").val()) == "") {
			$(".span-proPer-info").html("项目负责人不能为空！");
		}
		if ($.trim($(".text-proPer-land").val()) != "") {
			$(".span-proPer-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-donMon-check").blur(function() {
		if ($.trim($(".text-donMon-land").val()) == "") {
			$(".span-donMon-info").html("捐赠金额不能为空！");
		}
		if ($.trim($(".text-donMon-land").val()) != "") {
			$(".span-donMon-info").html("");
		}
	});
});
$(document).ready(function() {
	$(".text-donTime-check").blur(function() {
		if ($.trim($(".text-donTime-land").val()) == "") {
			$(".span-donTime-info").html("捐赠时间不能为空！");
		}
		if ($.trim($(".text-donTime-land").val()) != "") {
			$(".span-donTime-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-eachYearMon-check").blur(function() {
		if ($.trim($(".text-eachYearMon-land").val()) == "") {
			$(".span-eachYearMon-info").html("年度捐赠金额不能为空！");
		}
		if ($.trim($(".text-eachYearMon-land").val()) != "") {
			$(".span-eachYearMon-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-year-check").blur(function() {
		if ($.trim($(".text-year-land").val()) == "") {
			$(".span-year-info").html("年限不能为空！");
		} else {
			$(".span-year-info").html("");

		}
	});
});

$(document).ready(function() {
	$(".text-staTime-check").blur(function() {
		var startDate = $(".text-staTime-land").val();
		if ($.trim(startDate) == "") {
			$(".span-staTime-info").html("开始时间不能为空！");
		} else {
			$(".span-staTime-info").html("");
			/*
			 * var dateParts = startDate.split('-'); var year =
			 * Number(dateParts[0]); var yearToPlus =
			 * Number($(".text-year-check").val()); year += yearToPlus;
			 * dateParts[0] = year+""; var endDate = dateParts.join('-');
			 * $('#endDate').val(endDate);
			 */
		}
	});

	$(".text-moneyPrincipal-check").blur(function() {
		if ($.trim($(".text-moneyPrincipal-land").val()) == "") {
			$(".span-moneyPrincipal-info").html("项目经费负责人不能为空！");
		}
		if ($.trim($(".text-moneyPrincipal-land").val()) != "") {
			$(".span-moneyPrincipal-info").html("");
		}
	});

});

$(document).ready(function() {
	$(".text-beneUnit-check").blur(function() {
		if ($.trim($(".text-beneUnit-land").val()) == "") {
			$(".span-beneUnit-info").html("受益单位不能为空！");
		}
		if ($.trim($(".text-beneUnit-land").val()) != "") {
			$(".span-beneUnit-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-proLinkman-check").blur(function() {
		if ($.trim($(".text-proLinkman-land").val()) == "") {
			$(".span-proLinkman-info").html("项目联系人不能为空！");
		}
		if ($.trim($(".text-proLinkman-land").val()) != "") {
			$(".span-proLinkman-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-donName-check").blur(function() {
		if ($.trim($(".text-donName-land").val()) == "") {
			$(".span-donName-info").html("捐赠人姓名不能为空！");
		}
		if ($.trim($(".text-donName-land").val()) != "") {
			$(".span-donName-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-birthday-check").blur(function() {
		if ($.trim($(".text-birthday-land").val()) == "") {
			$(".span-birthday-info").html("出生日期不能为空！");
		}
		if ($.trim($(".text-birthday-land").val()) != "") {
			$(".span-birthday-info").html("");
		}
	});

	$(".text-graTime-check").blur(function() {
		if ($.trim($(".text-graTime-land").val()) == "") {
			$(".span-graTime-info").html("毕业时间和年份不能为空！");
		}
		if ($.trim($(".text-graTime-land").val()) != "") {
			$(".span-graTime-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-donUnitName-check").blur(function() {
		if ($.trim($(".text-donUnitName-land").val()) == "") {
			$(".span-donUnitName-info").html("捐赠单位名称不能为空！");
		}
		if ($.trim($(".text-donUnitName-land").val()) != "") {
			$(".span-donUnitName-info").html("");
		}
	});
});

$(document).ready(function() {
	$(".text-donLinkman-check").blur(function() {
		if ($.trim($(".text-donLinkman-land").val()) == "") {
			$(".span-donLinkman-info").html("捐赠方联系人不能为空！");
		}
		if ($.trim($(".text-donLinkman-land").val()) != "") {
			$(".span-donLinkman-info").html("");
		}
	});
});

$(document)
		.ready(
				function() {
					$(".text-beneMobPho-check")
							.blur(
									function() {
										if ($.trim($(".text-beneMobPho-land")
												.val()) == "") {

											$(".span-beneMobPho-info").html(
													"手机不能为空！");
										}
										if ((!$.trim(
												$(".text-beneMobPho-land")
														.val()).match(
												/^1[3|4|5|8][0-9]{9}$/))
												&& ($
														.trim($(
																".text-beneMobPho-land")
																.val())) != "") {

											$(".span-beneMobPho-info").html(
													"手机号码格式不对！");
										}
										if (($.trim($(".text-beneMobPho-land")
												.val()) != "")
												&& ($
														.trim($(
																".text-beneMobPho-land")
																.val())
														.match(/^1[3|4|5|8][0-9]{9}$/))) {
											$(".span-beneMobPho-info").html("");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-donPerMobPho-check")
							.blur(
									function() {
										if ($.trim($(".text-donPerMobPho-land")
												.val()) == "") {

											$(".span-donPerMobPho-info").html(
													"手机不能为空！");
										}
										if ((!$.trim(
												$(".text-donPerMobPho-land")
														.val()).match(
												/^1[3|4|5|8][0-9]{9}$/))
												&& ($
														.trim($(
																".text-donPerMobPho-land")
																.val())) != "") {

											$(".span-donPerMobPho-info").html(
													"手机号码格式不对！");
										}
										if (($
												.trim($(
														".text-donPerMobPho-land")
														.val()) != "")
												&& ($
														.trim($(
																".text-donPerMobPho-land")
																.val())
														.match(/^1[3|4|5|8][0-9]{9}$/))) {
											$(".span-donPerMobPho-info").html(
													"");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-donUnitMobPho-check")
							.blur(
									function() {
										if ($
												.trim($(
														".text-donUnitMobPho-land")
														.val()) == "") {

											$(".span-donUnitMobPho-info").html(
													"手机不能为空！");
										}
										if ((!$.trim(
												$(".text-donUnitMobPho-land")
														.val()).match(
												/^1[3|4|5|8][0-9]{9}$/))
												&& ($
														.trim($(
																".text-donUnitMobPho-land")
																.val())) != "") {

											$(".span-donUnitMobPho-info").html(
													"手机号码格式不对！");
										}
										if (($.trim($(
												".text-donUnitMobPho-land")
												.val()) != "")
												&& ($
														.trim($(
																".text-donUnitMobPho-land")
																.val())
														.match(/^1[3|4|5|8][0-9]{9}$/))) {
											$(".span-donUnitMobPho-info").html(
													"");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-perMobPho-land")
							.blur(
									function() {
										if ($.trim($(".text-perMobPho-land")
												.val()) == "") {
											$(".span-perMobPho-info").html(
													"");
										}
										if ((!$
												.trim(
														$(
																".text-perMobPho-land")
																.val()).match(
														/^1[3|4|5|8][0-9]{9}$/))
												&& ($.trim($(
														".text-perMobPho-land")
														.val())) != "") {

											$(".span-perMobPho-info").html(
													"手机号码格式不对！");
										}
										if (($.trim($(".text-perMobPho-land")
												.val()) != "")
												&& ($.trim($(
														".text-perMobPho-land")
														.val())
														.match(/^1[3|4|5|8][0-9]{9}$/))) {
											$(".span-perMobPho-info").html("");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-beneLinEm-check")
							.blur(
									function() {
										if ($.trim($(".text-beneLinEm-land")
												.val()) == "") {

											$(".span-beneLinEm-info").html(
													"邮箱不能为空！");
										}
										if ((!$
												.trim(
														$(
																".text-beneLinEm-land")
																.val())
												.match(
														/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
												&& ($.trim($(
														".text-beneLinEm-land")
														.val())) != "") {

											$(".span-beneLinEm-info").html(
													"邮箱格式不对！");
										}
										if (($.trim($(".text-beneLinEm-land")
												.val()) != "")
												&& ($.trim($(
														".text-beneLinEm-land")
														.val())
														.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))) {
											$(".span-beneLinEm-info").html("");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-donPerEm-land")
							.blur(
									function() {
										if ($.trim($(".text-donPerEm-land")
												.val()) == "") {

											$(".span-donPerEm-info").html(
													"");
										}
										if ((!$
												.trim(
														$(".text-donPerEm-land")
																.val())
												.match(
														/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
												&& ($.trim($(
														".text-donPerEm-land")
														.val())) != "") {

											$(".span-donPerEm-info").html(
													"邮箱格式不对！");
										}
										if (($.trim($(".text-donPerEm-land")
												.val()) != "")
												&& ($.trim($(
														".text-donPerEm-land")
														.val())
														.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))) {
											$(".span-donPerEm-info").html("");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-perEm-land")
							.blur(
									function() {
										if ($.trim($(".text-perEm-land").val()) == "") {

											$(".span-perEm-info").html(
													"");
										}
										if ((!$
												.trim(
														$(".text-perEm-land")
																.val())
												.match(
														/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
												&& ($
														.trim($(
																".text-perEm-land")
																.val())) != "") {

											$(".span-perEm-info").html(
													"邮箱格式不对！");
										}
										if (($
												.trim($(".text-perEm-land")
														.val()) != "")
												&& ($
														.trim($(
																".text-perEm-land")
																.val())
														.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))) {
											$(".span-perEm-info").html("");
										}
									});
				});

$(document)
		.ready(
				function() {
					$(".text-donUnitEm-check")
							.blur(
									function() {
										if ($.trim($(".text-donUnitEm-land")
												.val()) == "") {

											$(".span-donUnitEm-info").html(
													"邮箱不能为空！");
										}
										if ((!$
												.trim(
														$(
																".text-donUnitEm-land")
																.val())
												.match(
														/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
												&& ($.trim($(
														".text-donUnitEm-land")
														.val())) != "") {

											$(".span-donUnitEm-info").html(
													"邮箱格式不对！");
										}
										if (($.trim($(".text-donUnitEm-land")
												.val()) != "")
												&& ($.trim($(
														".text-donUnitEm-land")
														.val())
														.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))) {
											$(".span-donUnitEm-info").html("");
										}
									});
				});

$(document)
.ready(
		function() {
			$(".text-benePhone-land")
					.blur(
							function() {
								if ($.trim($(".text-benePhone-land")
										.val()) == "") {

									$(".span-benePhone-info").html(
											"");
								}
								if ((!$
										.trim(
												$(
														".text-benePhone-land")
														.val())
										.match(
												/^\d{3}-\d{8}|\d{4}-\d{7}$/))
										&& ($.trim($(
												".text-benePhone-land")
												.val())) != "") {

									$(".span-benePhone-info").html(
											"电话号码格式不对！");
								}
								if (($.trim($(".text-benePhone-land")
										.val()) != "")
										&& ($.trim($(
												".text-benePhone-land")
												.val())
												.match(/^\d{3}-\d{8}|\d{4}-\d{7}$/))){
									$(".span-benePhone-info").html("");
								}
							});
			
			$(".text-donPerPhone-land")
			.blur(
					function() {
						if ($.trim($(".text-donPerPhone-land")
								.val()) == "") {

							$(".span-donPerPhone-info").html(
									"");
						}
						if ((!$
								.trim(
										$(
												".text-donPerPhone-land")
												.val())
								.match(
										/^\d{3}-\d{8}|\d{4}-\d{7}$/))
								&& ($.trim($(
										".text-donPerPhone-land")
										.val())) != "") {

							$(".span-donPerPhone-info").html(
									"电话号码格式不对！");
						}
						if (($.trim($(".text-donPerPhone-land")
								.val()) != "")
								&& ($.trim($(
										".text-donPerPhone-land")
										.val())
										.match(/^\d{3}-\d{8}|\d{4}-\d{7}$/))){
							$(".span-donPerPhone-info").html("");
						}
					});
			$(".text-donUnitPhone-land")
			.blur(
					function() {
						if ($.trim($(".text-donUnitPhone-land")
								.val()) == "") {

							$(".span-donUnitPhone-info").html(
									"");
						}
						if ((!$
								.trim(
										$(
												".text-donUnitPhone-land")
												.val())
								.match(
										/^\d{3}-\d{8}|\d{4}-\d{7}$/))
								&& ($.trim($(
										".text-donUnitPhone-land")
										.val())) != "") {

							$(".span-donUnitPhone-info").html(
									"电话号码格式不对！");
						}
						if (($.trim($(".text-donUnitPhone-land")
								.val()) != "")
								&& ($.trim($(
										".text-donUnitPhone-land")
										.val())
										.match(/^\d{3}-\d{8}|\d{4}-\d{7}$/))){
							$(".span-donUnitPhone-info").html("");
						}
					});
		
		});

$(document)
.ready(
		function() {
			$(".text-beneFax-land")
					.blur(
							function() {
								if ($.trim($(".text-beneFax-land")
										.val()) == "") {

									$(".span-beneFax-info").html(
											"");
								}
								if ((!$
										.trim(
												$(
														".text-beneFax-land")
														.val())
										.match(
												 /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))
										&& ($.trim($(
												".text-beneFax-land")
												.val())) != "") {

									$(".span-beneFax-info").html(
											"传真号码格式不对！");
								}
								if (($.trim($(".text-beneFax-land")
										.val()) != "")
										&& ($.trim($(
												".text-beneFax-land")
												.val())
												.match( /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))){
									$(".span-beneFax-info").html("");
								}
							});
			$(".text-donPerFax-land")
			.blur(
					function() {
						if ($.trim($(".text-donPerFax-land")
								.val()) == "") {

							$(".span-donPerFax-info").html(
									"");
						}
						if ((!$
								.trim(
										$(
												".text-donPerFax-land")
												.val())
								.match(
										 /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))
								&& ($.trim($(
										".text-donPerFax-land")
										.val())) != "") {

							$(".span-donPerFax-info").html(
									"传真号码格式不对！");
						}
						if (($.trim($(".text-donPerFax-land")
								.val()) != "")
								&& ($.trim($(
										".text-donPerFax-land")
										.val())
										.match( /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))){
							$(".span-donPerFax-info").html("");
						}
					});
			$(".text-donUnitFax-land")
			.blur(
					function() {
						if ($.trim($(".text-donUnitFax-land")
								.val()) == "") {

							$(".span-donUnitFax-info").html(
									"");
						}
						if ((!$
								.trim(
										$(
												".text-donUnitFax-land")
												.val())
								.match(
										 /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))
								&& ($.trim($(
										".text-donUnitFax-land")
										.val())) != "") {

							$(".span-donUnitFax-info").html(
									"传真号码格式不对！");
						}
						if (($.trim($(".text-donUnitFax-land")
								.val()) != "")
								&& ($.trim($(
										".text-donUnitFax-land")
										.val())
										.match( /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/))){
							$(".span-donUnitFax-info").html("");
						}
					});
			$(".text-donUnitPostcode-land")
			.blur(
					function() {
						if ($.trim($(".text-donUnitPostcode-land")
								.val()) == "") {

							$(".span-donUnitPostcode-info").html(
									"");
						}
						if ((!$
								.trim(
										$(
												".text-donUnitPostcode-land")
												.val())
								.match(
										/^[1-9]\d{5}(?!\d)$/))
								&& ($.trim($(
										".text-donUnitPostcode-land")
										.val())) != "") {

							$(".span-donUnitPostcode-info").html(
									"邮政编码格式不对！");
						}
						if (($.trim($(".text-donUnitPostcode-land")
								.val()) != "")
								&& ($.trim($(
										".text-donUnitPostcode-land")
										.val())
										.match( /^[1-9]\d{5}(?!\d)$/))){
							$(".span-donUnitPostcode-info").html("");
						}
					});
		});

