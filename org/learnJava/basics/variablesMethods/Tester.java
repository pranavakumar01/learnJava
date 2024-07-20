package org.learnJava.basics.variablesMethods;

public class Tester {
    public static void main(String [] args){
        Calculator calc = new Calculator(1, 2);
        //calc is an object of class Calculator
        Calculator calc2 = new Calculator(20, 30);

        System.out.println("add result id : "+ calc.add());
        System.out.println(String.format("using string.format : add result id : %05d", calc.add()));

        System.out.println("add result id : "+ calc2.add());
        Calculator calc3 = new Calculator(200, 300);
        calc3.add();
        System.out.println("totalAdditions: "+Calculator.totalNumberOfAdditions);
        System.out.println("totalAdditions: "+calc.totalNumberOfAdditions);
        System.out.println("totalAdditions: "+calc2.totalNumberOfAdditions);
        System.out.println("totalAdditions: "+calc3.totalNumberOfAdditions);

        calc.PrintResult();
        calc2.PrintResult();
        calc3.PrintResult();

        Calculator.PrintTotalAdditions();
        calc3.PrintTotalAdditions();
    }
}
