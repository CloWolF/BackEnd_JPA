package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.controllers.CustomerController;
import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;


@RestController
public class CustomerControllerImpl implements CustomerController {
	@Autowired
	CustomerService customerService;


	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/customers", produces = "application/json")
	@Override
	public List<Customer> getCustomers() {
		return customerService.findAllCustomers();
	}


	// http://localhost:8888/customers/1 (GET)
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/customers/{id}", produces = "application/json")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return customerService.findCustomerById(id);
	}


	// http://localhost:8888/customers/add (ADD)
	@Override
	//@RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
	@RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
	public Customer addCustomer(Customer customer) {
		return customerService.saveCustomer(customer);
	}


	// http://localhost:8888/customers/delete/1 (GET)
	@Override
	@GetMapping(value = "/customers/delete/{id}", produces = "application/json")
	public String deleteCustomer(@PathVariable Long id) {
		return customerService.deleteCustomer(id);
	}


	// http://localhost:8888/customers/update (PATCH)
	@Override
	@PatchMapping(value = "/customers/update", produces = "application/json")
	public String updateCustomer(Customer customerNew) {
		return customerService.updateCustomer(customerNew);
	}


	// http://localhost:8888/test (GET)
	@GetMapping(value = "/test", produces = "application/json")
	@Override
	public String test() {
		return "Test done Weee 3";
	}
}
