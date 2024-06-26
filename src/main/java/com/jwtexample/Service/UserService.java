package com.jwtexample.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwtexample.model.User;

@Service
public class UserService {
	
	private List<User> store =  new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Balaji","Bal@gamil"));
		store.add(new User(UUID.randomUUID().toString(),"Dipak","Dip@gamil"));
		store.add(new User(UUID.randomUUID().toString(),"Amaan","amman@gamil"));
		store.add(new User(UUID.randomUUID().toString(),"owais","owais@gamil"));
	}
	
	public List<User> getUser(){
		return this.store;
		
	}

}
