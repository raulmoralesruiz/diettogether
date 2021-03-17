package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietImc;

@Repository
public interface DietImcRepository extends JpaRepository<DietImc, Long>{

}
