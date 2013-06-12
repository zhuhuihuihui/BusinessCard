package com.businesscard.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;
import com.businesscard.R;

/**
 * 主页面
 *
 * Created by Scott Zhu on 13-5-30.
 */
public class MainActivity extends FragmentActivity
{
    private static final long WAIT_TIME = 2000;
    private long touchTime = 0;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_create_my_card_btn).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                addFragmentToStack();
                
            }
        });

        findViewById(R.id.main_get_other_card_btn).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });

        findViewById(R.id.main_my_card_pocket_btn).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
    }

    @Override
    public void onBackPressed()
    {
        long currentTime = System.currentTimeMillis();
        if((currentTime - touchTime) >= WAIT_TIME)
        {
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            touchTime = currentTime;
        }else
        {
            finish();
        }
    }

    void addFragmentToStack()
    {
        Fragment newFragment = CreateMyCardFragment.newInstance(1);
        FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_create_my_card_fragment, newFragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

}