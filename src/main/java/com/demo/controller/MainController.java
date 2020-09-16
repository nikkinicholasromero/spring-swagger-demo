package com.demo.controller;

import com.demo.model.SomeModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @GetMapping("/{somePathVariable}")
    public String getEndpoint(
            @PathVariable("somePathVariable") String somePathVariable,
            @RequestParam("someRequestParam") String someRequestParam) {
        return somePathVariable + " : " + someRequestParam;
    }

    @PostMapping("/")
    public SomeModel postEndpoint(@RequestBody SomeModel someModel) {
        return someModel;
    }
}
