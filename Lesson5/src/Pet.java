
import java.util.Arrays;
public class Pet {
    private String species, nickname;
    private int age, tricklevel;
    private String[] habits;
    // Constructor with all fields
    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }
    // Constructor with species and nickname
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
    // Empty constructor.
    public Pet() {

    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you");
    }
    public void foul() {
        System.out.println("I need to cover it up");
    }
    public String toString(){
        String answer = this.species + "{nickname='" + this.nickname + "', age=" + this.age + ", tricklevel=" + this.tricklevel + ", habits=" + Arrays.toString(this.habits) + "}";
        return answer;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getTricklevel() {
        return tricklevel;
    }
    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }
    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }

}
