package com.lynas.controller;

import com.lynas.appexception.Error;
import com.lynas.appexception.PeopleNotFoundException;
import com.lynas.model.People;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LynAs on 05-Mar-16
 */
@RestController
public class RestControllerTest {

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public People people(){
        //HttpStatus status = HttpStatus.OK;
        throw new PeopleNotFoundException(1);
        //return new People(1, "sazzad");
    }


    @ExceptionHandler(PeopleNotFoundException.class)
    public ResponseEntity<Error> peopleError(PeopleNotFoundException pe){
        long peopleID = pe.getPeopleID();
        Error error = new Error(peopleID, "People of id not found");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
