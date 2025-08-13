package com.kashyap.cricketmanagement.mapper;

import com.kashyap.cricketmanagement.domain.UserDetail;
import com.kashyap.cricketmanagement.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component("userMapper")
public class UserMapper extends BaseDomainToDTOMapper<UserDTO, UserDetail> {

    @Override
    public UserDTO toDto(UserDetail entity) {

        return UserDTO.builder()
                .username(entity.getUserName())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }
}
