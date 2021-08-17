package decoratorpattern.beverage;

import decoratorpattern.Beverage;

public class Expresso implements Beverage {

	public String description ="Expresso";
	
	@Override
	public double cost() {
		return 4;
		
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}

}
