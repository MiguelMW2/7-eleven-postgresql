package mx.ipn.cic.eleven.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.services.DetailSaleService;

@Controller
@RequestMapping(path="/detailSale")
public class DetailSaleController {

	@Autowired
	private DetailSaleService detailSaleService;

	@RequestMapping(path="/save")
	public String register(@RequestBody List<DetailSaleEntity> detailSaleList) {
		this.detailSaleService.saveAll(detailSaleList);
		return "redirect:";
	}
}
