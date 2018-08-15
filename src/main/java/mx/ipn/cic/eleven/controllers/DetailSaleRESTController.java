package mx.ipn.cic.eleven.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;

@Controller
@RequestMapping(path="/rest/detailSale")
public class DetailSaleRESTController {

	@PostMapping(path="/save", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetailSaleEntity> save(@RequestBody DetailSaleEntity detailSale) {
		ResponseEntity<DetailSaleEntity> response;
		try {
			System.out.println(detailSale);
			/*DetailSaleEntity detailSale = this.detailSaleService.save(Integer.parseInt(idProduct), Integer.parseInt(idSale));*/
			response = new ResponseEntity<DetailSaleEntity>(detailSale, HttpStatus.CREATED);
		} catch (Exception e) {
			response = new ResponseEntity<DetailSaleEntity>(HttpStatus.NOT_ACCEPTABLE);
		}
		return response;
	}
}
