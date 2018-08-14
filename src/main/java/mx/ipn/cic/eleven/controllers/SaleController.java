package mx.ipn.cic.eleven.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.ipn.cic.eleven.entities.SaleEntity;
import mx.ipn.cic.eleven.services.SaleService;

@Controller
@RequestMapping(path="/sale")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping(path="/sale")
	public ModelAndView sale() {
		ModelAndView mav = new ModelAndView("/sale/sale");
		SaleEntity sale = this.saleService.save( new SaleEntity() );
		mav.addObject("sale", sale);
		return mav;
	}
}
