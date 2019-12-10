package com.aprutledge.login.service;

import com.aprutledge.login.model.User;

public interface UserService {
	
	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);

}
