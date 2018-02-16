package bulebar.reservacion.appbar.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import bulebar.reservacion.appbar.model.User;

/**
 * Created by MDJ16 on 09/02/2018.
 */

public class Common {
    public static User currentUser;
    //Create variable to save current User

    public static final String DELETE = "Borrar";
    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }

    public static boolean isConnectedToInternet(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(connectivityManager != null){
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if(info != null){
                for (int i=0;i<info.length;i++){
                    if(info[i].getState()== NetworkInfo.State.CONNECTED)
                        return  true;
                }
            }
        }
        return false;
    }
}
