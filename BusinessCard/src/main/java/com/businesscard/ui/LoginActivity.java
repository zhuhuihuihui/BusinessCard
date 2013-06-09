package com.businesscard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.businesscard.R;

/**
 * µÇÂ½½çÃæ
 *
 * Created by Scott Zhu on 13-5-28.
 */
public class LoginActivity extends FragmentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        findViewById(R.id.login_login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent toMainActivity = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(toMainActivity);
                finish();
            }
        });
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
}
