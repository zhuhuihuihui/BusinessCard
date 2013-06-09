package com.businesscard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import com.businesscard.ui.LoginActivity;

public class WelcomeActivity extends FragmentActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent toLoginActivity = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(toLoginActivity);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }
    
}
