package factory.factorymethod.pizzastire.order;

import factory.factorymethod.pizzastire.pizza.BJCheesePizza;
import factory.factorymethod.pizzastire.pizza.BJPepperPizza;
import factory.factorymethod.pizzastire.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
