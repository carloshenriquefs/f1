package com.f1.formula.one.series.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f1.formula.one.series.domain.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

	Optional<Driver> findByDriver(String driver);

}
