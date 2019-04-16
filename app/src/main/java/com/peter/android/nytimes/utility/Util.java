package com.peter.android.nytimes.utility;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by Peter Zaky on 2019-04-16.
 */

public class Util {

    public static boolean isOnline(Activity activity) {
        ConnectivityManager cm = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        assert cm != null;
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}

