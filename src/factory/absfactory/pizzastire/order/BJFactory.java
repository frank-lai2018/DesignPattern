package factory.absfactory.pizzastire.order;

import factory.absfactory.pizzastire.pizza.BJCheesePizza;
import factory.absfactory.pizzastire.pizza.BJPepperPizza;
import factory.absfactory.pizzastire.pizza.Pizza;

//這是工廠子類
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工廠模式~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}