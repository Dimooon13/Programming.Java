import java.util.Scanner;

public class Number4 {
private static class Circle{
    int x,y,radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y=y;
        this.radius=radius;
    }
}
private static int Computations(Circle circle1, Circle circle2){
    double distance = Math.sqrt(Math.pow(circle1.x-circle2.x,2)+Math.pow(circle2.y-circle1.y,2));
    if (distance == 0 && circle1.radius == circle2.radius){
       return 1;
    }
    else if(distance == circle1.radius+circle2.radius){
        return 2;
    } else if (distance< circle1.radius+circle2.radius && distance!=0) {
        return 3;
    }else if (distance + circle1.radius <= circle2.radius && circle1.radius < circle2.radius) {
        return 4; // Окружность 1 вложена в окружность 2
    } else if (distance + circle2.radius <= circle1.radius && circle2.radius < circle1.radius) {
        return 5; // Окружность 2 вложена в окружность 1
    }
    else return 6;
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
        Circle circle1 = new Circle(x,y,radius);

        System.out.print("Введите координаты второй окружности\n" + "x:");
        x = scan.nextInt();
        System.out.print("y:");
        y = scan.nextInt();
        System.out.print("Радиус:");
        radius = scan.nextInt();
        Circle circle2 = new Circle(x,y,radius);

        int result = Computations(circle1, circle2);
        switch (result){
            case 1:
                System.out.println("Окружности совпадают");
                break;
            case 2:
                System.out.println("Окружности пересекаются в одной точке");
                break;
            case 3:
                System.out.println("Окружности пересекаются в двух точках");
                break;
            case 4:
                System.out.println("Окружность 1 вложена в окружность 2 ");
                break;
            case 5:
                System.out.println("Окружность 2 вложена в окружность 1");
                break;
            case 6:
                System.out.println("Окружности не пересекаются ");
                break;
        }
    }

}