package com.kashyap.cricketmanagement.service.impl;

import com.kashyap.cricketmanagement.domain.UserDetail;
import com.kashyap.cricketmanagement.dto.UserPrincipal;
import com.kashyap.cricketmanagement.repository.UserDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserDetailRepo userDetailRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetail user = userDetailRepo.findByUserName(username);
        if (user == null){
            System.out.println("User not found with username: " + username);
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserPrincipal(user);
    }
}
