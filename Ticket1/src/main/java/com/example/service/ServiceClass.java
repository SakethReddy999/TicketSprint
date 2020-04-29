
package com.example.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Employee;
import com.example.entity.Ticket;
import com.example.dao.DaoClass;

@Service
@Transactional
public class ServiceClass 
{
@Autowired
DaoClass dao;

public Ticket Ticketgeneration(Ticket mv) {
	return dao.Ticketgeneration(mv);
}

public Ticket getTicketById(int id) 
{
return dao.getTicketById(id);
}

public List<Ticket> getAllTicket() 
{
return dao.getAllTicket();
}



}


	
	

