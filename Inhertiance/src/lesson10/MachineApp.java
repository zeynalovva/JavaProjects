package lesson10;

public class MachineApp {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.start();
        honda.swim();

        Bmw bmw = new Bmw();
        bmw.start();
        bmw.foo();
//        bmw.swim()

        Toyota toyota = new Toyota();
        toyota.start();
        toyota.swim();

        startMachine(honda);
        startMachine(bmw);
        startMachine(toyota);

        startMachine((Machine) honda);
        startMachine((Machine) bmw);
        startMachine((Machine) toyota);

        Machine bmw2 = new Bmw();
        bmw2.start();
//        bmw2.foo()

        swimMachine(honda);
        swimMachine(toyota);
//        swimMachine(bmw);
    }

    public static void swimMachine(Swimmable swimmable) {
        swimmable.swim();
    }

    public static void startMachine(Machine machine) {
        machine.start();
    }

    public static void startMachine(Honda machine) {
        machine.start();
    }

    public static void startMachine(Bmw machine) {
        machine.start();
    }

    public static void startMachine(Toyota machine) {
        machine.start();
    }
}
