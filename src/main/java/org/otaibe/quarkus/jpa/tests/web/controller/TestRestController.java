package org.otaibe.quarkus.jpa.tests.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/test")
public class TestRestController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}