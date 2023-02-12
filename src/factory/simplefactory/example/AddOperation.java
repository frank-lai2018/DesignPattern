package factory.simplefactory.example;

import java.math.BigDecimal;

public class AddOperation extends Operation {

	@Override
	String calculationResult(BigDecimal numA, BigDecimal numB) {
		return numA.add(numB).toPlainString();
	}

}
