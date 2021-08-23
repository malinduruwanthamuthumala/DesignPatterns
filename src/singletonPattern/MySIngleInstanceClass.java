package singletonPattern;

public class MySIngleInstanceClass {

	private MySIngleInstanceClass() {
		
	}
	public static MySIngleInstanceClass singleInstance;
	
	public static MySIngleInstanceClass getInstance() {
		if(singleInstance == null) {
			singleInstance = new MySIngleInstanceClass();
		}
		return singleInstance;
	}
}
