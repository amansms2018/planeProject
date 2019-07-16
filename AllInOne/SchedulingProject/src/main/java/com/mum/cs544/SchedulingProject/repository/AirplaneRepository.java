package com.mum.cs544.SchedulingProject.repository;

import com.mum.cs544.SchedulingProject.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("AirplaneRepository")
public interface AirplaneRepository extends JpaRepository<Airplane, Integer> {
	public List<Airplane> findAllByOrderByCapacityAsc();
}
