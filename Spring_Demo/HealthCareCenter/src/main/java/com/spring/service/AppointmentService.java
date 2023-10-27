package com.spring.service;


import org.springframework.stereotype.Service;

import com.spring.model.Appointment;

//use appropriate annotation to configure ContestantService as a Service
@Service
public class AppointmentService {
	
	//Return the consultation charge
	public int bookAppointment(Appointment appointment)  {	
		int charges = 0;
		switch(appointment.getConsultationFor()) {
		case "Optometry":
			charges = 500;
			break;
		case "Psychology":
			charges = 350;
			break;
		case "Pediatrist":
			charges = 750;
			break;
		case "Physical therapy":
			charges = 400;
			break;
		default:
			charges = 450;
			break;
		}
		return charges;
	}

}
