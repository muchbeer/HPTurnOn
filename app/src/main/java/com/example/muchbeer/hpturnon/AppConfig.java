package com.example.muchbeer.hpturnon;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;



/**
 * Created by muchbeer on 3/15/2017.
 */

public class AppConfig {

    //Choose location
    public static String getPreferredLocation(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_location_key),
                context.getString(R.string.pref_location_default));
    }
    // Server user login url
    public static String URL_LOGIN = "http://347870f0.ngrok.io/datacollect/login.php";

    // Server user Webby url
    public static String URL_LOGIN_WEB = "http://192.168.0.176:8080/_AIOUI/matrix/neo.php";

    // Server user register url
    public static String URL_REGISTER = "http://347870f0.ngrok.io/datacollect/register.php";

    // Server user register url
    public static String URL_SENDREGION = "http://347870f0.ngrok.io/datacollect/sendregiontoserver.php";

    //Url for auto collect data from the server
    public static String URL_COLLECT_DATA = "http://347870f0.ngrok.io/datacollect";

    //Url for auto collect data from the server
    public static String URL_COLLECT_DATA_ONLINE = "http://gdgexpertz.000webhostapp.com";


}
