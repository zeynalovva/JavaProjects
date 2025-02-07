package HelloWorld;

import java.util.Objects;

public class User {
    public String name;
    private String userID;
    private String email;
    private String phone;
    private String address;

    public User(String name, String userID, String email, String phone, String address) {
        this.name = name;
        this.userID = userID;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void register() {
        //register
    }

    public void login() {
        //login
    }

    public void updateInfo() {
        //update register info
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) && Objects.equals(email, user.email);
    }

    public int hashCode() {
        return Objects.hash(userID, email);
    }
}
