package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by song on 2017/11/1.
 */
//@RepositoryRestController
//扩展API
// a custom handler for a specific resource
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

//    http://127.0.0.1:8083/api/persons/search/listPerson
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/persons/search/listPerson")
    public ResponseEntity<?> getPersons() {
        List<Person> persons = (List<Person>) personRepository.findAll();
        //
        // do some intermediate processing, logging, etc. with the producers
        //
        Resources<Person> resources = new Resources<Person>(persons);

        resources.add(linkTo(methodOn(PersonController.class).getPersons()).withSelfRel());

        // add other links as needed

        return ResponseEntity.ok(resources);
    }

}