package singleton;

/**
 * 懶漢式(執行緒安全問題)
 * 優點:實現Lazy Loading
 * 缺點:因為加了synchronized，但實例化物件只需做一次，但家在方法上每次都會等有效率問題
 * */
public class Singleton4 {
	private Singleton4() {}
	
	private static Singleton4 instance;
	
	public synchronized static Singleton4 getInstance() {
		if(instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
}
