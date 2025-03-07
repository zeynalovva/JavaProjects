public class RoboCat extends Pet implements foul{
    public RoboCat(String name){
        super(name);
        setSpecies(Species.ROBOCAT);
    }
    public RoboCat(){
        setSpecies(Species.ROBOCAT);
    }
    public RoboCat(String nickname, int age, int tricklevel, String[] habits){
        super(nickname, age, tricklevel, habits);
    }
    @Override
    void respond() {
        System.out.println("Hello, owner. I am " + super.getNickname() + ". I miss you!");
    }
}
