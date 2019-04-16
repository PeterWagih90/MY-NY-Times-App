package com.peter.android.nytimes.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Peter Zaky on 2019-04-16.
 */
public class UtilTest {

    private Util myUtil;

    @Before
    public void setUp() throws Exception {
        myUtil = new Util();
    }

    @Test
    public void isOnline() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        ConnectivityManager cm = (ConnectivityManager) appContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        assertNotNull(cm);
    }

}