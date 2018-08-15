package mx.ipn.cic.eleven.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.services.DetailSaleService;

@Controller
@RequestMapping(path="/rest/detailSale")
public class DetailSaleRESTController {

	@Autowired
	private DetailSaleService detailSaleService;

	@PostMapping(path="/save", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetailSaleEntity> save(@RequestBody DetailSaleEntity detailSale) {
		ResponseEntity<DetailSaleEntity> response;
		try {
			response = new ResponseEntity<DetailSaleEntity>(this.detailSaleService.save(detailSale), HttpStatus.CREATED);
		} catch (Exception e) {
			response = new ResponseEntity<DetailSaleEntity>(HttpStatus.NOT_ACCEPTABLE);
		}
		return response;
	}
}
