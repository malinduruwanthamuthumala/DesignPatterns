package ObserverPattern;

import java.util.ArrayList;

public class WhetherData implements Subject {
	
	private ArrayList<DataObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WhetherData(ArrayList<DataObserver> observers) {
		super();
		if(observers != null) {
			this.observers = observers;
		}
		else {
			this.observers = new ArrayList<>();
		}
	}
	
	@Override
	public void registerObserver(DataObserver dataObserver) {
		observers.add(dataObserver);
		
	}
	@Override
	public void removeObserver(DataObserver dataObserver) {
		observers.remove(dataObserver);
	}
	
	@Override
	public void notifyObserver() {
		for(DataObserver observer : observers) {
			observer.update(this.temperature,this.humidity,this.pressure);
		}
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	private void measurementsChanged() {
		for(DataObserver observer:observers) {
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	

}
