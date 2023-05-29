package adapteroef2;

import calcLibrary.CalculatorLibrary;
import calcLibrary.TargetDouble;
import domein.Calculator;
import domein.TargetLong;

public class AdapterOef2 {

	public static void main(String[] args) {
		TargetDouble oldInterface = new CalculatorLibrary(2, 3);
		TargetLong calculator = new Calculator(oldInterface);
		long res = calculator.add();
		System.out.println(res);
	}

}
