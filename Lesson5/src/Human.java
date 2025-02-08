public class Human {
    private String name, surname;
    private int year, IQ;
    private Pet pet1;
    private Human mother, father;
    private String[][] activity;
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
        return "Hello, " + pet1.getNickname();
    }
    public void describePet(){
        String response = "I have an " + pet1.getSpecies() + " is " + pet1.getAge() + " years old, " + "he is " + ((pet1.getAge() > 50)?"very sly":"almost not sly");
        System.out.println(response);
    }
    public String toString(){
        String petresp = pet1.toString();
        String answer = "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.year + ", iq=" + this.IQ + ", mother=" + this.mother.name + " " + this.mother.surname + ", father=" + this.father.name + " " + this.father.surname + ", pet=" + petresp + "}";
        return answer;
    }

    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIQ() {
        return IQ;
    }
    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public String[][] getActivity() {
        return activity;
    }
    public void setActivity(String[][] activity) {
        this.activity = activity;
    }

}
