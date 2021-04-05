package singleton;

/*
 * 餓漢式(static block)
 * 如果確定此類一定會被用到一次，那此方式可以使用，不會造成內存浪費
 * */
public class Singleton2 {

	//私有建構式
	private Singleton2() {}

	private static Singleton2 instance;
	
	static {
		instance = new Singleton2();
	}
	
	public static Singleton2 getInstance() {
		return Singleton2.instance;
	}
}
