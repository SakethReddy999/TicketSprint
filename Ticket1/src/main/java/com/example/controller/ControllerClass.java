
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Ticket;
import com.example.exceptions.IdNotFoundException;
import com.example.service.ServiceClass;

@RestController
@RequestMapping("/ticket")
@CrossOrigin("http://localhost:4200")
public class ControllerClass {
	private static final List<Ticket> mvlist = null;
	@Autowired
	ServiceClass serviceobj;

	// Create ticket
	@PostMapping("/Ticketgeneration")
	public ResponseEntity<String> Ticketgeneration(@RequestBody Ticket mv) {
		Ticket t = serviceobj.Ticketgeneration(mv);
		if (t == null) {
			throw new IdNotFoundException("Enter Valid Id");
		} else {
			return new ResponseEntity<String>("ticket generated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	// Get Particular Ticket Data
	@GetMapping("/GetTicket/{id}")
	private ResponseEntity<Ticket> getTicket(@PathVariable("id") int id) {
		Ticket t = serviceobj.getTicketById(id);
		if (t == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<Ticket>(t, new HttpHeaders(), HttpStatus.OK);
		}
	}

	// Get All ticket Data
	@GetMapping("/GetAllTickets")
	private ResponseEntity<List<Ticket>> getAllTicket() {
		List<Ticket> mvlist = serviceobj.getAllTicket();
		return new ResponseEntity<List<Ticket>>(mvlist, new HttpHeaders(), HttpStatus.OK);

	}



	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
