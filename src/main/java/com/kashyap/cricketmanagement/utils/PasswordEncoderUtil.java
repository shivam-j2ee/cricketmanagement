package com.kashyap.cricketmanagement.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    private PasswordEncoderUtil() {
        // Private constructor to prevent instantiation
    }

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public static String encode(String pass){
        return bCryptPasswordEncoder.encode(pass);
    }

}
