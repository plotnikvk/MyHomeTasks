package com.company;

import java.util.Scanner;

/**
 * Класс, который содержит метод main - точку входа в приложение
 */
public class Main {

    public static void main(String[] args) {

        double firstNumber;//Переменная, типа double, в которой сохраняется первое число
        String operation;// Переменная типа String, которая сохраняет знак операции
        double secondNumber;// Переменная, типа double, в которой сохраняется второе число

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число или число c плавающей точкой: ");
        firstNumber = Float.parseFloat(in.next());
        System.out.println("Введите второе целое число или число c плавающей точкой: ");
        secondNumber = Float.parseFloat(in.next());
        System.out.println("Введите знак операции(Возможны: +, -, *, /, %): ");
        operation = in.next();

        switch (operation){
             case "+":
                 System.out.printf("Результат операции сложения числа %.4f и числа %.4f:\t\t%.4f \n", firstNumber,
                         secondNumber, (firstNumber+secondNumber));
                 break;
             case "-":
                 System.out.printf("Результат операции вычитания числа %.4f из числа %.4f:\t\t%.4f \n", secondNumber,
                         firstNumber, (firstNumber-secondNumber));
                 break;
             case "*":
                 System.out.printf("Результат операции умножения числа %.4f и числа %.4f:\t\t%.4f \n", firstNumber,
                         secondNumber, (firstNumber*secondNumber));
                 break;
             case"/":
                 System.out.printf("Результат операции деления числа %.4f на числа %.4f:\t\t%.4f \n", firstNumber,
                         secondNumber, (firstNumber/secondNumber));
                 break;
             case "%":
                 System.out.printf("Результат операции деления по модулю числа %.4f на число %.4f:\t\t%.4f \n",
                         firstNumber, secondNumber, (firstNumber%secondNumber));
                 break;
             default:
         }
    }
}
