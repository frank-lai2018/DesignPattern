package adapter.classAdapter;

public class Client {

	public static void main(String[] args) {
		System.out.println("====適配器模式====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
