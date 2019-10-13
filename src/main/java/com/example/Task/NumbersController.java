package com.example.Task;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    NumbersModel multiply(@RequestBody NumbersModel object) {
        object.setMultiplication();
        return object.getNumbers();
    }
}
