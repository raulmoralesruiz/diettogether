package com.diettogether.services;

import java.util.List;

import com.diettogether.exceptions.DietRegisterException;
import com.diettogether.model.DietRegister;

public interface DietRegisterServiceI {

	public DietRegister createRegister(String username, DietRegister register) throws DietRegisterException;
	
	public List<DietRegister> getRegistersByUsername(String username);
}
