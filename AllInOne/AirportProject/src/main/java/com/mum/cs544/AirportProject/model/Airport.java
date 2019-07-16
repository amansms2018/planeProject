package com.mum.cs544.AirportProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@JacksonXmlRootElement(localName = "Airport")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Data
@ToString
@Entity
public class Airport {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String airportName;
    private String airportCode;
    private String city;
    private String country;


    public long getId() {
        return id;
    }
    public Airport(Long id,String airportCode, String airportName, String city, String country) {
        this.id = id;
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.city = city;
        this.country = country;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Airport(String airportName, String city, String country) {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
    }
    public Airport() {
    }



    public String getAirportCode() {
        return airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
