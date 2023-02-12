package factory.simplefactory.pizzastire.order;

import factory.simplefactory.pizzastire.SimpleFactory;

public class PizzaStore {
	public static void main(String[] args) {
//		new OrderPizza();
		
		//使用簡單工廠模式
		new OrderPizzaSimpleFactory(new SimpleFactory());
		System.out.println("~~退出程序~~");
		
//		new OrderPizza();
	} 
}
