public class Number8 {
    public static double horner(double[] coeffs, double x) {
        int n = coeffs.length - 1;
        double polynomial = coeffs[n];
        for (int k = n - 1; k >= 0; k--) {
            polynomial = polynomial * x + coeffs[k];
        }
        return polynomial;
    }


    public static void main(String[] args) {
        double[] coeffs = {1, 2, 3, 4};
        double x = 1;
        double result = horner(coeffs, x);
        System.out.printf("Значение полинома при x = %.3f равно %.4f %n", x, result);
    }
}
