package com.example.springdoc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Bike;
@SpringBootApplication(scanBasePackages = {"com.example.springdoc","com.example.model"})
public class SpringdocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdocApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandRunner(String[] args,@Qualifier("Ducatti") Bike bk)
	{
		return run ->{
			System.out.println("Started from linerunner");
//			System.out.println(String.format("Bike name : %s",bk.bikeName()));
//			System.out.println(String.format("Bike Color : %s", bk.bikeColor()));
//			System.out.println(bk);
			bk.bikeColor();
		};
	}

}
