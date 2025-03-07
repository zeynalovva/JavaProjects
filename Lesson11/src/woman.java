public final class woman extends Human{
    public woman(String name, String surname, int year, int IQ, String[][] schedule, Family family) {
        super(name, surname, year, IQ, schedule, family);
    }
    public woman(String name, String surname, int year) {
        super(name, surname, year);
    }
    public woman(){}
    public void makeup(){
        System.out.println("I am wearing makeup!");
    }
    @Override
    public String greetPet(){
        return "Hello, " + getFamily().getPet().getNickname();
    }
}
