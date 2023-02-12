package factory.simplefactory.example;

import java.math.BigDecimal;

public class DivOperation extends Operation{

	@Override
	String calculationResult(BigDecimal numA, BigDecimal numB) {
		return numA.divide(numB).toPlainString();
	}

}
