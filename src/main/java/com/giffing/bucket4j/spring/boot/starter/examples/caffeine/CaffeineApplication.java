package com.giffing.bucket4j.spring.boot.starter.examples.caffeine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableCaching
public class CaffeineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaffeineApplication.class, args);
	}

	@Configuration
	public static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		protected void configure(HttpSecurity http) throws Exception {
			http
					.authorizeRequests().anyRequest().permitAll();
		}

	}

}
