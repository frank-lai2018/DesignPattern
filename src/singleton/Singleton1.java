package singleton;

/*
 * 餓漢式
 * 如果確定此類一定會被用到一次，那此方式可以使用，不會造成內存浪費
 * */
public class Singleton1 {
	private static final Singleton1 INSTANCE= new Singleton1();
	
	//私有建構式
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return Singleton1.INSTANCE;
	}
	
}
