package com.mycompany.myapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenDTO {

    private String token;

    public TokenDTO(String token) {
        this.token = token;
    }

    @JsonProperty("token")
    String getToken() {
        return token;
    }

    void setToken(String token) {
        this.token = token;
    }
}
