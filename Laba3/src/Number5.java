import java.util.Scanner;

public class Number5 {
    private enum Result {
        COINCIDE,
        TOUCH,
        INTERSECT,
        CIRCLE1_INSIDE_CIRCLE2,
        CIRCLE2_INSIDE_CIRCLE1,
        NOT_INTERSECT
    }

    private static class Circle {
        int x, y, radius;

        public Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }

    private static Result Computations(Circle circle1, Circle circle2) {
        double distance = Math.sqrt(Math.pow(circle1.x - circle2.x, 2) + Math.pow(circle2.y - circle1.y, 2));
        if (distance == 0 && circle1.radius == circle2.radius) {
            return Result.COINCIDE;
        } else if (distance == circle1.radius + circle2.radius) {
            return Result.TOUCH;
        } else if (distance < circle1.radius + circle2.radius && distance != 0) {
            return Result.INTERSECT;
        } else if (distance + circle1.radius <= circle2.radius) {
            return Result.CIRCLE1_INSIDE_CIRCLE2;
        } else if (distance + circle2.radius <= circle1.radius) {
            return Result.CIRCLE2_INSIDE_CIRCLE1;
        } else {
            return Result.NOT_INTERSECT;
        }
    }

    public static void main(String[] args) {
        int x, y, radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координаты первой окружности\n" + "x:");
        x = scan.nextInt();
        System.out.print("y:");
        y = scan.nextInt();
        System.out.print("Радиус:");
        radius = scan.nextInt();
        Circle circle1 = new Circle(x, y, radius);

        System.out.print("Введите координаты второй окружности\n" + "x:");
        x = scan.nextInt();
        System.out.print("y:");
        y = scan.nextInt();
        System.out.print("Радиус:");
        radius = scan.nextInt();
        Circle circle2 = new Circle(x, y, radius);

        Result result = Computations(circle1, circle2);
        switch (result) {
            case COINCIDE:
                System.out.println("Окружности совпадают");
                break;
            case TOUCH:
                System.out.println("Окружности пересекаются в одной точке");
                break;
            case INTERSECT:
                System.out.println("Окружности пересекаются в двух точках");
                break;
            case CIRCLE1_INSIDE_CIRCLE2:
                System.out.println("Окружность 1 вложена в окружность 2");
                break;
            case CIRCLE2_INSIDE_CIRCLE1:
                System.out.println("Окружность 2 вложена в окружность 1");
                break;
            case NOT_INTERSECT:
                System.out.println("Окружности не пересекаются");
                break;
        }
    }
}