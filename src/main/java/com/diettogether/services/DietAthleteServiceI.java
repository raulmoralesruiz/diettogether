package com.diettogether.services;

import java.util.List;

import com.diettogether.exceptions.DietRequestException;
import com.diettogether.model.DietAthlete;
import com.diettogether.model.DietFriendRequest;
import com.diettogether.model.dto.DietAthleteDTO;

public interface DietAthleteServiceI {
	
	public DietAthlete getAthlete(String username);

	public DietAthlete signUpPrincipalData(String username, DietAthleteDTO athleteDto);
	
	public DietFriendRequest sendFriendRequest(String claimantUsername, String requestedUsername) throws DietRequestException;
	
	public DietFriendRequest acceptFriendRequest(Long id);
	
	public DietFriendRequest rejectFriendRequest(Long id);
	
	public List<String> getAthleteFriends(String username);
	
	public List<DietFriendRequest> getFriendsRequests(String username);
	
	public List<String> getAthletesByInitials(String initials);
}
