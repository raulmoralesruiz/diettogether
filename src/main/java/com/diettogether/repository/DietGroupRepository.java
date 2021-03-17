package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietGroup;

@Repository
public interface DietGroupRepository extends JpaRepository<DietGroup,Long>{

}
