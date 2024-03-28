public class Number3 {
        public static void main(String[] args) {

            float r = 3;
            float R = 5;

            float x = 2;
            float y = 1;

            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            if (distance > R) {
                System.out.println("Предмет не обнаружен");
            } else if (distance <= R && distance > r) {
                System.out.println("Предмет обнаружен");
            } else if (distance <= r) {
                System.out.println("Тревога!");
            }
        }
}
