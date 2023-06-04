import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2;

        System.out.println("Введіть перше ім'я: ");
        name1 = input.nextLine();

        System.out.println("Введіть друге ім'я: ");
        name2 = input.nextLine();

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена неідентичні.");
        }
    }
}