package FinalProject;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Notebook nb1 = new Notebook("Asus", "15", 4, 1000, "Windows 10", "черный");
        Notebook nb2 = new Notebook("Acer", "new8", 4, 256, "Windows 10", "белый");
        Notebook nb3 = new Notebook("Lenovo", "Ideal", 8, 1000, "Windows 11", "матовый");
        Notebook nb4 = new Notebook("Samsung", "67", 8, 256, "Windows 11", "черный");
        Notebook nb5 = new Notebook("Asus", "last one", 16, 512, "Windows 10", "золотой");
        Notebook nb6 = new Notebook("Huawei", "MateBook", 16, 512, "Windows 10", "серый");
        HashSet<Notebook> notebooks = new HashSet<Notebook>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6));
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в интернет-магазин ноутбуков!");
        boolean filter = true;
        while (filter) {
            System.out.println("1- Выбрать по ОЗУ");
            System.out.println("2- Выбрать по объему жесткого диска");
            System.out.println("3- Выбрать по оперативной системе");
            System.out.println("4- Выбрать по цвету");
            System.out.println("5- Посмотреть все модели");
            System.out.println("6- Выход");
            System.out.println("Введите цифру с действием: ");
            String operation = sc.nextLine();
            switch (operation) {

                case "1":
                    Filter.filterRAM(notebooks, sc);
                    break;
                case "2":
                    Filter.FilterHardDisk(notebooks, sc);
                    break;
                case "3":
                    Filter.filterOS(notebooks, sc);
                    break;
                case "4":
                    Filter.filterColor(notebooks, sc);
                    break;
                case "5":
                    Filter.showCatalog(notebooks);
                    break;
                case "6":
                    System.out.println("Спасибо! Ждём вас снова!");
                    filter = false;
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        }

    }
}