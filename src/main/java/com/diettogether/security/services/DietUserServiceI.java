package com.diettogether.security.services;

import org.springframework.security.core.userdetails.UserDetails;

import com.diettogether.exceptions.DietUserException;
import com.diettogether.security.model.dto.DietUserDTO;

public interface DietUserServiceI {

	public UserDetails loadUserByUsername(String username);

	public DietUserDTO createNewUser(DietUserDTO userDTO) throws DietUserException;
	
	public DietUserDTO loginUser(DietUserDTO userDTO);
}
