package factory.factorymethod.pizzastire.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("LDCheesePizza");
		System.out.println("準備 LDCheesePizza");
	}
}
