package Homework_5;

import java.util.*;

public class Phone {
    public static void main(String[] args) {
        Map<String, ArrayList> bookPhone = new HashMap<>();
        Task_1.addNumber("Киркоров", "7689689", bookPhone);
        Task_1.addNumber("Басков", "9689", bookPhone);
        Task_1.addNumber("Киркоров", "1689", bookPhone);
        Task_1.addNumber("Лазарев", "76649689", bookPhone);
        Task_1.addNumber("Киркоров", "689", bookPhone);
        Task_1.addNumber("Лазарев", "7665", bookPhone);
//        Task_1.printBook(bookPhone);
        Task_1.sortedPrint(bookPhone);



    }
    }

