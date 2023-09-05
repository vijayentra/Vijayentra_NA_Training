package com.service;

import org.springframework.stereotype.Service;

import com.model.Ticket;

//use appropriate annotation to configure BillService as a Service
@Service
public class BillService {

	// calculate the totalCost and return the cost
	public double calculateTotalCost(Ticket ticket) {
		double cost = 0.0;
			switch(ticket.getTicketType()) {
			case "Balcony":
				cost = ticket.getNoOfTickets()*280;
				break;
			case "Floor":
				cost = ticket.getNoOfTickets()*100;
				break;
			case "KingCircle":
				cost = ticket.getNoOfTickets()*180;
				break;
			case "QueenCircle":
				cost = ticket.getNoOfTickets()*200;
				break;
			default:
				break;
			}
		if(ticket.getRefreshment().equals("YES")) {
			cost+=ticket.getNoOfTickets()*100;
		}
		if(ticket.getNoOfTickets()>=10) {
			cost=cost*0.95;
		}
		return cost;
	}
}
