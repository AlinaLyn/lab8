import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше слово:");
        String word1 = scanner.next();

        System.out.println("Введіть друге слово:");
        String word2 = scanner.next();

        System.out.println("Введіть третє слово:");
        String word3 = scanner.next();

        System.out.println("Введіть четверте слово:");
        String word4 = scanner.next();

        System.out.println("Введіть п'яте слово:");
        String word5 = scanner.next();
        char firstLetter1 = word1.substring(0, 1).charAt(0);
        char firstLetter2 = word2.substring(0, 1).charAt(0);
        char firstLetter3 = word3.substring(0, 1).charAt(0);
        char firstLetter4 = word4.substring(0, 1).charAt(0);
        char firstLetter5 = word5.substring(0, 1).charAt(0);

        System.out.println("Перші літери введених слів: " + firstLetter1 + ", " + firstLetter2 + ", " + firstLetter3 + ", " + firstLetter4 + ", " + firstLetter5);
    }
}
