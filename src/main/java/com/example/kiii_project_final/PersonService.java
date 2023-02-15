package com.example.kiii_project_final;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepo personRepo;

    public List<Person> getAll() {
        return this.personRepo.findAll();
    }

    public void save(PersonDto personDto) {

        this.personRepo.save(new Person(personDto.getName(),personDto.getSurname(),personDto.getPhoneNumber()));
    }

}
