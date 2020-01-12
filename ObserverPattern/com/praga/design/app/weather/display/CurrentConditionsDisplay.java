package com.praga.design.app.weather.display;

import com.praga.design.observer.Display;
import com.praga.design.observer.Observer;
import com.praga.design.observer.Subject;

public class CurrentConditionsDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current conditions:"+ temperature
				+ "F degrees and "+ humidity + "% humidity");

	}

	@Override
	public void update(float temperature, float humitidy, float pressure) {
		this.temperature = temperature;
		this.humidity = humitidy;
		display();
	}

}
