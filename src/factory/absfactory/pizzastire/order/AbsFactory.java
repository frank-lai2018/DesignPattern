package factory.absfactory.pizzastire.order;

import factory.absfactory.pizzastire.pizza.Pizza;

//一個抽象工廠模式的抽象層(接口)
public interface AbsFactory {
	//讓下面的工廠子類來 具體實現
	public Pizza createPizza(String orderType);
}