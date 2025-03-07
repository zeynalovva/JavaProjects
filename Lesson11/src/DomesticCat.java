public class DomesticCat extends Pet implements foul{
    public DomesticCat(String name){ super(name); setSpecies(Species.DOMESTICCAT); }
    public DomesticCat(){ setSpecies(Species.DOMESTICCAT); }
    public DomesticCat(String nickname, int age, int tricklevel, String[] habits){
        super(nickname, age, tricklevel, habits);
    }
    @Override
    void respond() {
        System.out.println("Hello, owner. I am " + super.getNickname() + ". I miss you!");
    }
}
