package org.otaibe.quarkus.jpa.tests.web.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.otaibe.quarkus.jpa.tests.dao.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
@Getter
@Setter
@Slf4j
public class TestRestController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public String hello() {
        return getLocationRepository()
                .findByNameContainingIgnoreCase("sof")
                .stream()
                .findFirst()
                .get()
                .getName();
    }
}