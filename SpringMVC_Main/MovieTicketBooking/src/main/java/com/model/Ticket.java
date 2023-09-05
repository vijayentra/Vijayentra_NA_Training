package com.model;

//pojo class with required attributes,getters and setters 


public class Ticket {

	private String customerName;
	private String contactNumber;
	private int noOfTickets;
	
	private String ticketType;
	private String refreshment;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getRefreshment() {
		return refreshment;
	}

	public void setRefreshment(String refreshment) {
		this.refreshment = refreshment;
	}

}
