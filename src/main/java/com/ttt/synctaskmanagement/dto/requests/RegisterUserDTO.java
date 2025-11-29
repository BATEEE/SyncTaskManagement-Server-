package com.ttt.synctaskmanagement.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDTO {
    private String email;
    private String password;
    private String username;
}
