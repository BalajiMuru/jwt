package com.jwtexample.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService {

	UserDetails loaduserByUsername(String username) throws UsernameNotFoundException;
}
