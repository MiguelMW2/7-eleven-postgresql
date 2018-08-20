package mx.ipn.cic.eleven.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.ipn.cic.eleven.dto.DetailWrapper;
import mx.ipn.cic.eleven.dto.SaleDetailDto;
import mx.ipn.cic.eleven.entities.ProductEntity;

@RestController
@RequestMapping(path="/detailSale", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public class DetailSaleController {

	@PostMapping(path="/save")
	public String register(@RequestBody DetailWrapper detailSale) {
		/*this.detailSaleService.saveAll(detailSaleList);
		return "redirect:/sale/payment/";*/
		List<SaleDetailDto> SaleDetailDtos = detailSale.getDetailSale();
		System.out.println(detailSale);
		for(SaleDetailDto SaleDetailDto :  SaleDetailDtos) {
			System.out.println(SaleDetailDto);
		}
		return "redirect:/login/home";
	}
}
