package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexTwoController{
	
/*
 *  在类前面加上@Controller 表示该类是一个控制器
	在方法handleRequest 前面加上 @RequestMapping("/index") 表示路径/index会映射到该方法上
	注意：不再让IndexController实现Controller接口
 */
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "Hello Spring MVC");
		return mav;
	}
}