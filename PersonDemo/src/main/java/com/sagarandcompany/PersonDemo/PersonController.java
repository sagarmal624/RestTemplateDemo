package com.sagarandcompany.PersonDemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Person save(@RequestBody Person person) {
        System.out.println(person.toString());
        return person;
    }

    @GetMapping(value = "/get/{id}")
    public Person get(@PathVariable("id") Long id) {
        Person person = new Person();
        person.setId(1L);
        person.setName("sagar");
        person.setEmail("sagarmal624@gmail.com");
        person.setSalary(1000);
        return person;
    }

    @PutMapping(value = "/update")
    public Person update(@RequestBody Person person) {
        System.out.println(person.toString());
        return person;
    }
}
