package Project1;

public class Human {
    public String name, surname;
    public int year, IQ;
    public Pet pet1;
    public Human mother, father;
    public String[][] activity;
    // Constructor with all fields
    public Human(String name, String surname, int year, int IQ, Human mother, Human father, Pet pet1, String[][] activity) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.mother = mother;
        this.father = father;
        this.pet1 = pet1;
        this.activity = activity;
    }
    // Constructor with name, surname, year of birth, father, and mother
    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }
    // Constructor with name, surname, and year of birth
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    // Empty constructor.
    public Human() {

    }
    public String greetPet(){
        return "Hello, " + pet1.nickname;
    }
    public void describePet(){
        String response = "I have an " + pet1.species + " is " + pet1.age + " years old, " + "he is " + ((pet1.age > 50)?"very sly":"almost not sly");
        System.out.println(response);
    }
    public String toString(){
        String petresp = pet1.toString();
        String answer = "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.year + ", iq=" + this.IQ + ", mother=" + this.mother.name + " " + this.mother.surname + ", father=" + this.father.name + " " + this.father.surname + ", pet=" + petresp + "}";
        return answer;
    }


}
