package com.test.mvcEx01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/memberReg")
	public String memberInput() {
		return "memberRegister";
	}

	@RequestMapping("/post/memberInfo")
	public String memInfo(Model model) {
		model.addAttribute("name", "홍길동");
		return "post/memInfo";
	}

	@RequestMapping("/model/ex")
	public String testModel(Model model) {
		model.addAttribute("address", "경기도 광명시 하안동");
		return "model/testModel";
	}

	//ModelAndView 객체(mv)를 전달
	@RequestMapping("/modelAndView/mv")
	public ModelAndView modelAndView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("email", "dewytear@naver.com");
		mv.setViewName("/modelAndView/modelView");
		return mv;
	}
}
