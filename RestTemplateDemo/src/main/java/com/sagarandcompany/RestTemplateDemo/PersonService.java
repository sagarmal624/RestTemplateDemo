package com.sagarandcompany.RestTemplateDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {
    @Autowired
    RestTemplate restTemplate;

    public Person save(Person person) {
        return restTemplate.postForEntity("http://localhost:8090/person/save", person, Person.class).getBody();

    }

    public Person get(Long id) {
        return restTemplate.getForEntity("http://localhost:8090/person/get/" + id, Person.class).getBody();
    }

    public Person update(Person person) {
        restTemplate.put("http://localhost:8090/person/update", person);
        return person;
    }

    public Person custom(Person person) {
        HttpEntity<Person> entity = new HttpEntity<Person>(person);
        ResponseEntity<Person> responseEntity = restTemplate.exchange("http://localhost:8090/person/update", HttpMethod.POST, entity, Person.class);
        return responseEntity.getBody();
    }

}
