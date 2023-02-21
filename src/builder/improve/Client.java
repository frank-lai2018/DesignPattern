package builder.improve;

public class Client {
	public static void main(String[] args) {
		
		//蓋普通房
		CommonHouse commonHouse = new CommonHouse();
		//準備創建房子的指揮者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//完成蓋房子，返回產品
		House house = houseDirector.constructHouse();
		
		
		System.out.println("--------------------------");
		//蓋高樓成房子
		HighBuilding highBuilding = new HighBuilding();
		//重製建造者
		houseDirector.setHouseBuilder(highBuilding);
		//完成蓋房子，返回產品(高樓)
		houseDirector.constructHouse();
		
		
		
	}
}
