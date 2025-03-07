public class Fish extends Pet implements foul{
    public Fish(String nickname, int age, int tricklevel, String[] habits){
        super(nickname, age, tricklevel, habits);
    }
    public Fish(String name){
        super(name);
        setSpecies(Species.FISH);
    }
    public Fish(){setSpecies(Species.FISH);}

    @Override
    void respond() {
        System.out.println("Hello, owner. I am " + super.getNickname() + ". I miss you!");
    }
}
