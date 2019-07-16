package com.mum.cs544.AirportProject.controller;

import com.mum.cs544.AirportProject.model.Airport;
import com.mum.cs544.AirportProject.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirportController {
    @Autowired
    AirportService airportService;

    @PostMapping(value="/saveAirport")
    public void saveRegistration(Airport airport) {
        airportService.save(airport);
    }

    @GetMapping(value = "/airport/list")
    public List<Airport> getAll() {
       return airportService.searchAll();
    }
    @GetMapping(value = "/deleteairport/{id}")
    public void delete(@PathVariable("id") long id) {
        airportService.delete(id);
    }
    @RequestMapping(value = "/editairport/{id}")
    public Airport edit(@PathVariable Long id) {
      return  airportService.findOne(id);
    }
    @RequestMapping(value = "/findById/{id}")
    public Airport findById(@PathVariable Long id) {
        return  airportService.findOne(id);
    }




}
