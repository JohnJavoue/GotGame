package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class HomeController {
	
	@RequestMapping(value = "/yeah", method = RequestMethod.GET)
	public ModelAndView dosomething(HttpServletRequest request, HttpServletResponse response)  throws IOException {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("redirect:/other-page");

	    return mav;
	}

}
