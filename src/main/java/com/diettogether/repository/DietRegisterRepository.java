package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietRegister;

@Repository
public interface DietRegisterRepository extends JpaRepository<DietRegister,Long>{

}
