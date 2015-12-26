import com.SwingMVCCalculator.Model.*;

public class TestCalculator {
	public static void main(String... args){
		CalculatorModel calculator = new CalculatorModel();
		//Test printing void calculator
		System.out.println(calculator);
		//Test calculating void calculator
		System.out.println(calculator.result());
		//Populating calculator
		calculator.positiveNegative();
		calculator.five();
		calculator.eight();
		calculator.comma();
		calculator.zero();
		calculator.zero();
		calculator.one();
		calculator.plus();
		calculator.positiveNegative();
		calculator.five();
		calculator.eight();
		calculator.comma();
		calculator.zero();
		calculator.one();
		calculator.divide();
		//Test printing normal calculator
		System.out.println(calculator);
		//Test calculating normal calculator
		System.out.println(calculator.result());
		//Test CE button
		calculator.ce();
		System.out.println(calculator);
		System.out.println(calculator.result());
		//Test C button
		calculator.c();
		System.out.println(calculator);
		System.out.println(calculator.result());
	}

}
