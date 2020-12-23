package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.entities.Address;
import com.sathya.service.IAddressService;

@RestController
@RequestMapping(params = "/Address")
public class AddressController {

	@Autowired
	private IAddressService addressService;;
	
	
	@PostMapping(path = "/insertData")
	public Address insertData(Address address) {
		
		return addressService.insertaddress(address);
	}
	
	
	@GetMapping(path = "/getAllAddress")
	public Iterable<Address>getAllstudent() {
		
		return addressService.getAllAddress();
	}
	
	
	
	@PutMapping(path = "/updateAddress")
	public Address updatestudent(Address addres) {
		
		return addressService.updateAddres(addres);
	}
	
	
	
	@DeleteMapping(path = "/deleteById")
	public void deleteById(Integer id ) {
		
		addressService.deleteById(id);
	}
	
}
