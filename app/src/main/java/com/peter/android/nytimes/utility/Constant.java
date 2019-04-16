package com.peter.android.nytimes.utility;

/**
 * Created by Peter Zaky on 2019-04-16.
 */

public class Constant {

    static {
        System.loadLibrary("native-lib");
    }

    public static native String baseUrl();
    public static native String getApiKey();

    public final static String BASE_URL = baseUrl();
    public final static String API_KEY = getApiKey();

}
