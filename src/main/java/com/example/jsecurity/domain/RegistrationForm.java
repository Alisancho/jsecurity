package com.example.jsecurity.domain;

import lombok.Data;

import javax.persistence.Column;
import java.util.Collections;

@Data
public class RegistrationForm {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private String emain;

    public User toUser() {
        User user = new User();
        user.setEmain(emain);
        user.setPassword(password);
        user.setPhone(password);
        user.setUsername(username);
        user.setRoles(Collections.singleton(Role.USER));
        return user;
    }
}
