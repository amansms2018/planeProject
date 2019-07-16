package com.mum.cs544.SchedulingProject.service;

import com.mum.cs544.SchedulingProject.model.Airplane;

import java.util.List;


public interface AirplaneService {
	Airplane saveAirplane(Airplane airplane);
	List<Airplane> findAllAirplane();
	Airplane getAirplane(Integer id);
	void deletAirplane(Integer id);
	public List<Airplane> findOrderedAirplane();
	Airplane updateById(Integer id);
}
