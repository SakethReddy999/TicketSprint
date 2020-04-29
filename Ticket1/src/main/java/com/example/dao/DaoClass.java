/**
 * 
 */
/**
 * @author reddy
 *
 */
package com.example.dao;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.entity.Ticket;
@Repository
public class DaoClass<EntityManager> implements DaoInterface {

	@PersistenceContext	
	 EntityManager mv;
	
	@Override
	public Ticket Ticketgeneration(Ticket mv) {
		// TODO Auto-generated method stub
		Ticket t=mv.merge(mv);
		return t;
	}
	
	@Override
	public Ticket getTicketById(int id) {
		
		return mv.find(Ticket.class,id);
	}
	
	@Override
	public List<Ticket> getAllTicket() {
		Query q=mv.createQuery("select * from Ticket ");
		List<Ticket> mvlist=q.getResultList();
		return mvlist;
	}
	
	
				


	