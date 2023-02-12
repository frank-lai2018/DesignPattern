package factory.absfactory.pizzastire.order;

import factory.absfactory.pizzastire.pizza.LDCheesePizza;
import factory.absfactory.pizzastire.pizza.LDPepperPizza;
import factory.absfactory.pizzastire.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工廠模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}