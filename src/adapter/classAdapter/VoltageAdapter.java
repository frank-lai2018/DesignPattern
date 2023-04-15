package adapter.classAdapter;

//適配器類
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//獲取道220V電壓
		int srcV = super.output220V();
		int dstV = srcV / 44 ; //轉乘5V
		return dstV;
	}

}
