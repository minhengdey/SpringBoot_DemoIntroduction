package org.example.springboot_be;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class user {
    private String name;
    private int age;
    private String email;
    private String gender;
    private String phone;
    public user (String name, int age, String email, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }
}
