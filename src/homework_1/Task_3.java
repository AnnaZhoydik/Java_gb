package homework_1;

public class Task_3 {
    static int calculator(int a, int b, String c) {
        int result = 0;
        switch (c) {
            case "+":
                result = a + b;
                break;
            case "x":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "-":
                result = a - b;
                break;
            default:
                System.out.println("Ошибка! Неправильно введены действия!");
        }
        return result;
    }

}
