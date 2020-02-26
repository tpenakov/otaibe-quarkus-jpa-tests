package org.otaibe.quarkus.jpa.tests.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.otaibe.quarkus.jpa.tests.dao.LocationRepository;
import org.otaibe.quarkus.jpa.tests.domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController("commonLocationRestController")
@Slf4j
public class LocationsController {

    public static final String DESTINATIONS = "/destinations";
    public static final String DESTINATIONS_START_WITH = "/destinations-start-with";

    LocationRepository locationService;

    @RequestMapping(value = DESTINATIONS, produces = MediaType.APPLICATION_JSON)
    public List<Location> findDestinationByName(@RequestParam @NotNull String q) {
        return getLocationService().findByNameContainingIgnoreCase(q);
    }

    @RequestMapping(value = DESTINATIONS_START_WITH, produces = MediaType.APPLICATION_JSON)
    public List<Location> findDestinationByNameStartingWith(@RequestParam @NotNull String q) {
        return getLocationService().findByNameStartingWithIgnoreCase(q);
    }

    public LocationRepository getLocationService() {
        return locationService;
    }

    @Autowired
    public void setLocationService(LocationRepository locationService) {
        this.locationService = locationService;
    }
}
