package bulebar.reservacion.appbar.Common;

import bulebar.reservacion.appbar.model.User;

/**
 * Created by MDJ16 on 09/02/2018.
 */

public class Common {
    public static User currentUser;
    //Create variable to save current User

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }
}
