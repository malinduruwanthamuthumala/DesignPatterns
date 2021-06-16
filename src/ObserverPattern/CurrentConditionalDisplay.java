package ObserverPattern;

public class CurrentConditionalDisplay implements DataObserver,DisplayElement {

	private Subject weatherData;
	private float temperature;
	private float humidity;
	private float pressure;
		
	public CurrentConditionalDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity=humidity;
		this.pressure = pressure;
		display();

	}

	@Override
	public void display() {
		System.out.println("current conditions" + "humidity" + humidity);
		System.out.println("current conditions" + "pressure" + pressure);
		System.out.println("current conditions" + "tempereature" + temperature);
		
		
	}

}
