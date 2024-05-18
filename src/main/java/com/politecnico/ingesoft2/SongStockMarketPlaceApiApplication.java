package com.politecnico.ingesoft2;

import com.github.dozermapper.core.DozerBeanMapper;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.inject.DozerBeanContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SongStockMarketPlaceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongStockMarketPlaceApiApplication.class, args);
	}

}
