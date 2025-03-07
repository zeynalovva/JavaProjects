public class Main {
    public static void main(String[] args) {
        woman mother = new woman("Nora", "Nehgomayer", 1980);
        man father = new man("Michael", "Michelle", 1990);
        Family family = new Family(mother, father);
        String[][] activities = {{DayOfWeek.Monday.name(), "Swimming"}, {DayOfWeek.Saturday.name(), "Reading"}};
        Human child = new Human("Jack", "Nehgomayer", 2003, 200, activities, family);
        family.setChildren(new Human[]{child});
        family.finaliz();
        System.out.println(family.toString());
        family.deleteChild(0);
        System.out.println(family.toString());
    }
}
