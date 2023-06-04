import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Для виконання програми введіть три дробових числа");
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть перше дробове число:");
        if (input.hasNextDouble()) {
            a = input.nextDouble();
        } else {
            System.out.println("Ви ввели неправильне число");
            return;
        }
        System.out.println("Введіть друге число: ");
        if (input.hasNextDouble()) {
            b = input.nextDouble();
        } else {
            System.out.println("Ви ввели неправильне число");
            return;
        }

        System.out.println("Введіть третє число: ");
        if (input.hasNextDouble()) {
            c = input.nextDouble();
        } else {
            System.out.println("Ви ввели неправильне число");
            return;
        } double maxNum = a;

            if (b > maxNum) {
                maxNum = b;
            }

            if (c > maxNum) {
                maxNum = c;
            }

            System.out.println("Найбільше дробове число: " + maxNum);
        }
    }

