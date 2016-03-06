package com.lynas.controller;

import com.lynas.model.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LynAs on 05-Mar-16
 */
@RestController
public class RestControllerTest {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Test test(){
        HttpStatus status = HttpStatus.OK;
        return new Test(1, "sa");
    }
}
