package com.f1.formula.one.series.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.Season;

@RestController
@RequestMapping(value = "/seasons")
public class SeasonController {

	@RequestMapping(method = RequestMethod.GET)
	public List<Season> listSeason() {

		Season season3 = new Season("2003", "http://en.wikipedia.org/wiki/2003_Formula_One_season");
		Season season4 = new Season("2004", "http://en.wikipedia.org/wiki/2004_Formula_One_season");
		Season season5 = new Season("2005", "http://en.wikipedia.org/wiki/2005_Formula_One_season");
		List<Season> seasonList = new ArrayList<>();
		seasonList.add(season3);
		seasonList.add(season4);
		seasonList.add(season5);

		return seasonList;
	}

}
