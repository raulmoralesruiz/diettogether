package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietDayRegime;

@Repository
public interface DietDayRegimeRepository extends JpaRepository<DietDayRegime, Long> {

}
