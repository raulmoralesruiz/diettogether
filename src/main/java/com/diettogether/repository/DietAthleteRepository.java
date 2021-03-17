package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietAthlete;

@Repository
public interface DietAthleteRepository extends JpaRepository<DietAthlete, Long>{

}
