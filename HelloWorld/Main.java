package HelloWorld;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nigga", "41241", "nigga@gmail.com", "71524756", "Nizami Kucesi");
        User user2 = new User("Nugger", "41341", "nigga@outlook.com", "74524756", "Yasamal");
        user1.register();
        user1.login();
        user1.updateInfo();
        System.out.println(user1.name);
        if(user1.equals(user2)) {
            System.out.printf("User is the same");
        }
        else{
            System.out.printf("User is not the same");
        }
    }
}