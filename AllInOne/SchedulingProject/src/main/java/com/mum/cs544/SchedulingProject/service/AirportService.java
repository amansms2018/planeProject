package com.mum.cs544.SchedulingProject.service;
import com.mum.cs544.SchedulingProject.model.Airport;
import com.mum.cs544.SchedulingProject.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public  class AirportService    {
    @Autowired
    AirportRepository airportRepository;

    public void save( Airport airport) {
         airportRepository.save(airport);
    }
    public List<Airport> searchAll() {
        return airportRepository.findAll();
    }

    public Airport findOne(Long id) {
        return airportRepository.getOne(id);
    }

    public long count() {
        return  airportRepository.count() ;
    }
    public void delete(long id) {
        airportRepository.deleteById(id);
    }
}
