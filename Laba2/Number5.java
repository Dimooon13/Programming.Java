
public class Number5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        System.out.println("\nВведенное число: " + num);
        System.out.println("Число в двоичной системе: " + Integer.toBinaryString(num));
        System.out.println("Число в восьмеричной системе: " + Integer.toOctalString(num));
        System.out.println("Число в шестнадцатеричной системе: " + Integer.toHexString(num));
    }
}
