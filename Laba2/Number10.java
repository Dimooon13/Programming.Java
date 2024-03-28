import java.util.Scanner;

public class Number10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.println("Циклические перестановки:");
        printCyclicPermutations(input);
    }
    public static void printCyclicPermutations(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String permutation = str.substring(i) + str.substring(0, i);
            System.out.println(permutation);
        }
    }
}