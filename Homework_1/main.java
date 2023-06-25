package Homework_1;


import Homework_1.Task_1;
import Homework_1.Task_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("Число должно быть больше 0.");
        } else {
            System.out.println("1) Сумма чисел равна " + Task_1.getSumNumber(a));
            System.out.println("   Факториал равен " + Task_1.getFactorial(a));
        }
        System.out.println("2) Числа от 1 до 1000:");
        Task_2.printNumbers();
        System.out.println("Калькулятор");
        System.out.print("Введите первое число: ");
        int d = sc.nextInt();
        System.out.print("Введите действие(+,-,/,*): ");
        String t = sc.next();
        System.out.print("Введите второе число: ");
        int e = sc.nextInt();
        System.out.println("Ответ: " + Task_3.calculator(d, e, t));

    }

}
