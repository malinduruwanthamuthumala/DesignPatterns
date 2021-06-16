package ObserverPattern;

public class WeatherStation {

	public static void main(String args[]) {
		WhetherData whetherdata = new WhetherData(null);
		
		CurrentConditionalDisplay current = new CurrentConditionalDisplay(whetherdata);
		
		whetherdata.setMeasurements(50,45,45);
		
	}
}
