package factory.simplefactory.example;

public class OperationFactory {

	public static final String ADD_OPERATOR = "+";
	public static final String SUB_OPERATOR = "-";
	public static final String MULTI_OPERATOR = "*";
	public static final String DIV_OPERATOR = "/";
	
	
	public Operation createOperate(String operator) {
		switch (operator) {
		case ADD_OPERATOR:
			return new AddOperation();
		case SUB_OPERATOR:
			return new SubOperation();
		case MULTI_OPERATOR:
			return new MultOperation();
		case DIV_OPERATOR:
			return new DivOperation();
		}
		return null;
	}
}
