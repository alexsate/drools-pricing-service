package br.com.drools.pricing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.drools.pricing.model.FlightG3;
import br.com.drools.pricing.service.PricingG3Service;

@RestController
@RequestMapping("/pricing/g3")
public class PricingG3Controller {
	
	@Autowired
	private PricingG3Service pricingG3Service;
	
	@RequestMapping(value = "/flight", method = RequestMethod.POST)
	public ResponseEntity<FlightG3> flight(@RequestBody FlightG3 flightG3) {
		
		System.out.println("POST method");
		
		pricingG3Service.flight(flightG3);
		
		return ResponseEntity.ok(flightG3);
	}
}
