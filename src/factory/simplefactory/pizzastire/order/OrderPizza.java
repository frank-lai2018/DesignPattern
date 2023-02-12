package factory.simplefactory.pizzastire.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.simplefactory.pizzastire.pizza.CheesePizza;
import factory.simplefactory.pizzastire.pizza.GreekPizza;
import factory.simplefactory.pizzastire.pizza.PepperPizza;
import factory.simplefactory.pizzastire.pizza.Pizza;

public class OrderPizza {
	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // 订购披萨的类型
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希臘披薩 ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披薩 ");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒披薩");
			} else {
				break;
			}
			//輸出pizza 製作過程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
	}
	
	
	// 寫一個方法，可以獲取客戶希望訂購的披薩種類
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 種類:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
