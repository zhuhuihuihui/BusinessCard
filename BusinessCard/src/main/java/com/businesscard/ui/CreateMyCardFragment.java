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
import com.businesscard.View.EditTextWithTextListener;
import com.businesscard.interfaces.EditTextListener;

/**
 * �����ҵ���Ƭ
 *
 * Created by Scott Zhu on 13-6-4.
 */
public class CreateMyCardFragment extends FragmentActivity implements EditTextListener
{
    private CardView newCard = null;

    private EditText cardNameEdit = null;

    private EditTextWithTextListener cardPositionEdit = null;

    private EditText cardPhoneNumEdit = null;

    private EditText cardEmailEdit = null;

    private EditText cardCompanyNameEdit = null;

    private EditText cardCompanyAddressEdit = null;

    private EditText cardCompanyTelephoneEdit = null;

    private EditText cardCompanyFaxEdit = null;

    private EditText cardCompanyWebsiteEdit = null;

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

        cardPositionEdit = (EditTextWithTextListener) findViewById(R.id.cardPositionEdit);
        cardPositionEdit.setOnEditTextListener(this);


    }


    @Override
    public void onResume()
    {
        super.onResume();
    }


    @Override
    public void textChanged(int id)
    {
        switch (id)
        {
            case R.id.cardPositionEdit:
                newCard.setCardPositionShow(cardPositionEdit.getText().toString());
                break;
            default:
                break;
        }
    }
}
