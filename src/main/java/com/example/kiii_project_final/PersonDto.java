package com.example.kiii_project_final;

import lombok.Data;

@Data
public class PersonDto {

    private String name;

    private String surname;

    private String phoneNumber;

    public PersonDto(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
}
