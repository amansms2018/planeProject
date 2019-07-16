package com.mum4.PlaneProject.planeProject.controller;

import com.mum4.PlaneProject.planeProject.model.Airplane;
import com.mum4.PlaneProject.planeProject.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class AirplaneController {

    @Autowired
    //private AirplaneRepository airplaneRepository;
    private AirplaneService airplaneService;

    @GetMapping(value = "/list")
    public List<Airplane> getListOfAirplanes() {
       // List<Airplane> planes = airplaneService.findAllAirplane();
       // model.addAttribute("jets", planes);
        return airplaneService.findAllAirplane();
    }



    //add a method to get the form data this is get mapping method
    @GetMapping(value = "/showForm")
    public void showFormForAdd() {
       Airplane plane = new Airplane();
        //model.addAttribute("jets", plane);
        airplaneService.saveAirplane(plane);
    }

    //adding a method that saves the supplied data to the database
    @PostMapping(value = "/save")
    public void saveAirplane(@RequestBody Airplane airplane) {
//        if(result.hasErrors()) {
//            System.out.println("error");
//        }
        airplaneService.saveAirplane(airplane);
    }

    @RequestMapping(value = "/edit/{id}")
    public void edit(@ RequestParam("id") Integer id) {
          airplaneService.updateById(id);
    }
    //deleteing airplane from the list
    @DeleteMapping(value ="/delete/{id}")

    public void deleteAirplane(@PathVariable("id") Integer id) {
        airplaneService.deleteAirplane(id);
    }
}



