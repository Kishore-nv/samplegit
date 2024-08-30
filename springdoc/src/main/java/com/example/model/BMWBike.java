package com.example.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
//@Primary
@Qualifier("BMW")
public class BMWBike implements Bike {

	//@Value("${spring.bike1name.name}")
	private String bikeName;
	
	//@Value("${spring.bike1color.color}")
	private String bikeColor;
	
	public BMWBike(@Value("${spring.bike1name.name}") String name,@Value("${spring.bike1color.color}") String color) {
		this.bikeName=name;
		this.bikeColor=color;
		}
	
	@Override
	public String bikeName() {
		return this.bikeName;
	}

	@Override
	public String bikeColor() {
		return this.bikeColor;
	}	
	

}


