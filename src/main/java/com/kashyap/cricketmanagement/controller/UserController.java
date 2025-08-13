package com.kashyap.cricketmanagement.controller;

import com.kashyap.cricketmanagement.dto.UserDTO;
import com.kashyap.cricketmanagement.dto.UserResponse;
import com.kashyap.cricketmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public UserResponse addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }
}
