package com.lynas.controller;

import com.lynas.appexception.Error;
import com.lynas.appexception.PeopleNotFoundException;
import com.lynas.model.People;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Created by LynAs on 05-Mar-16
 */
@RestController
public class RestControllerTest {
    public static final String APPLICATION_JSON = "application/json";
    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public People people(){
        //throw new PeopleNotFoundException(1);
        return new People(1, "sazzad");
    }


    @ExceptionHandler(PeopleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error peopleError(PeopleNotFoundException pe){
        return new Error(pe.getPeopleID(), "People of id not found");
    }



    @RequestMapping(value = "/peoplePost", method = RequestMethod.POST, consumes = APPLICATION_JSON)
    @ResponseBody
    public ResponseEntity<People> peoplePost(@RequestBody People people, UriComponentsBuilder ucb){
        HttpHeaders headers = new HttpHeaders();
        URI locationUri = ucb
                .path("people")
                .path(String.valueOf(people.getId()))
                .build()
                .toUri();
        headers.setLocation(locationUri);
        return new ResponseEntity<>(people, headers, HttpStatus.CREATED);
    }

}
