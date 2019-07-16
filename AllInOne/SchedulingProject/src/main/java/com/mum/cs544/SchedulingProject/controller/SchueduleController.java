package com.mum.cs544.SchedulingProject.controller;
import com.mum.cs544.SchedulingProject.model.Schuedule;
import com.mum.cs544.SchedulingProject.repository.AirportRepository;
import com.mum.cs544.SchedulingProject.service.AirplaneService;
import com.mum.cs544.SchedulingProject.service.SchueduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchueduleController {

    @Autowired
    AirportRepository airportRepository;

    @Autowired
    SchueduleService schueduleService;

    @Autowired
    AirplaneService airplaneService;

    @PostMapping("/saveSchuedule")
    public void  addNewFlightSchedule(@RequestBody Schuedule schuedule) {
      schueduleService.SaveSchuedule(schuedule);
    }

////    /////
//    @GetMapping(value="/newSchuedule")
//    public String recordingSchuedule(ModelMap model) {
//        Schuedule schuedule = new Schuedule();
//        model.addAttribute("schuedule",schuedule);
//        return "admin/addSchuedulingPage";
//    }
//    @PostMapping(value="/saveSchuedule")
//    public String saveSchuedule(@Valid Schuedule schuedule, BindingResult result, ModelMap model, RedirectAttributes redirectAttributes) {
//        schueduleService.SaveSchuedule(schuedule);
//        return "redirect:/admin/schueduleList";
//    }
//
//    @PostMapping(value="/saveSchuedule")
//    public String saveSchuedule(@Valid @ModelAttribute("schuedule") Schuedule schuedule ,BindingResult bindingResult , ModelMap model) {
//
//        if (bindingResult.hasErrors()) {
//            model.addAttribute( "errors", bindingResult.getAllErrors());
//            model.addAttribute("airports", airportRepository.findAll(Sort.by("airportCode")));
//
//        }
//
//        schueduleService.SaveSchuedule(schuedule);
//        return "redirect:/admin/schueduleList";
//    }
    @GetMapping(value = "/admin/schueduleList")
    public List<Schuedule> getAll() {
        return schueduleService.searchAllSchuedule();
    }
//

    @GetMapping(value="/findSchedule/{id}")
    public Schuedule searchFilightSchedule (@PathVariable Long id) {
        return schueduleService.searchById(id);
    }

    @GetMapping(value="/editschuedule/{id}")
    public Schuedule editFilightSchedule (@PathVariable("id") Long id) {
        return schueduleService.searchById(id);
    }

//    @PostMapping(value = "/editsave")
//    public String editsave(@ModelAttribute("schuedule") Schuedule p) {
//        Schuedule schuedule = schueduleService.searchById(p.getId());
//        schuedule.setDepartureAirport(p.getDepartureAirport());
//        schuedule.setDepartureDate(p.getDepartureDate());
////        schuedule.setDepartureTime(p.getDepartureTime());
//        schuedule.setArriavaleAirport(p.getArriavaleAirport());
////        schuedule.setArrivaleTime(p.getArrivaleTime());
//        schuedule.setArrivaleaDate(p.getArrivaleaDate());
//        schuedule.setPrice(p.getPrice());
//
//        schueduleService.SaveSchuedule(schuedule);
//        return "redirect:/schuedule/list";
//    }

    @DeleteMapping(value="/deleteschuedule/{id}")
    public void delete(@PathVariable Long id) {
        schueduleService.deleteSchueduleById(id);
//        return "redirect:/admin/schueduleList";
    }

//    @GetMapping(value = "/searchForm")
//    public String flightForm(Model model) {
//        model.addAttribute("schuedule", new Schuedule());
//        List<Airport> airports = airportRepository.findAll();
//        model.addAttribute("airports", airports);
//        return "customer/searchFlight";
//    }
//
////    //creating flight search method
////    @GetMapping(value ="/search")
////    public ModelAndView searchFlight(Schuedule s) {
////
////        System.out.print( "This is mukara  Frist to check  filled  information to search possible flight\n\n" + s.toString());
////        List<Schuedule> flights=  schueduleService.availableFlights(s);
////        ModelAndView mv = new ModelAndView();
////        mv.addObject("flights", flights);
////        mv.setViewName("customer/availableFlightList");
////        return  mv;
////    }
//
//
//    @PostMapping(value = "/search")
//    public ModelAndView getAvalableFlightSchuedule(@Valid @ModelAttribute("schuedule") Schuedule schuedule) {
////        if (bindingResult.hasErrors()) {
////            model.addAttribute("errors", bindingResult.getAllErrors());
////            List<Airport> airports = airportRepository.findAll();
////            model.addAttribute("airports", airports);
////            return "admin/addSchuedulingPage";
////        }
//
//        System.out.print( "This is mukara  First to check  filled  information to search possible flight\n\n" +
//                schuedule.toString());
//
//        List<Schuedule> flights=  schueduleService.availableFlights(schuedule);
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("flights", flights);
//        mv.setViewName("customer/availableFlightList");
//        return  mv;
////        schueduleService.SaveSchuedule(schuedule);
////        return "redirect:/admin/schueduleList";
//    }

}
