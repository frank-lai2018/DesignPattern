package adapter.objectadapter;

public class Phone {

	//充電
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("電壓為5V可以充電");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("電壓過高無法充電");
		}
	}
}
