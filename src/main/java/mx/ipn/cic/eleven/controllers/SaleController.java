package mx.ipn.cic.eleven.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.ipn.cic.eleven.entities.SaleEntity;
import mx.ipn.cic.eleven.services.SaleService;

@Controller
@RequestMapping(path="/sale")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping(path="/all")
	public ModelAndView s() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sales", this.saleService.allSales());
		return mav;
	}

	@GetMapping(path="/sale")
	public ModelAndView sale() {
		ModelAndView mav = new ModelAndView("/sale/sale");
		SaleEntity sale = this.saleService.register(new SaleEntity(LocalDateTime.now()));
		mav.addObject("sale", sale);
		return mav;
	}

	@GetMapping(path="/total")
	public ModelAndView payment(@ModelAttribute(name="sale") SaleEntity sale) {
		ModelAndView mav = new ModelAndView("/sale/payment");
		sale.setTotal(this.saleService.calculate(sale));
		this.saleService.register(sale);
		mav.addObject("sale", sale);
		return mav;
	}

	@PostMapping(path="/register")
	public ModelAndView register(@ModelAttribute(name="sale") SaleEntity sale) {
		ModelAndView mav = new ModelAndView("/sale/summary");
		this.saleService.register(sale);
		mav.addObject("sale", sale);
		return mav;
	}
}
