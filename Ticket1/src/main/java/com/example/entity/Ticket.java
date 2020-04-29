
package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Ticketdata")
public class Ticket {
	@Id
	private int ticketid;
	private String noofseats;
	private String seatname;
	private String ticketstatus;
	private String screenName;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(String noofseats) {
		this.noofseats = noofseats;
	}
	public String getSeatname() {
		return seatname;
	}
	public void setSeatname(String seatname) {
		this.seatname = seatname;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Ticket merge(Ticket mv) {
		// TODO Auto-generated method stub
		return null;
	}
	

	