package singleton;

/**
 * double check
 * 推薦使用方式
 * */
public class Singleton5 {
	private Singleton5() {}
	
	private static Singleton5 instance;
	
	public static Singleton5 getInstance() {
		if(instance == null) {//之後進來的執行緒，就不須再執行IF區塊代碼，處理synchronized效率問題
			synchronized (Singleton5.class) {
				if(instance == null) {//在判別一次，解決懶漢式執行緒安全問題
					instance = new Singleton5();
				}
			}
		}
		
		return Singleton5.instance;
	}
	
}
