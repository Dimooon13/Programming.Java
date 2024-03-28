import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение r: ");
        float r = scanner.nextFloat();

        System.out.print("Введите значение R: ");
        float R = scanner.nextFloat();

        System.out.print("Введите значение x: ");
        float x = scanner.nextFloat();

        System.out.print("Введите значение y: ");
        float y = scanner.nextFloat();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (distance > R) {
            System.out.println("Предмет не обнаружен");
        } else if (distance <= R && distance > r) {
            System.out.println("Предмет обнаружен");
        } else if (distance <= r) {
            System.out.println("Тревога!");
        }

        scanner.close();
    }
}
