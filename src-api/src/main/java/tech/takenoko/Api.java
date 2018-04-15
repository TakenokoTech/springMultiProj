package tech.takenoko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.takenoko.Core;

@SpringBootApplication
public class Api {

	Core core;

	public static void main(String[] args) {
		SpringApplication.run(Api.class, args);
	}

}
