public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Nora", "Nehgomayer", 1980);
        Human father = new Human("Michael", "Michelle", 1990);
        Family family = new Family(mother, father);
        Pet pet = new Pet(Species.CAT, "Negro", 2, 10, new String[]{"playing", "barking"});
        family.setPet(pet);
        String[][] activities = {{DayOfWeek.Monday.name(), "Swimming"}, {DayOfWeek.Saturday.name(), "Reading"}};
        Human child = new Human("Jack", "Nehgomayer", 2003, 200, activities, family);
        family.setChildren(new Human[]{child});
        family.finaliz();
        System.out.println(family.toString());
        family.deleteChild(0);
        System.out.println(family.toString());
    }
}
