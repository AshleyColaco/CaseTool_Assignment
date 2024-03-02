/*
  Create an Smart Calculator class. Define non-parameterized & parameterized constructors and
 initialize all the fields. Add methods to calculate simple interest, compound interest, mean of given
 numbers, factorial of a given number, and percentage of given total marks & marks obtained. Add
 all required attributes/fields, constructors, and getters and setters. The input to atleast 50% of the
 methods should be taken a parameter of the methods and for remaining methods you may use
 setters. All methods should return appropriate calculated values.
 */
package pack_SmartCalculator;

import java.lang.Math;

public class SmartCalculator 
{
	private double principal;
    private double rate;
    private double time;
    private int[] numbers;
    private double totalMarks;
    private double marksObtained;

    // Non-parameterized constructor
    public SmartCalculator() 
    {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
        this.numbers = new int[0];
        this.totalMarks = 0;
        this.marksObtained = 0;
    }

    // Parameterized constructor
    public SmartCalculator(double principal, double rate, double time, 
                           int[] numbers, double totalMarks, double marksObtained) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.numbers = numbers;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
    }

    // Getters and Setters

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    // Calculation methods
 

    
    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }
    
    public double calculateCompoundInterest() {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }

    public double calculateMean() {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
    
    public double calculatePercentage() {
        return (marksObtained / totalMarks) * 100;
    }
}
