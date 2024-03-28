public class Number2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, -3, -1},
                {4, -5, 6, -7},
                {8, -9, 10}
        };

        int maxNegative = findMaxNegative(array);

        if (maxNegative != Integer.MIN_VALUE) {
            System.out.println("Наибольший отрицательный элемент: " + maxNegative);
        } else {
            System.out.println("Отрицательные элементы отсутствуют в массиве");
        }
    }

    public static int findMaxNegative(int[][] array) {
        int maxNegative = Integer.MIN_VALUE;

        // Проходим по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0 && array[i][j] > maxNegative) {
                    maxNegative = array[i][j];
                }
            }
        }
        return maxNegative;
    }
}
