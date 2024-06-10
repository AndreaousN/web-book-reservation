package com.spring.web_book_reservation.Config;

import com.spring.web_book_reservation.WebBookReservationApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebBookReservationApplication.class);
	}

}
