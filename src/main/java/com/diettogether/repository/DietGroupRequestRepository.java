package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietGroupRequest;

@Repository
public interface DietGroupRequestRepository extends JpaRepository<DietGroupRequest, Long>{

}
