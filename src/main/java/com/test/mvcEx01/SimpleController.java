package com.test.mvcEx01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aaa")
//클래스 전반에 RequestMapping 을 사용하여 aaa를 거쳐 들어오게 된다.
public class SimpleController {

	@RequestMapping("/bbb")
	public String bbb() {
		return "/aaa/bbb";
	}
	
}
