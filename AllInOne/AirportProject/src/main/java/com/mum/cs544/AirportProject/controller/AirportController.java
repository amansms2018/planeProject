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

    @PostMapping( value = "/saveAirport")
    public void saveAirport(@RequestBody Airport airport)
    {
        airportService.save(airport);
    }

    @GetMapping(value = "/airport/list")
    public List<Airport> getAll() {
        return airportService.getAll();
    }


    @DeleteMapping("/deleteairport/{id}")
    public void delete(@PathVariable("id") long id) {
        airportService.delete(id);
    }

    @PutMapping("/airPort/edit")
    public void edit(@RequestBody Airport arpt) {
        //airportService.
        airportService.save(arpt);
    }

    @RequestMapping(value = "/airPort/findById/{id}")
    public Airport findById(@PathVariable Long id) {

        return  airportService.getOne(id);
    }




}
