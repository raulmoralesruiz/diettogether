package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietMailBox;

@Repository
public interface DietMailBoxRepository extends JpaRepository<DietMailBox, Long> {

}
