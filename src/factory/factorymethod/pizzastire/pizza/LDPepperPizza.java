package factory.factorymethod.pizzastire.pizza;

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("LDPepperPizza");
		System.out.println("準備 LDPepperPizza");
	}
}
