package Task1;
import Task4.Engine;
import java.awt.Color;

public class CarMain {
    public static void main(String[] args) {
        Engine engine1 = new Engine("123456", 150.0, 2.0, "Бензин", 4);
        Car car1 = new Car(Car.Model.легковой, "Toyota", 4, engine1, Color.BLACK);
        car1.setRegisterSign("А123ВВ45RUS");

        Engine engine2 = new Engine("789012", 200.0, 2.5, "Бензин", 6);
        Car car2 = new Car(Car.Model.грузовой, "Ford", 6, engine2, Color.RED);
        car2.setRegisterSign("В456АА78RUS");

        // Вызываем метод showInfo() для каждой машины
        car1.showInfo();
        car2.showInfo();
    }
}