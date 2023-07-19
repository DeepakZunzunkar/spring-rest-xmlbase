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
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value="customer",method=RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.findAllCustomer();
	}
	
	@RequestMapping(value="customer",method=RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer) {
		customer = customerService.addCustomer(customer);	
		return customer;
	}
	
	@RequestMapping(value="customer",method=RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		customer = customerService.updateCustomer(customer);	
		return customer;
	}

	@RequestMapping(value="customer/{cid}",method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable("cid") Integer cid) {
		return  customerService.findByCustomerId(cid);
	}
	
	
	@RequestMapping(value="customer/{cid}",method=RequestMethod.DELETE)
	public boolean deleteCustomeByid(@PathVariable("cid") Integer cid) {
		return  customerService.deleteCustomer(cid);
	}
	

	@RequestMapping(value="customergetByid",method=RequestMethod.GET)
	public Customer getCustomer1(@RequestParam("cid") Integer cid) {
		return  customerService.findByCustomerId(cid);
	}
	
	
	
}
