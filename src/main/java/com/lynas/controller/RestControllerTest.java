package com.lynas.controller;

import com.lynas.appexception.Error;
import com.lynas.appexception.PeopleNotFoundException;
import com.lynas.model.People;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LynAs on 05-Mar-16
 */
@RestController
public class RestControllerTest {

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public People people(){
        throw new PeopleNotFoundException(1);
        //return new People(1, "sazzad");
    }


    @ExceptionHandler(PeopleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error peopleError(PeopleNotFoundException pe){
        return new Error(pe.getPeopleID(), "People of id not found");
    }
}
