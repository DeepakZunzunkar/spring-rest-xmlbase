package com.dz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dz.app.model.Customer;
import com.dz.app.service.CustomerService;

@RestController
@RequestMapping("/customer/way2/")
public class CustomerController2 {

	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.findAllCustomer();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer) {
		customer = customerService.addCustomer(customer);	
		return customer;
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		customer = customerService.updateCustomer(customer);	
		return customer;
	}

	@RequestMapping(value="{cid}",method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable("cid") Integer cid) {
		return  customerService.findByCustomerId(cid);
	}
	
	
	@RequestMapping(value="{cid}",method=RequestMethod.DELETE)
	public boolean deleteCustomeByid(@PathVariable("cid") Integer cid) {
		return  customerService.deleteCustomer(cid);
	}
	
}
