import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое десятичное число: ");
        int dec = scanner.nextInt();

        boolean is_neg = false;
        if (dec < 0) {
            is_neg = true;
            dec = Math.abs(dec);
        }

        int base;
        do {
            System.out.print("Введите основание системы счисления (от 2 до 8 включительно): ");
            base = scanner.nextInt();
        } while (base < 2 || base > 8);

        String result = convertDecimal(dec, base);
        if (is_neg) {
            result = "-" + result;
        }
        System.out.printf("Число %d в системе счисления с основанием %d: %s%n", dec, base, result);
    }

    public static String convertDecimal(int dec, int base) {
        StringBuilder result = new StringBuilder();

        while (dec > 0) {
            result.insert(0, dec % base);
            dec /= base;
        }

        return result.toString();
    }
}
