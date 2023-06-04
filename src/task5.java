import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1, str2;

        System.out.println("Введіть перший рядок: ");
        str1 = input.nextLine();

        System.out.println("Введіть другий рядок: ");
        str2 = input.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println("Перший рядок містить більше символів.");
        } else if (str1.length() < str2.length()) {
            System.out.println("Другий рядок містить більше символів.");
        } else {
            System.out.println("Рядки містять однакову кількість символів.");
        }
    }
}

