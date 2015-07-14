package com.fwwdn.hessian.service;

import com.fwwdn.hessian.meta.*;

/**
 * 
 * @author fww
 *
 */
public enum UserService {
	INSTANCE;
	public User getUserByName(String name) {
		User user = new User();
		user.setName(name);
		return user;
	}

	public User updateUser(User user) {
		return user;
	}
}
