package com.shubham.postgis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.locationtech.jts.geom.MultiPolygon;

@Entity
@Table(name = "polygon")
public class PolygonEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="polygon",  columnDefinition = "geography(MultiPolygon,4326)")
    private MultiPolygon polygon;

    @Column(name="area")
    private Double area;
}
