package com.f1.formula.one.series;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.repositories.DriverRepository;

@SpringBootApplication
public class F1FormulaApplication implements CommandLineRunner  {

	@Autowired
	private DriverRepository driverRepository;

	public static void main(String[] args) {
		SpringApplication.run(F1FormulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Driver driver1 = new Driver(null, "abate", "http://en.wikipedia.org/wiki/Carlo_Mario_Abate", "Carlo", "Abate",
				"1932-07-10", "British");
		Driver driver2 = new Driver(null, "abecassis", "http://en.wikipedia.org/wiki/George_Abecassis", "George",
				"Abecassis", "1913-03-21", "British");

		driverRepository.saveAll(Arrays.asList(driver1, driver2));
	}

}
