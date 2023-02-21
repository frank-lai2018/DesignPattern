package builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("High 打地基100米");
	}

	@Override
	public void buildWalls() {
		System.out.println("High 砌牆20米");
	}

	@Override
	public void roofed() {
		System.out.println("High 屋頂");
	}

}
