public class Dog extends Pet implements foul{
    public Dog(String name) {
        super(name);
        setSpecies(Species.DOG);
    }
    public Dog(){setSpecies(Species.DOG);}
    public Dog(String nickname, int age, int tricklevel, String[] habits){
        super(nickname, age, tricklevel, habits);
    }
    @Override
    void respond() {
        System.out.println("Hello, owner. I am " + super.getNickname() + ". I miss you!");
    }
}
