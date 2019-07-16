package com.mum.cs544.SchedulingProject.repository;

import edu.mum.cs5.airTicketbooking.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository  extends JpaRepository<Airport, Long> {

}
