package com.kashyap.cricketmanagement.service;

import com.kashyap.cricketmanagement.domain.UserDetail;
import com.kashyap.cricketmanagement.dto.UserDTO;
import com.kashyap.cricketmanagement.dto.UserResponse;

public interface UserService {

    public UserResponse addUser(UserDTO userDTO);
}
