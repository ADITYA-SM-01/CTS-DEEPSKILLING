package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.cognizant.orm_learn.OrmLearnApplication.countryService;


@SpringBootTest
class OrmLearnApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplicationTests.class);
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

}
