package com.f1.formula.one.series.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f1.formula.one.series.domain.Season;

@Repository 
 public interface SeasonRepository extends JpaRepository<Season,Long>{
 
	Optional<Season> findBySeason(String season);
 }
 