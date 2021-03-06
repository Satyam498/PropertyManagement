package com.cg.realestate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.Property;
import com.cg.realestate.service.PropertyService;

@RestController
@CrossOrigin
public class PropertyController {

	@Autowired
	PropertyService service;
	
	@PostMapping( path = "/")
	public Property addProperty(@Valid @RequestBody Property property) {
		return service.addProperty(property);
	}
	
	@GetMapping( path = "/display")
	public List<Property> display(){
		return service.display();
	}
	
	@GetMapping(path = "/{id}")
	public Property searchById(@Valid @PathVariable int id) {
		
		return service.searchById(id);
	}
	
	@GetMapping(path = "/{location}")
	public List<Property> searchByLocation(@Valid @PathVariable String location) {
		
		return service.searchByLocation(location);
	}
	
	@GetMapping(path = "/{type}")
	public List<Property> searchByType(@Valid @PathVariable String type) {
		
		return service.searchByType(type);
	}
	
	@GetMapping(path = "/{budget}")
	public List<Property> searchByBudget(@Valid @PathVariable double budget) {
		
		return service.searchByBudget(budget);
	}
}
