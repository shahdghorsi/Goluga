package com.example.recodedharran.goluga;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class CheckNetwork {


    private static final String TAG = CheckNetwork.class.getSimpleName();


    public static boolean isInternetAvailable(Context context) {
        NetworkInfo info = (NetworkInfo) ((ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();

        if (info == null ) {

            return false;
        } else {
            if (info.isConnected()) {
                // alirght!
                return true;
            } else {
// alright
                return true;
            }

        }
    }
}