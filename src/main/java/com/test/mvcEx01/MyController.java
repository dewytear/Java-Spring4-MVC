package com.test.mvcEx01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
