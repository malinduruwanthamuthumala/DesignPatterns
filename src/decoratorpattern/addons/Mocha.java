package decoratorpattern.addons;

import decoratorpattern.AddOns;
import decoratorpattern.Beverage;

public class Mocha implements AddOns{

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		
		return 0.3 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "Mocha";
	}

}
