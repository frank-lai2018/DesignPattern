package factory.simplefactory.example;

import java.math.BigDecimal;

public class MultOperation extends Operation{

	@Override
	String calculationResult(BigDecimal numA, BigDecimal numB) {
		return numA.multiply(numB).toPlainString();
	}

}
