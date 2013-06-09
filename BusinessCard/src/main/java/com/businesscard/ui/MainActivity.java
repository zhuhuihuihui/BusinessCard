package com.businesscard.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.businesscard.R;

/**
 * Ö÷Ò³Ãæ
 *
 * Created by Scott Zhu on 13-5-30.
 */
public class MainActivity extends FragmentActivity
{


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

    void addFragmentToStack()
    {
        Fragment newFragment = CreateMyCardFragment.newInstance(1);
        FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_create_my_card_fragment, newFragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

}