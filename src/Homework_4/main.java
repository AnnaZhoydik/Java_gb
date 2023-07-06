package Homework_4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import static Homework_4.Task_1.Collect;
import static Homework_4.Task_1.makeNum;

public class main {
    public static void main(String[] args) {

        Deque<String> list_1 = new LinkedList<>(Arrays.asList("-8", "9", "-1"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("9", "1", "8"));
        Deque<String> list_3 = new LinkedList<>(Arrays.asList("4", "7", "-6"));
        Deque<String> list_4 = new LinkedList<>(Arrays.asList("7", "2", "-3"));
        System.out.println("Первая пара: " + list_1 + ", " + list_2);
        System.out.println("Вторая пара: " + list_3 + ", " + list_4);
        int first_num = Task_1.makeNum(list_1);
        int second_num = Task_1.makeNum(list_2);
        int composition = first_num * second_num;
        System.out.println("Произведение первого списка: " + first_num + " х " + second_num + " = " + composition);
        first_num = Task_1.makeNum(list_3);
        second_num = Task_1.makeNum(list_4);
        int composition_2 = first_num * second_num;
        System.out.println("Произведение второго списка: " + first_num + " х " + second_num + " = " + composition_2);
        int composition_3 = composition_2 + composition;
        System.out.println("Связные списки:");
        System.out.println("Произведение первого списка: " +Task_1.Collect(composition));
        System.out.println("Произведение второго списка: " + Task_1.Collect(composition_2));
        System.out.println("Сумма: " + Task_1.Collect(composition_3));
    }
}
