package com.f1.formula.one.series;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class F1FormulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(F1FormulaApplication.class, args);
	}

}
