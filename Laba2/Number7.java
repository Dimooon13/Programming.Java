public class Number7 {
    public static void main(String[] args) {

        String str = "Hrerer9494АВФАФВыВ!.123";

        int len = str.length();

        int upCases = 0;
        int lowCases = 0;
        int arabicNums = 0;
        int nonArabicNums = 0;
        int otherCases = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    upCases++;
                } else {
                    lowCases++;
                }
            } else if (Character.isDigit(ch)) {
                if (ch >= '0' && ch <= '9') {
                    arabicNums++;
                } else {
                    nonArabicNums++;
                }
            } else {
                otherCases++;
            }
        }

        System.out.println("Общее количество символов: " + len);
        System.out.println("Количество букв: " + (upCases + lowCases));
        System.out.println("Количество прописных букв: " + lowCases);
        System.out.println("Количество заглавных букв: " + upCases);
        System.out.println("Количество цифр: " + (arabicNums + nonArabicNums));
        System.out.println("Количество арабских цифр: " + arabicNums);
        System.out.println("Количество не арабских цифр: " + nonArabicNums);
        System.out.println("Количество других символов: " + otherCases);
    }
}