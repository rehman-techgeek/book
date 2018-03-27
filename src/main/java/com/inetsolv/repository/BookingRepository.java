package com.inetsolv.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inetsolv.entity.BookingRecord;


public interface BookingRepository extends JpaRepository<BookingRecord, Long> {
	
}
