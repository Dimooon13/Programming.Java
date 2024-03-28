public class Number9 {
        public static void main(String[] args) {
            String str = "aaaaddaa";
            String word = "aa";
            int count = 0;
            int index = 0;

            while (true) {
                index = str.indexOf(word, index);
                if (index != -1) {
                    index = index + word.length();
                    count++;
                } else {
                    break;
                }
            }
            System.out.println("Количество вхождений слова \"" + word + "\" в строку \"" + str + "\": " + count);
        }

}
