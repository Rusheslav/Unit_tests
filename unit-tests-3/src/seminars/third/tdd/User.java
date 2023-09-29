package seminars.third.tdd;

import java.util.Objects;

public class User {

    String name;
    String password;

    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public void authenticate(String name, String password) {
        if (Objects.equals(name, this.name) && Objects.equals(password, this.password)) {
            this.isAuthenticate = true;
        };
    }

    public boolean isAuthorized() {
        return this.isAuthenticate;
    }
}