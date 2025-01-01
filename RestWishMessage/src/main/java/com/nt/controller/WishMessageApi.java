package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.DockerStudent;
import com.nt.service.IStudentService;

@RestController
@RequestMapping("/rest")
public class WishMessageApi {
     @Autowired
	private IStudentService serv;
	
	@GetMapping("/wish/{name}")
	public ResponseEntity<String>getWishMessage(@PathVariable String name){	
		return new ResponseEntity<String>("Radha Vallabh Lal Ki Jai\t"+name,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String>createStudent(@RequestBody DockerStudent student){
		
		return  new ResponseEntity<String>(serv.createStudent(student),HttpStatus.OK);
	}
	
	
	
	
}
