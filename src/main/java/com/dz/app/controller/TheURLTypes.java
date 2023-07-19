package com.dz.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.app.model.Customer;
import com.dz.app.model.Employee;

@RestController
@RequestMapping("/app/emp/")
public class TheURLTypes {

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmp(){
		System.out.println("Request Hitt to get All employee..");
		
		return new ResponseEntity<List<Employee>>(HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		System.out.println("employee added succesfully..");
		return ResponseEntity.ok().body(employee);
	}

	@GetMapping(value="{sid}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("sid") Integer id){
		
		System.out.println("Request Hit for Get Employee By id");
		return new ResponseEntity<Employee>(new Employee(1,"raj","1245789653","pune","permant"),HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		System.out.println("employee updated succesfully...");
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@DeleteMapping(value="{sid}")
	public ResponseEntity<Boolean> deleteEmp(@PathVariable("sid") Integer id){
		System.out.println("Employee Delete Successfully ...");
		Boolean body=true;
		return new ResponseEntity<Boolean>(body,HttpStatus.OK);
	}
	
	//----------Customer------------------
	
	@GetMapping(value="/{eid}/customer/")
	public ResponseEntity<List<Customer>> getAllCustomer(@PathVariable("eid") Integer id){
		System.out.println("Request Hitt to get All Customer..");
		return new ResponseEntity<List<Customer>>(HttpStatus.OK);
	}
	
	@PostMapping(value="/{eid}/customer/")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer,@PathVariable("eid") Integer id ){
		System.out.println("Customer added succesfully..");
		return ResponseEntity.ok().body(customer);
	}

	@GetMapping(value="/{eid}/customer/{cid}")
	public ResponseEntity<Customer> getCustomerByID(@PathVariable("eid") Integer sid,@PathVariable("cid") Integer cid){
		
		System.out.println("Request Hit for Get Customer By id");
		System.out.println("Society ID :"+sid);
		System.out.println("Customer ID :"+cid);
		return new ResponseEntity<Customer>(new Customer(1,"raj","1245789653","pune"),HttpStatus.OK);
	}
	
	@PutMapping(value="/{eid}/customer/")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,@PathVariable("eid") Integer id){
		System.out.println("Customer updated succesfully...");
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@DeleteMapping(value="{eid}/customer/{cid}")
	public ResponseEntity<Boolean> deleteCustomer(@PathVariable("eid") Integer id,@PathVariable("cid") Integer cid ){
		System.out.println("Customer Delete Successfully ...");
		Boolean body=true;
		return new ResponseEntity<Boolean>(body,HttpStatus.OK);
	}
	
	
}
