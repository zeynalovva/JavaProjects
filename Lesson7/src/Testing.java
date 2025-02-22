import java.util.Arrays;

public class Testing {
    public static Family createTestFamily() {
        Human mother = new Human("Alice", "Johnson", 1978);
        Human father = new Human("Bob", "Johnson", 1975);
        Species spec = Species.DOG;
        Pet pet = new Pet(spec, "Buddy");
        return new Family(mother, father);
    }

    public static void testToString(){
        Family  family = createTestFamily();
        Human child = new Human("Emma", "Johnson", 2005);
        family.addChild(child);
        System.out.println(family.toString());
    }
    public static void testDeleteChild(){
        Family family = createTestFamily();
        Human child1 = new Human("Emma", "Johnson", 2005);
        Human child2 = new Human("Jack", "Johnson", 2010);

        family.addChild(child1);
        family.addChild(child2);

        System.out.println("\nBefore deleting child: " + Arrays.toString(family.getChildren()));

        boolean result = family.deleteChild(0);
        System.out.println("Child deleted: " + result);
        System.out.println("After deleting child: " + Arrays.toString(family.getChildren()));

        Human fakeChild = new Human("Nonexistent", "Johnson", 2020);
        boolean result2 = family.deleteChild(1);
        System.out.println("Non-existing child deleted: " + result2);
        System.out.println("After attempting to delete non-existing child: " + Arrays.toString(family.getChildren()));
    }
    public static void testAddChild(){
        Family family = createTestFamily();
        System.out.println("\nBefore adding child: " + Arrays.toString(family.getChildren()));
        Human child = new Human("Emma", "Johnson", 2005);
        family.addChild(child);
        System.out.println("After adding child: " + Arrays.toString(family.getChildren()));
        System.out.println("Child's family reference: " + child.getFamily());
    }
    public static void testCountFamily(){
        Family family = createTestFamily();
        System.out.println("\nInitial family member count: " + family.countFamily());
        Human child1 = new Human("Emma", "Johnson", 2005);
        family.addChild(child1);
        System.out.println("After adding one child: " + family.countFamily());
        Human child2 = new Human("Jack", "Johnson", 2010);
        family.addChild(child2);
        System.out.println("After adding second child: " + family.countFamily());
    }


    public static void main(String[] args) {
        testToString();
        testDeleteChild();
        testAddChild();
        testCountFamily();
    }
}
