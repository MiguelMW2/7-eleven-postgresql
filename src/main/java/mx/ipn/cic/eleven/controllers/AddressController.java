package mx.ipn.cic.eleven.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.ipn.cic.eleven.entities.AddressEntity;
import mx.ipn.cic.eleven.entities.UserEntity;
import mx.ipn.cic.eleven.services.AddressService;
import mx.ipn.cic.eleven.services.UserService;

@Controller
@RequestMapping(path="/address")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@Autowired
	private UserService userService;

	@GetMapping(path="/all")
	public ModelAndView allAddress() {
		ModelAndView mav = new ModelAndView("address/all");
		mav.addObject("addresses", this.addressService.allAddress());
		return mav;
	}

	@GetMapping(path="/newForm")
	public ModelAndView newForm() {
		ModelAndView mav = new ModelAndView("address/newForm");
		mav.addObject("user", new UserEntity());
		return mav;
	}

	@PostMapping(path="/register")
	public String register(
			@ModelAttribute(name="address") AddressEntity address,
			@ModelAttribute(name="user") UserEntity user
	) {
		UserEntity found = userService.findById(user.getId());
		address.setUser(found);
		this.addressService.register(address);
		return "redirect:/address/all";
	}

	@GetMapping(path="/edit/{id}")
	public ModelAndView edit(@PathVariable(name="id") Integer id) {
		AddressEntity found = this.addressService.findById(id);
		ModelAndView mav = new ModelAndView("address/newForm");
		mav.addObject("address", found);
		return mav;
	}

	@GetMapping(path="/delete/{id}")
	public String delete(@PathVariable(name="id") Integer id) {
		this.addressService.delete(id);
		return "redirect:/address/all";
	}

	@GetMapping(path="/detail/{id}")
	public ModelAndView detail(@PathVariable(name="id") Integer id) {
		ModelAndView mav = new ModelAndView("address/detail");
		mav.addObject("address", this.addressService.findByUser_Id(id));
		return mav;
	}
}
