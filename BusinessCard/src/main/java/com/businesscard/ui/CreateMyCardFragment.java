package com.businesscard.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.businesscard.R;
import com.businesscard.View.CardView;

/**
 * 创建我的名片
 *
 * Created by Scott Zhu on 13-6-4.
 */
public class CreateMyCardFragment extends FragmentActivity
{
    private CardView newCard = null;
    private EditText cardNameEdit =null;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_my_card);
        //mNum = getArguments() != null ? getArguments().getInt("num") : 1;


        newCard = (CardView) getSupportFragmentManager().findFragmentById(R.id.fragment);

        cardNameEdit = (EditText) findViewById(R.id.cardNameEdit);
        cardNameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3)
            {
                newCard.setCardNameShow(cardNameEdit.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }


    @Override
    public void onResume()
    {
        super.onResume();
    }
}
