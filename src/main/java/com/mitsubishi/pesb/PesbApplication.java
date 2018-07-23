package com.mitsubishi.pesb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan(basePackages = "com.mitsubishi")
@ComponentScan(basePackages = "com.mitsubishi")
@SpringBootApplication
public class PesbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PesbApplication.class, args);
	}
}
