package ygw.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 使用注解开发controller
 * 
 * @author weiygcn
 * @Controller表示该类是一个处理器，容器扫描该类时会产生相应的对象
 */
@Controller
public class HelloController {
	/**
	 * 处理方法
	 * 
	 * @RequestMapping 注解访问该类的url
	 */
	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello");
	}

	@RequestMapping("/hello1")
	public ModelAndView hello1() {
		return new ModelAndView();
	}

	@RequestMapping("/hello2")
	public ModelAndView hello2(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.getRequestDispatcher("/WEB-INF/jsp/hello3.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping("hello4")
	public void hello4()
	{
		
	}
	@RequestMapping("hello5")
	public void hello5(HttpServletRequest req,HttpServletResponse resp)
	{
		try{
		req.getRequestDispatcher("/WEB-INF/jsp/hello5.jsp").forward(req, resp);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@RequestMapping("hello7")
	public String hello5()
	{
		return null;
	}
	@RequestMapping("/hello8")
	public String hello8()
	{
		//model.addAttribute("msg","String forward");
		return "redirect:/hello";
	}
}
