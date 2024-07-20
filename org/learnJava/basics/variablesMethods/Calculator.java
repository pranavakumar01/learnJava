package org.learnJava.basics.variablesMethods;

public class Calculator {
    static int totalNumberOfAdditions;
    int a;
    int b;
    int lastResult;

    public Calculator(int a, int b) {// A method that has same name as the class and has zero or more arguments passed to it is called a constructor
        this.a = a;
        this.b = b;
    }

    public Calculator(){
    }

    public int add() {
        lastResult = a + b;
        totalNumberOfAdditions++;
        return lastResult;
    }

    public void PrintResult() {
        System.out.println("Result is: "+lastResult);
    }

    public static void PrintTotalAdditions(){
        System.out.println("Total Additions are "+totalNumberOfAdditions);
    }

}
