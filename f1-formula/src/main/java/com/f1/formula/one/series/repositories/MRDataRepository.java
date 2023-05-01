package com.f1.formula.one.series.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f1.formula.one.series.domain.MRData;

@Repository
public interface MRDataRepository extends JpaRepository<MRData, Long> {

}
