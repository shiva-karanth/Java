package day3.asso;

public class Driver2 {
    public static void main(String[] args) {
        Car c = new Car("Black");
        c.displayCar();
        System.out.println("-----------------------");
        c.getEngine().displayEngine();
    }
}
