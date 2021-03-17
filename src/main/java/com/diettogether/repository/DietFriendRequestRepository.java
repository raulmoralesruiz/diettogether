package com.diettogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diettogether.model.DietFriendRequest;

@Repository
public interface DietFriendRequestRepository extends JpaRepository<DietFriendRequest, Long>{

}
