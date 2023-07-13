package FinalProject;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Filter {

    public static void filterRAM(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<Integer> ram = new TreeSet<>();
        for (Notebook note : notebooks) {
            ram.add(note.getRam());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены ноутбуки с оперативной памятью "
                + ram.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (ram.contains(filter)) {
            System.out.println();
            System.out.println("Отобрала подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getRam() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            filterRAM(notebooks, scanner);
        }

    }
    public static void FilterHardDisk(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<Integer> hardDisk = new TreeSet<>();
        for (Notebook note : notebooks) {
            hardDisk.add(note.getHardDisk());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены ноутбуки с объемом жесткого диска "
                + hardDisk.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (hardDisk.contains(filter)) {
            System.out.println();
            System.out.println("Отобрала подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getHardDisk() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            FilterHardDisk(notebooks, scanner);
        }
    }
    public static void filterOS(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> operSystems = new TreeSet<>();
        for (Notebook note : notebooks) {
            operSystems.add(note.getOperSystem());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены операционные системы: "
                + operSystems.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующую ОС: ");

        String oper = scanner.nextLine().toUpperCase();
        if (operSystems.contains(oper)) {
            System.out.println();
            System.out.println("Отобрала подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getOperSystem().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такой ОС. Попробуйте снова");
            filterOS(notebooks, scanner);

        }
    }
    public static void showCatalog(HashSet<Notebook> notebooks) {
        System.out.println();
        System.out.println("Полный каталог ноутбуков: ");
        System.out.println();
        for (Notebook note : notebooks) {
            note.showInfo();
        }
    }
    public static void filterColor(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (Notebook note : notebooks) {
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("Имеются ноутбуки следующих цветов: "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите цвет: ");

        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого цвета. Попробуйте снова");
            filterColor(notebooks, scanner);
        }
    }

}