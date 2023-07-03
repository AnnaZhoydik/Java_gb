package homework_3;

import java.util.*;

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение
public class Main_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(89);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(12);
        System.out.println("Список: " + numbers);
        System.out.println("Список без четных чисел:" + task_1.deleteEven(numbers));
        System.out.println("Среднее арифметическое: " + task_4.averageNum(numbers));
        System.out.println("Минимальное число: " + task_3.MinNum(numbers));
        System.out.println("Максимальное число: " + task_2.maxNumber(numbers));

    }
}
