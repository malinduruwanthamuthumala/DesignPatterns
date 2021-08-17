package decoratorpattern.addons;

import decoratorpattern.AddOns;
import decoratorpattern.Beverage;

public class Caramel implements AddOns {

	Beverage beverage;
	
	public Caramel(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		
		return 0.5 + beverage.cost();
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "Caramel";
	}

}
