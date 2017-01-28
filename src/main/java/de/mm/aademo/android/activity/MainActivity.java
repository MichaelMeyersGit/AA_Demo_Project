package de.mm.aademo.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Base64;
import android.util.Log;
import android.widget.Button;
import de.mm.aademo.android.R;
import org.androidannotations.annotations.*;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


/**
 * Created by michael on 15.12.2016.
 *
  *
 */
@EActivity
public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    private static final int RC_SIGN_IN = 12 ;

    @ViewById(R.id.button_login)
    Button loginButton ;

    @ViewById(R.id.button_start)
    Button startButton ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



  }

    @AfterViews
    void afterViews() {



    }

    @Click({R.id.button_login})
    void buttonLoginClicked() {



    }

    @Click({R.id.button_start})
    void buttonStartClicked() {

    }



}
