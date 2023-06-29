package Homework_2;

import Homework_1.Task_3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        Logger log = Logger.getLogger(Homework_1.Task_3.class.getName());
        FileHandler file_2 = new FileHandler("calculator.txt");
        log.addHandler(file_2);
        log.info("Калькулятор");
        log.info("Ответ: " + Task_3.calculator(3, 5, "+"));
        FileHandler file = new FileHandler("log.txt");
        logger.addHandler(file);
        SimpleFormatter sFormat = new SimpleFormatter();
        file.setFormatter(sFormat);
        logger.info("Сортировка массива");
        int[] array = {5, 9, 4, 6, 8, 3};
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    logger.info(Integer.toString(temp));
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

