package com.dz.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestCountryController{

	List<String> list = null;
	
	
	@GetMapping(value = "country/countryList")
	public ResponseEntity<List<String>> getCountries(){
		
		list=new ArrayList<String>();
		
		list.add("INDIA");
		list.add("USA");
		list.add("JAPAN");
		list.add("CHINA");

		
		return ResponseEntity.ok().body(list);
//		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
//		return new ResponseEntity<body type >(body, HttpStatus code);
	}
	
	@DeleteMapping(value = "country/{name}")
	public ResponseEntity<List<String>> deleteCountryById(@PathVariable("name") String name) {
		
		ListIterator<String> itr = list.listIterator();
		
		while (itr.hasNext()) {
			String cname = (String) itr.next();
			if (cname.equals(name))
				itr.remove();
		}

		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}

	@GetMapping(value = "country/{name}")
	public ResponseEntity<String> getCountryById(@PathVariable("name") String name) {
		
		ListIterator<String> itr = list.listIterator();
		String countryName =null;
		
		while (itr.hasNext()) {
			String cname = (String) itr.next();
			if (cname.equals(name))
				countryName=cname;
		}

		return new ResponseEntity<String>(countryName, HttpStatus.OK);
	}

}
