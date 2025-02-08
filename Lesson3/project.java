package Lesson3;

public class project {
    public static void main(String[] args) {
        String[][] activities = {{"Monday", "Swimming"}, {"Tuesday", "Reading"}};
        Pet heyvan = new Pet("Scotish", "Negro", 2, 10, new String[]{"playing", "barking"});
        Human mother = new Human("Nora", "Nehgomayer", 1980);
        Human father = new Human("Michael", "Michelle", 1990);
        Human adam = new Human("Jack", "Nehgomayer", 2003, 200 , mother, father, heyvan, activities );
        System.out.println(adam.toString());
        adam.describePet();
        System.out.println(adam.greetPet());
        heyvan.eat();//
        heyvan.respond();
        heyvan.foul();
        System.out.println(heyvan.toString());
    }
}