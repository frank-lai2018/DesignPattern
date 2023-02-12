package factory.factorymethod.pizzastire.order;

import factory.factorymethod.pizzastire.pizza.LDCheesePizza;
import factory.factorymethod.pizzastire.pizza.LDPepperPizza;
import factory.factorymethod.pizzastire.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		if(pizzaType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (pizzaType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

	

}
