package com.inetsolv.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inetsolv.entity.Inventory;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	Inventory findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
	
}
