package com.mum4.PlaneProject.planeProject.repository;

import com.mum4.PlaneProject.planeProject.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Integer> {
	public List<Airplane> findAllByOrderByCapacityAsc();
}
