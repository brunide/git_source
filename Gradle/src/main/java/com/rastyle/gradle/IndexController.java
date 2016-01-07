package com.rastyle.gradle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index.htm")
	public ModelAndView indexPage(){
		ModelAndView mav = new ModelAndView("/WEB-INF/views/index.jsp");
		// test 
		// 원격 저장소 소스 반영 테스트
		// 다른기능 테스트
		// 123123 2222222222222
		return mav;
	}
}
