package com.example.kjj.dto;

import com.example.kjj.validation.PasswordMatches;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordMatches
public class UserDto {

    @Getter @Setter
    @NotNull @NotEmpty
    private String firstName;

    @Getter @Setter
    @NotNull @NotEmpty
    private String lastName;

    @Getter @Setter
    @NotNull @NotEmpty
    private String password;

    @Getter @Setter
    @NotNull @NotEmpty
    private String matchingPassword;

    @Getter @Setter
    @NotNull @NotEmpty @Email
    private String email;

    @Getter @Setter
    @NotNull @NotEmpty
    private String username;
}
