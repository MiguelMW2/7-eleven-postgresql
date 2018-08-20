package mx.ipn.cic.eleven.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.ipn.cic.eleven.dto.DetailWrapper;
import mx.ipn.cic.eleven.dto.Wrapper;
import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.entities.ProductEntity;

@RestController
@RequestMapping(path="/detailSale")
public class DetailSaleController {

	@PostMapping(path="/save", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody List<DetailSaleEntity> detailSale) {
		System.out.println(detailSale);
		/*List<Wrapper> details = detailSale.getDetails();
		Sy1stem.out.println(details);
		*/
		/*this.detailSaleService.saveAll(detailSaleList);
		return "redirect:/sale/payment/";*/
		
		/*for(SaleDetailDto SaleDetailDto :  SaleDetailDtos) {
			System.out.println(SaleDetailDto.getQuantity());
			System.out.println(SaleDetailDto.getProduct());
		}*/
		return "redirect:/login/home";
	}
}
