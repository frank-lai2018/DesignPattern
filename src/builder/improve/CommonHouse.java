package builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("Common 打地基5米");
	}

	@Override
	public void buildWalls() {
		System.out.println("Common 砌牆10米");
	}

	@Override
	public void roofed() {
		System.out.println("Common 屋頂");
	}

}
