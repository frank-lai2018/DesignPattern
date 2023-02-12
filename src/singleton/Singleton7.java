package singleton;

/**
 * 使用enum方式
 * 此方法是JAVA作者推薦方式
 * */
public class Singleton7 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance1 = Singleton.INSTANCE;
		
		System.out.println(instance == instance1);
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
		
		instance.sayOK();
	}
}

enum Singleton{
	INSTANCE;
	public void sayOK() {
		System.out.println("OK");
	}

	
}
