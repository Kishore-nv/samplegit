package com.example.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Ducatti")
public class DucattiBike implements Bike {

	
	@Value("${spring.bike2name.name}")
	private String name;
	
	@Value("${spring.bike2color.color}")
	private String color;
	
	@Override
	public String bikeName() {
		return this.name;
	}

	@Override
	public String bikeColor() {
		System.out.println(color);
		return this.color;
	}
	
	

}
