package mx.ipn.cic.eleven.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.ipn.cic.eleven.entities.UserEntity;

@Controller
@RequestMapping(path="/login")
public class LoginController {

	@GetMapping(path="")
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new UserEntity());
		return mav;
	}

	@PostMapping(path="/authenticate")
	public ModelAndView authenticate(@ModelAttribute(name="user") UserEntity user)
	{
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
}
