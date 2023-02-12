package factory.factorymethod.pizzastire.pizza;

//將Pizza類做成抽象
public abstract class Pizza {
	protected String name;

	//準備原材料，不同的pizza是不一樣的材料，因此做成抽象方法
	public abstract void prepare();

	//烘烤
	public void bake() {
		System.out.println(name + " baking;");
	}

	//切割
	public void cut() {
		System.out.println(name + " cutting;");
	}
	
	//打包
	public void box() {
		System.out.println(name + " boxing;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
