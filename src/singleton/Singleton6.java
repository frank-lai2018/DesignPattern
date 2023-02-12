package singleton;

/**
 * 靜態內部類方式
 * 1.類的靜態屬性只會在第一次加載的時候初始化，在這裡JVM保證了執行緒安全，在類進行初始化時，別的執行緒是無法進入的
 * 2.利用了靜態內部類的特性，實現了Lazy Loading
 * */
public class Singleton6 {

	private Singleton6() {}
	
	private static class SingletonInstance{ //靜態內部類在外部類加載時，不會被加載，所以實現了Lazy Loading
		private static final Singleton6 INSTANCE = new Singleton6();
	}
	
	public static Singleton6 getInstance() {//當此方法被調用時，才加載靜態內部類
		return SingletonInstance.INSTANCE;
	}
	
}
