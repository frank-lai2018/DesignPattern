package singleton;

/**
 * 懶漢式(有執行緒安全問題)
 * 優點:實現Lazy Loading
 * 缺點:有執行緒安全問題，如果有多個現成通過IF判斷，但物件還沒被NEW出來，就會NEW出多個物件
 * */
public class Singleton3 {
	private Singleton3() {}
	
	private static Singleton3 instance;
	
	public static Singleton3 getInstance() {
		if(instance == null) {//此處會發生執行緒安全問題
			instance = new Singleton3();
		}
		return instance;
	}
	
}
