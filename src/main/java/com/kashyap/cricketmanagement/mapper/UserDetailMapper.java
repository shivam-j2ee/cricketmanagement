package com.kashyap.cricketmanagement.mapper;

import com.kashyap.cricketmanagement.domain.UserDetail;
import com.kashyap.cricketmanagement.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component("userDetailMapper")
public class UserDetailMapper extends BaseDTOToDomainMapper<UserDetail, UserDTO>{
    @Override
    public UserDetail toEntity(UserDTO dto) {

        UserDetail userDetail = new UserDetail();
        userDetail.setUserName(dto.getUsername());
        userDetail.setFirstName(dto.getFirstName());
        userDetail.setLastName(dto.getLastName());
        userDetail.setPassword(dto.getPassword());
        return userDetail;
    }

}
