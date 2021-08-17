package decoratorpattern.beverage;

import decoratorpattern.Beverage;

public class BlackCofee implements Beverage{

	public String description ="BlackCofee";
	public BlackCofee() {
		
	}
	@Override
	public double cost() {
		
		return 5;
	}
	@Override
	public String getDescription() {
		
		return this.description;
	}
	
	

}
