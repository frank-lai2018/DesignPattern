package factory.simplefactory.pizzastire.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.simplefactory.pizzastire.SimpleFactory;
import factory.simplefactory.pizzastire.pizza.Pizza;

public class OrderPizzaSimpleFactory {
	//定義一個簡單工廠對象
		SimpleFactory simpleFactory;
		Pizza pizza = null;
		
		//構造器
		public OrderPizzaSimpleFactory(SimpleFactory simpleFactory) {
			setFactory(simpleFactory);
		}
		
		public void setFactory(SimpleFactory simpleFactory) {
			String orderType = ""; //用戶輸入的
			
			this.simpleFactory = simpleFactory; //設置簡單工廠對象
			
			do {
				orderType = getType(); 
				pizza = this.simpleFactory.createPizza(orderType);
				
				//輸出pizza
				if(pizza != null) { //訂購成功
					pizza.prepare();
					pizza.bake();
					pizza.cut();
					pizza.box();
				} else {
					System.out.println(" 訂購披薩失敗 ");
					break;
				}
			}while(true);
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
