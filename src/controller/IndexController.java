package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
	
/*
 *  控制类 IndexController实现接口Controller ，提供方法handleRequest处理请求
 *	SpringMVC通过 ModelAndView 对象把模型和视图结合在一起
 *  哥你是真的帅(修改痕迹)
 */
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index.jsp");
		mav.addObject("message", "Hello Spring MVC");
		return mav;
	}
}