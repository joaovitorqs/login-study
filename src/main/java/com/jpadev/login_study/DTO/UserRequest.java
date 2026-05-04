package com.jpadev.login_study.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {


    //Implementar futuramente demais validações.
    @NotBlank(message = "Name not blank.")
    private String userEmail;

    @NotBlank(message = "Name not blank.")
    private String userPassword;
}
