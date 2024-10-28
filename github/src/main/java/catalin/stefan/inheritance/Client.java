package catalin.stefan.inheritance;

public class Client {

    public static void main(String[] args) {
        Car car1 = new Car(4, 10_000);
        System.out.println("My car has " + car1.wheels + " wheels.");

        Car car2 = new Car();
        System.out.println("My car has " + car2.wheels + " wheels.");


        car1.drive();


    }

}
