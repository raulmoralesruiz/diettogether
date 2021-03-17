package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietMealRegime;

@Repository
public interface DietMealRegimeRepository extends JpaRepository<DietMealRegime, Long> {

}
