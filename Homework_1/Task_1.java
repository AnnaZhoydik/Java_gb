package Homework_1;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task_1 {

    static int getSumNumber(int n) {
        int sum = 0;
        int count = 0;
        while (count < n) {
            sum += count + 1;
            count++;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int factorial = 1;
        int count = 0;
        while (count < n) {
            factorial *= count + 1;
            count++;
        }
        return factorial;
    }

}
