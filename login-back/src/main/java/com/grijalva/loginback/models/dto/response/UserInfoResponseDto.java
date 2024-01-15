package com.grijalva.loginback.models.dto.response;

import java.util.List;

public class UserInfoResponseDto {
    private Long id;
    private String username;
    private String name;
    private String lastname;
    private int ci;
    private String email;
    private List<String> roles;

    public UserInfoResponseDto(Long id, String username, String name, List<String> roles) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.ci = ci;
        this.email = email;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
