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
		// ���� ����� �ҽ� �ݿ� �׽�Ʈ
		// �ٸ���� �׽�Ʈ
		// 123123 2222222222222
		return mav;
	}
}
