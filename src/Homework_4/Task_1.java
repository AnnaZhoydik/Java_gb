package Homework_4;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Task_1 {

    static int makeNum(Deque<String> arr) {
        int result = 0;
        String num;
        int a = 1;
        while (arr.size() != 0) {
            num = arr.pollFirst();
            if (!num.equals("-")) {
                result = result + a * (Integer.parseInt(num));
                a *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

    static Queue<String> Collect(int number) {
        Deque<String> arr = new LinkedList<>();
        int temp = 0;
        boolean minus = false;
        if (number < 0) {
            number *= -1;
            minus = true;
        }
        while (number > 0) {
            temp = number % 10;
            number = (number - temp) / 10;
            arr.addFirst(Integer.toString(temp));
        }
        if (minus) {
            arr.addFirst("-");
        }
        return arr;
    }

}
