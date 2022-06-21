package com.ctc.service;

import java.util.List;

import com.ctc.entities.*;
import com.ctc.exceptions.ResourceNotFoundException;

public interface UserServiceInterface {
	
	public User registerNewUser(User user);
	
	public Boolean deleteUser(String userId) throws ResourceNotFoundException;
	
	public User updateUserById(String userId ,User user) throws ResourceNotFoundException;
	
	//public User getUserById(String userId) throws ResourceNotFoundException;
	
	public List<User> getListOfUsers();
	

}
