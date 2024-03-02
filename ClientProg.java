
package pack_SmartCalculator;

public class ClientProg {

	public static void main(String[] args) {
		
		 SmartCalculator calculator = new SmartCalculator(1000, 5, 2, new int[]{10, 20, 30, 40, 50}, 100, 85);

	        System.out.println("Simple Interest: " + calculator.calculateSimpleInterest());
	        System.out.println("Compound Interest: " + calculator.calculateCompoundInterest());
	        System.out.println("Mean: " + calculator.calculateMean());
	        System.out.println("Factorial: " + calculator.calculateFactorial(5));
	        System.out.println("Percentage: " + calculator.calculatePercentage());

	}

}
