import java.util.Map;
import java.util.HashMap;

public class Weather {
	public static class Forecast {
		double temperature;
		double humidity;
		
		Forecast (double temperature, double humidity) {
			this.temperature = temperature;
			this.humidity = humidity;
		}
		
		static enum Condition {
			Sunny,
			Cloudy,
			Rainy
		}
		
		public Condition predict() {
			if (temperature > 25 && humidity < 50) {
				return Condition.Sunny;
			} else if (humidity < 75) {
				return Condition.Cloudy;
			} else {
				return Condition.Rainy;
			}
		}
	}
	public static void main(String[] args) {
		Forecast Chennai = new Forecast(35, 35);
		Forecast Bengaluru = new Forecast(27.0, 70.0);
		
		System.out.println("Chennai is " + Chennai.predict());
		System.out.println("Bengaluru is " + Bengaluru.predict());
	}
}

/*
Chennai is Sunny
Bengaluru is Cloudy
*/
