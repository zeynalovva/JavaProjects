import java.util.Arrays;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ", children=" + Arrays.toString(children).toString() +
                ", pet=" + pet.toString() +
                '}';
    }
    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        pet = new Pet();
    }
}
