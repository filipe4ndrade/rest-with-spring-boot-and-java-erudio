package br.com.apigateway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apigateway.model.Person;
import br.com.apigateway.services.PersonServices;

@RestController
@RequestMapping(value="/person")
public class PersonController {

	@Autowired
	private PersonServices service;
	// private PersonServices service = new PersonServices();

	@GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable String id) {
		return service.findById(id);
	}

}
