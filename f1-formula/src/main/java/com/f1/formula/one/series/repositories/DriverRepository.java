package com.f1.formula.one.series.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f1.formula.one.series.domain.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
