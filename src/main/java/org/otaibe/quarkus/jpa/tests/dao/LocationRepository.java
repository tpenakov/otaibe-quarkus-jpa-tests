package org.otaibe.quarkus.jpa.tests.dao;

import org.otaibe.quarkus.jpa.tests.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by triphon on 15-7-30.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {
    /**
     * @param partialName the partial location name
     * @return the location found
     */
    List<Location> findByNameContainingIgnoreCase(String partialName);
    List<Location> findByNameStartingWithIgnoreCase(String partialName);
}
