package com.shubham.postgis.repo;

import com.shubham.postgis.model.PolygonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolygonRepository extends JpaRepository<PolygonEntity, Long> {
}
