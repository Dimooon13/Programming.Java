public class Number2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -3, 6, -3};

        int multiply = 1;
        int count = 0;

        for (int element : array) {
            if (element < 0) {
                multiply *= element;
                count++;
            }
        }

        if (count > 0 && multiply != 0) {
            double geometricMean = Math.pow(Math.abs(multiply), 1.0 / count);

            System.out.println("Среднее геометрическое элементов: " + geometricMean);
        }
    }
}