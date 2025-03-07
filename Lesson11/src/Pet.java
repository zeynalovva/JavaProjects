import java.lang.ref.Cleaner;
import java.util.Arrays;
import java.util.Objects;

enum Species {
    DOG, CAT, ARMADILLO, AFGHAN_HOUND, FISH, DOMESTICCAT, ROBOCAT, UNKNOWN;
}


public abstract class Pet {
    private Species species = Species.UNKNOWN;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;
    public Pet(String nickname, int age, int tricklevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet() { }

    public void eat(){
        System.out.println("I am eating!");
    }

    abstract void respond();

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age +
                ", tricklevel=" + tricklevel + ", habits=" + Arrays.toString(habits) + "}";
    }

    public Species getSpecies() { return species; }
    public void setSpecies(Species species) { this.species = species; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getTricklevel() { return tricklevel; }
    public void setTricklevel(int tricklevel) { this.tricklevel = tricklevel; }

    public String[] getHabits() { return habits; }
    public void setHabits(String[] habits) { this.habits = habits; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return age == pet.age &&
                tricklevel == pet.tricklevel &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, tricklevel);
    }
    public void finaliz(){
        final Cleaner cleaner = Cleaner.create();
        final Cleaner.Cleanable cleanable;
        cleanable = cleaner.register(this, () -> System.out.println("Cleaning up resources"));
        cleanable.clean();
    }
}
