package com.kashyap.cricketmanagement.dto;

import java.io.Serializable;

public class UserResponse implements Serializable{

    private UserDTO userDTO;
    private String message;
    private Boolean isSuccess = Boolean.TRUE;
    private Boolean isError = Boolean.FALSE;

    public UserResponse(UserDTO userDTO, String message, Boolean isSuccess, Boolean isError) {
        this.userDTO = userDTO;
        this.message = message;
        this.isSuccess = isSuccess;
        this.isError = isError;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }
}
