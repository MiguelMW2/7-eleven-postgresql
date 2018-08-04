package mx.ipn.cic.eleven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/login")
public class LoginController {

	@GetMapping(path="/")
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	@PostMapping(path="/authenticate")
	public ModelAndView authenticate()
	{
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
}
