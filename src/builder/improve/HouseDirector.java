package builder.improve;

//指揮者，這裡去指定製作流程，返回具體產品ָ
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	// 方法一:建構式傳入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//ͨ方法2 透過setter傳入houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//如何處理建造房子的流程，交給指揮者
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
	
	
}
