package bridge;


//摺疊樣式 Phone，繼承了抽象類Phone
public class FoldedPhone extends Phone {

	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		super.open();
		System.out.println("摺疊樣式手機 open");
	}
	
	public void close() {
		super.close();
		System.out.println(" 摺疊樣式手機 close");
	}
	
	public void call() {
		super.call();
		System.out.println("摺疊樣式手機 call ");
	}
}
