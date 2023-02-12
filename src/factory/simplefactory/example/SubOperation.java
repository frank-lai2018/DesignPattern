package factory.simplefactory.example;

import java.math.BigDecimal;

public class SubOperation extends Operation{

	@Override
	String calculationResult(BigDecimal numA, BigDecimal numB) {
		return numA.subtract(numB).toPlainString();
	}

}
