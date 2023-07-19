package com.dz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dz.app.model.Customer;
import com.dz.app.service.CustomerService;

@RestController
@RequestMapping("/customer/way4/")
public class CustomerController4 {

	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping
	public ResponseEntity<List<Customer>> getCustomers(){
		
//		return new ResponseEntity<body type >(body, HttpStatus code);
		return new ResponseEntity<List<Customer>>(customerService.findAllCustomer(),HttpStatus.OK);
//		return ResponseEntity.ok().body(customerService.findAllCustomer());
	}
	
	//@RequestMapping(method = RequestMethod.POST) --shortcut way write --> @PostMapping
	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		customer = customerService.addCustomer(customer);	
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		customer = customerService.updateCustomer(customer);	
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}

//	@RequestMapping(value="{cid}",method=RequestMethod.GET)
	@GetMapping("{cid}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("cid") Integer cid) {
		return new ResponseEntity<Customer>(customerService.findByCustomerId(cid),HttpStatus.OK); 
	}
	
	@DeleteMapping("{cid}")
	public ResponseEntity<Boolean> deleteCustomeByid(@PathVariable("cid") Integer cid) {
		return new ResponseEntity<Boolean>(customerService.deleteCustomer(cid),HttpStatus.OK);
	}
	
}
