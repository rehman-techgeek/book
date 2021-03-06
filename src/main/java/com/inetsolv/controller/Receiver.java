package com.inetsolv.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inetsolv.component.BookingComponent;
import com.inetsolv.component.BookingStatus;


@Component
public class Receiver {
	
	BookingComponent bookingComponent;
	
	@Autowired
	public Receiver(BookingComponent bookingComponent){
		this.bookingComponent = bookingComponent;
	}
	
	@RabbitListener(queues = "CheckINQ")
    public void processMessage(Long bookingID ) {
		System.out.println(bookingID);
		bookingComponent.updateStatus(BookingStatus.CHECKED_IN, bookingID);
    }
	
}