package com.narvatov.user_service.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class SignIn {

    private String email;
    private String password;

}
