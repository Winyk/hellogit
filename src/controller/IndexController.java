package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
	
/*
 *  ������ IndexControllerʵ�ֽӿ�Controller ���ṩ����handleRequest��������
 *	SpringMVCͨ�� ModelAndView �����ģ�ͺ���ͼ�����һ��
 */
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "Hello Spring MVC");
		return mav;
	}
}