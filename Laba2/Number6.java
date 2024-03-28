public class Number6 {
    public static void main(String[] args) {
        printUnicodeTable(0x0400, 16, 16);
        System.out.println();
        printUnicodeTable(0x20a0, 2, 16);
    }

    private static void printUnicodeTable(int startCode, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int codePoint = startCode + i * columns + j;
                System.out.print((char) codePoint + " ");
            }
            System.out.println();
        }
    }
}
