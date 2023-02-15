package com.example.kiii_project_final;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.util.List;

@RestController
@RequestMapping("/api/project")
@AllArgsConstructor
public class HelloController {

    private final PersonService personService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!!";
    }

    @GetMapping()
    public List<Person> getPersons(){
        return this.personService.getAll();
    }

    @PostMapping("/save")
    public void savePerson(@RequestBody PersonDto personDto){
        this.personService.save(personDto);
    }

}
