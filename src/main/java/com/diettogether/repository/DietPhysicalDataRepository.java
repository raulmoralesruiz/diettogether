package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietPhysicalData;

@Repository
public interface DietPhysicalDataRepository extends JpaRepository<DietPhysicalData, Long> {

}
