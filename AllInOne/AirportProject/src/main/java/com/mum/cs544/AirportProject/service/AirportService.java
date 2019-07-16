package com.mum.cs544.AirportProject.service;
import com.mum.cs544.AirportProject.model.Airport;
import com.mum.cs544.AirportProject.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Transactional
@Service
public  class AirportService    {
    @Autowired
    AirportRepository airportRepository;


    public void save(Airport airport) {

        airportRepository.save(airport);
    }


    public List<Airport> getAll() {

        return airportRepository.findAll();
    }

    public Airport getOne(Long id) {

        return airportRepository.getOne(id);
    }

    public void delete(long id) {

        airportRepository.deleteById(id);

    }

//    public void update(Airport airport) {
//
//        airportRepository.save(airport);
//    }


}
