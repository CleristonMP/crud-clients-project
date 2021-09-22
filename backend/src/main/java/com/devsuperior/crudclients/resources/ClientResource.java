package com.devsuperior.crudclients.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudclients.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Joao", "123456", 12000.0, null, 2));
		list.add(new Client(2L, "Maria", "987654", 18000.00, null, 3));
		return ResponseEntity.ok().body(list);		
	}
}
