package bulebar.reservacion.appbar.model;

/**
 * Created by MDJ16 on 09/02/2018.
 */

public class Category {
    private String Name;
    private String Image;

    public Category() {
    }

    public Category(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public String getImage() {
        return Image;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setImage(String image) {
        Image = image;
    }
}
