package com.narvatov.user_service.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.narvatov.user_service.model.Status;
import com.narvatov.user_service.model.User;
import lombok.Data;

@Data
public class SimpleUserDTO {

    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private Status status;

    public SimpleUserDTO(User user) {
        id = user.getId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        status = user.getStatus();
    }

}
