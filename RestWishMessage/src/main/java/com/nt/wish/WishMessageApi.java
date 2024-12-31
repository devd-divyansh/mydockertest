package com.nt.wish;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WishMessageApi {

	
	@GetMapping("/wish/{name}")
	public ResponseEntity<String>getWishMessage(@PathVariable String name){	
		return new ResponseEntity<String>("Radha Vallabh Lal Ki Jai\t"+name,HttpStatus.OK);
	}
	
	
	
	
}
