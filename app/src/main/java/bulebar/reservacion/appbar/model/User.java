package bulebar.reservacion.appbar.model;

/**
 * Created by MDJ16 on 08/02/2018.
 */

public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String Pname, String Ppassword) {
        name = Pname;
        password = Ppassword;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String Pname) {
        name = Pname;
    }

    public void setPassword(String Ppassword) {
        password = Ppassword;
    }
}