import java.text.DecimalFormat;

public class Number1 {
    public static void main(String[] args) {
        double start = Math.PI / 15;
        double end = Math.PI;
        double step = Math.PI / 15;

        DecimalFormat argFormat = new DecimalFormat("0.00000");
        DecimalFormat funcFormat = new DecimalFormat("0.#######E0");

        System.out.println("Аргумент   sin(x)             (e^x) / (x * lg(x))");

        for (double x = start; x <= end; x += step) {
            double sinValue = Math.sin(x);
            double funcValue = Math.exp(x) / (x * Math.log(x));

            String formattedX = argFormat.format(x);
            String formattedSin = funcFormat.format(sinValue);
            String formattedFunc = funcFormat.format(funcValue);

            System.out.printf("%-10s   %-15s   %-15s%n", formattedX, formattedSin, formattedFunc);
        }
    }
}