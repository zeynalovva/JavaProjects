package Project1;

import java.util.Arrays;
public class Pet {
    public String species, nickname;
    public int age, tricklevel;
    public String[] habits;
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
}
