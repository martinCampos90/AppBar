package bulebar.reservacion.appbar.model;

/**
 * Created by MDJ16 on 08/02/2018.
 */

public class User {
    private String name;
    private String password;
    private String phone;


    public User() {
    }

    public User(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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