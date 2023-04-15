package adapter.objectadapter;

//適配器類
public class VoltageAdapter implements IVoltage5V {
	
	private Voltage220V voltage220V;
	
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
		
	}

	@Override
	public int output5V() {
		int dstV =0;
		//獲取道220V電壓
		if(this.voltage220V != null) {
			
			int srcV = voltage220V.output220V();
			System.out.println("使用物件適配器進行轉換");
			dstV = srcV / 44 ; //轉乘5V
			System.out.println("適配完成 電壓為"+dstV);
			
		}
		return dstV;
	}

}
