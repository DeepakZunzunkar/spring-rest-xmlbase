package com.dz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/customer/way3/")
public class CustomerController3 {

	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping
	public List<Customer> getCustomers(){
		return customerService.findAllCustomer();
	}
	
	//@RequestMapping(method = RequestMethod.POST) --shortcut way write --> @PostMapping
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		customer = customerService.addCustomer(customer);	
		return customer;
	}
	
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer) {
		customer = customerService.updateCustomer(customer);	
		return customer;
	}

//	@RequestMapping(value="{cid}",method=RequestMethod.GET)
	@GetMapping("{cid}")
	public Customer getCustomer(@PathVariable("cid") Integer cid) {
		return  customerService.findByCustomerId(cid);
	}
	
	@DeleteMapping("{cid}")
	public boolean deleteCustomeByid(@PathVariable("cid") Integer cid) {
		return  customerService.deleteCustomer(cid);
	}
	
}
