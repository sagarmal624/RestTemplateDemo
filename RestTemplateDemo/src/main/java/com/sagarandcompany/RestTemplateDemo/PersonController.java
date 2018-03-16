package com.sagarandcompany.RestTemplateDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/save")
    public Person save() {
        Person person = new Person();
        person.setId(1L);
        person.setName("sagar");
        person.setEmail("sagarmal624@gmail.com");
        person.setSalary(1000);
        return personService.save(person);
    }

    @GetMapping("/get/{id}")
    public Person get(@PathVariable("id") Long id) {
        return personService.get(id);
    }

    @GetMapping("/update")
    public Person get() {
        Person person = new Person();
        person.setId(1L);
        person.setName("sagar");
        person.setEmail("sagarmal624@gmail.com");
        person.setSalary(1000);
        return personService.update(person);
    }

    @GetMapping("/customUpdate")
    public Person custom() {
        Person person = new Person();
        person.setId(1L);
        person.setName("sagar");
        person.setEmail("sagarmal624@gmail.com");
        person.setSalary(1000);
        return personService.custom(person);
    }

}
