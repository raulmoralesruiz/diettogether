package com.diettogether.security.restcontroller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.diettogether.exceptions.DietUserException;
import com.diettogether.security.model.dto.DietUserDTO;
import com.diettogether.security.services.impl.DietUserServiceImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class DietUserController {

	@Autowired
	private DietUserServiceImpl userService;

	@PostMapping("/sign-up")
	public ResponseEntity<?> signUp(@RequestBody DietUserDTO userDTO) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(userService.createNewUser(userDTO));
		}catch(DietUserException e){
			 return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getCode());
		}
		catch(Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody DietUserDTO userDTO) throws IOException{
		// Created only to retrieve the Bearer token once authenticated
		
		return ResponseEntity.status(HttpStatus.OK).body(userService.loginUser(userDTO));
	}

}
