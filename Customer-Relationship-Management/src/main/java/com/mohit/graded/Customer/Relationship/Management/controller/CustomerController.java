package com.mohit.graded.Customer.Relationship.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mohit.graded.Customer.Relationship.Management.model.Customer;
//import com.mohit.graded.Customer.Relationship.Management.service.CustomerService;
import com.mohit.graded.Customer.Relationship.Management.service.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		
		List<Customer> theCustomers = customerService.getCustomers();
				
		
		model.addAttribute("customers", theCustomers);
		
		return "home";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		
		Customer theCustomer = new Customer();
		
		model.addAttribute("customer", theCustomer);
		
		return "form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		
		customerService.saveCustomer(theCustomer);	
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model model) {
		
		
		Customer theCustomer = customerService.getCustomer(theId);	
		
		
		model.addAttribute("customer", theCustomer);
		
		
		return "form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		
		
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
	}
}
