package lesson10;

public class Honda extends Machine implements Swimmable, Flyable {

    @Override
    public void start() {
        System.out.println("Honda started!");
    }

    @Override
    public void swim() {
        System.out.println("Honda is swimming!");
    }

    @Override
    public void fly() {
        System.out.println("Honda is flying!");
    }
}
