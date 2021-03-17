package com.diettogether.services;

import java.util.List;

import com.diettogether.exceptions.DietGroupException;
import com.diettogether.model.DietGroup;
import com.diettogether.model.DietGroupRequest;
import com.diettogether.model.dto.DietProgressBarDto;

public interface DietGroupServiceI {

	public DietGroup createGroup(String username, DietGroup group) throws DietGroupException;

	public DietGroupRequest sendGroupRequest(String claimantUsername, String requestedUsername);

	public DietGroupRequest acceptGroupRequest(Long id) throws DietGroupException;

	public DietGroupRequest rejectGroupRequest(Long id);
	
	public List<DietGroupRequest> getGroupRequests(String username);
	
	public DietProgressBarDto getProgressBar(String username);
	
	public List<DietGroup> getOutGroup(String username);
}
