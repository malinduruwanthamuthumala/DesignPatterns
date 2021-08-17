package decoratorpattern;

import decoratorpattern.addons.Caramel;
import decoratorpattern.addons.Mocha;
import decoratorpattern.beverage.Expresso;

public class OrderPlacement {

	
	public static void main(String args[]) {
		Beverage b1 = new Expresso();
		b1 = new Caramel(b1);
		b1 = new Caramel(b1);
		b1 = new Mocha(b1);
		
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
	}
}
