public final class man extends Human {
    public man(String name, String surname, int year, int IQ, String[][] schedule, Family family) {
        super(name, surname, year, IQ, schedule, family);
    }
    public man(String name, String surname, int year) {
        super(name, surname, year);
    }
    public void repairCar(){
        System.out.println("I am repairing my car!");
    }
    public man(){}
    @Override
    public String greetPet(){
        return "Hello, " + getFamily().getPet().getNickname();
    }
}
