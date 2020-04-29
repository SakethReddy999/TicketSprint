package com.example.dao;
import java.util.List;

import com.example.entity.Ticket;

public interface DaoInterface {

	List<Ticket> getAllTicket();

	Ticket getTicketById(int id);

	Ticket Ticketgeneration(Ticket mv);

	
}


