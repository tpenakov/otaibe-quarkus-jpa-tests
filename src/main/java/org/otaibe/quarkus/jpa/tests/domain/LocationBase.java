package org.otaibe.quarkus.jpa.tests.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@NoArgsConstructor
public class LocationBase {
    private String name;
}
