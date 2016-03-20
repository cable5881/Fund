package com.fund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:gjh
 * @Description:学生controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

	//老师
	@RequestMapping("/index")
	public String toIndex_1()throws Exception
	{
		return "user/teacher/index";
	}
	@RequestMapping("/")
	public String toIndex_2()throws Exception
	{
		return "user/teacher/index";
	}
	//老师
	@RequestMapping("/applybonus")
	public String applybonus()throws Exception
	{
		return "user/teacher/applyBonus";
	}
}
