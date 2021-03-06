package com.diettogether.security.services.impl;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.diettogether.common.DietExceptionCode;
import com.diettogether.exceptions.DietUserException;
import com.diettogether.security.model.dto.DietUserDTO;
import com.diettogether.security.model.dto.DietUserDTOConverter;
import com.diettogether.security.repository.DietUserRepository;
import com.diettogether.security.services.DietUserServiceI;

@Service("userService")
public class DietUserServiceImpl implements DietUserServiceI, UserDetailsService{

	@Autowired
	private DietUserRepository repository;

	@Autowired
	private DietUserDTOConverter converter;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findByUsername(username)
				.orElseThrow(()-> new UsernameNotFoundException("Username not found"));
	}
	
	public UserDetails loadUserById(Long idUser) throws AuthenticationException {
		return repository.findById(idUser)
				.orElseThrow(()-> new AuthenticationException("Id/username not found"));
	}	
	
	public DietUserDTO createNewUser(DietUserDTO userDTO) throws DietUserException{
		DietUserDTO dto = new DietUserDTO();
		if(repository.existsByUsername(userDTO.getUsername())) {
			throw new DietUserException(DietExceptionCode.ALREDY_USER_EXISTS);
		}else {
			 dto = converter.fromUserToUserDTO(repository.save(converter.fromUserDTOToUser(userDTO))); 
		}
		
		
		return dto;
	}

	@Override
	public DietUserDTO loginUser(DietUserDTO userDTO) {
		// TODO Auto-generated method stub
		
		DietUserDTO userDto = converter.fromUserToUserDTO(repository.findByUsername(userDTO.getUsername()).get());
		return userDto;
	}
}
