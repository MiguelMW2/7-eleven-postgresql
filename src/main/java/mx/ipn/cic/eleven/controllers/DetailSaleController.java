package mx.ipn.cic.eleven.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.services.DetailSaleService;

@RestController
@RequestMapping(path="/detailSale", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public class DetailSaleController {

	@Autowired
	private DetailSaleService detailSaleService;

	@PostMapping(path="/save")
	public String register(@RequestBody List<DetailSaleEntity> detailSale) {
		/*this.detailSaleService.saveAll(detailSaleList);
		return "redirect:/sale/payment/";*/
		System.out.println(detailSale);
		return "redirect:/sale/payment";
	}
}
