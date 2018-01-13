package com.monarch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import com.monarch.repository.UserRepository;

@RestController
@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude={HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan({ "com.monarch" })
public class SpringApp extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringApp.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringApp.class, args);
	}

}