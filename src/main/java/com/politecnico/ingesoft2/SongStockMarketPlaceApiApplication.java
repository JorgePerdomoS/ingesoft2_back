package com.politecnico.ingesoft2;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SongStockMarketPlaceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongStockMarketPlaceApiApplication.class, args);
	}

	@Bean
	public DozerBeanMapper mapper() {
		return new DozerBeanMapper();
	}
}
