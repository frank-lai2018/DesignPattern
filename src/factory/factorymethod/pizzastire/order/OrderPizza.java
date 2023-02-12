package factory.factorymethod.pizzastire.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.factorymethod.pizzastire.pizza.Pizza;


public abstract class OrderPizza {
	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // 订购披萨的类型
		do {
			orderType = getType();
			
			//使用子類實現的方法創建pizza
			pizza= this.createPizza(orderType);
			
			//輸出pizza 製作過程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
	}
	
	//準備一個抽象創建pizza的方法，交給子類去實現
	abstract Pizza createPizza(String pizzaType);
	
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
