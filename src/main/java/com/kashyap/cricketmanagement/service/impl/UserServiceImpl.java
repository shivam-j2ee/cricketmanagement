package com.kashyap.cricketmanagement.service.impl;

import com.kashyap.cricketmanagement.domain.UserDetail;
import com.kashyap.cricketmanagement.dto.UserDTO;
import com.kashyap.cricketmanagement.dto.UserResponse;
import com.kashyap.cricketmanagement.mapper.BaseMapper;
import com.kashyap.cricketmanagement.mapper.UserDetailMapper;
import com.kashyap.cricketmanagement.repository.UserDetailRepo;
import com.kashyap.cricketmanagement.service.UserService;
import com.kashyap.cricketmanagement.utils.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDetailMapper")
    private UserDetailMapper userDetailMapper;

    @Autowired
    private UserDetailRepo userDetailRepo;

    @Override
    public UserResponse addUser(UserDTO userDTO) {
        String password = PasswordEncoderUtil.encode(userDTO.getPassword());
        userDTO.setPassword(password);
        UserDetail detail= userDetailMapper.toEntity(userDTO);
        userDetailRepo.saveAndFlush(detail);

        return new UserResponse(userDTO,"User added successfully", true, false);
    }
}
