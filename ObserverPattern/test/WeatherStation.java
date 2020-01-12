package test;

import com.praga.design.app.weather.data.WeatherData;
import com.praga.design.app.weather.display.CurrentConditionsDisplay;
import com.praga.design.app.weather.display.HeatIndexDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay disp = new CurrentConditionsDisplay(data);
		HeatIndexDisplay hdisp = new HeatIndexDisplay(data);
		data.setMeasurements(80, 65, 30.4f);
		
		

	}

}
