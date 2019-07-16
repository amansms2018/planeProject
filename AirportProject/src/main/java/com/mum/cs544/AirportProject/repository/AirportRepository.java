package com.mum.cs544.AirportProject.repository;

import com.mum.cs544.AirportProject.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository  extends JpaRepository<Airport, Long> {

}
