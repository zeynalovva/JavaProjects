package lesson10;

public class Toyota extends Machine implements Swimmable {

    @Override
    public void start() {
        System.out.println("Toyota started!");
    }

    @Override
    public void swim() {
        System.out.println("Toyota is swimming!");
    }
}
