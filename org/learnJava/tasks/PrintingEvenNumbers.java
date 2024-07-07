package org.learnJava.tasks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrintingEvenNumbers {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 100;
        for (int i = n1; i < n2; i++) {
            if (((i & 1) == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}