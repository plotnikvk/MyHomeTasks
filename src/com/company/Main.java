package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double firstNumber;
        String operation;
        double secondNumber;
        double result = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число c плавающей точкой: ");
        firstNumber = in.nextFloat();
        System.out.println("Введите второе число c плавающей точкой: ");
        secondNumber = in.nextFloat();
        System.out.println("Введите знак операции(Возможны: +, -, *, /, %): ");
        operation = in.next();



        switch (operation){
             case "+":
                 result = firstNumber + secondNumber;
                 break;
             case "-":
                 result = firstNumber - secondNumber;
                 break;
             case "*":
                 result = firstNumber * secondNumber;
                 break;
             case"/":
                 result = (firstNumber/secondNumber);
             case "%":
                 result = firstNumber % secondNumber;
             default:
         }
System.out.println(firstNumber/secondNumber);
         System.out.printf( "Результат операции %s над числами %.4f и %.4f равен: %.4f" ,operation, firstNumber, secondNumber, result);

    }
}
