package factory.simplefactory.example;

import java.math.BigDecimal;
import java.util.Scanner;

//使用簡單工廠設計一個加減乘除的計算機功能
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數字A:");
		String numA = scanner.next();
		System.out.println("請輸入運算符+-*/:");
		String operator = scanner.next();
		System.out.println("請輸入數字B:");
		String numB = scanner.next();
		scanner.close();
		OperationFactory factory = new OperationFactory();
		
		Operation operation = factory.createOperate(operator);
		
		String result = operation.calculationResult(new BigDecimal(numA), new BigDecimal(numB));
		
		System.out.println("計算結果="+result);
		
	}
}
