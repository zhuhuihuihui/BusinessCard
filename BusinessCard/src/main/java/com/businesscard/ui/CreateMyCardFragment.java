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

    private EditTextWithTextListener cardNameEdit = null;

    private EditTextWithTextListener cardPositionEdit = null;

    private EditTextWithTextListener cardPhoneNumEdit = null;

    private EditTextWithTextListener cardEmailEdit = null;

    private EditTextWithTextListener cardCompanyNameEdit = null;

    private EditTextWithTextListener cardCompanyAddressEdit = null;

    private EditTextWithTextListener cardCompanyTelephoneEdit = null;

    private EditTextWithTextListener cardCompanyFaxEdit = null;

    private EditTextWithTextListener cardCompanyWebsiteEdit = null;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_my_card);
        //mNum = getArguments() != null ? getArguments().getInt("num") : 1;


        newCard = (CardView) getSupportFragmentManager().findFragmentById(R.id.mycard_in_create_card_activity);

        cardNameEdit = (EditTextWithTextListener) findViewById(R.id.cardNameEdit);
        cardNameEdit.setOnEditTextListener(this);

        cardPositionEdit = (EditTextWithTextListener) findViewById(R.id.cardPositionEdit);
        cardPositionEdit.setOnEditTextListener(this);

        cardPhoneNumEdit = (EditTextWithTextListener) findViewById(R.id.cardPhoneNumEdit);
        cardPhoneNumEdit.setOnEditTextListener(this);

        cardEmailEdit = (EditTextWithTextListener) findViewById(R.id.cardEmailEdit);
        cardEmailEdit.setOnEditTextListener(this);

        cardCompanyNameEdit = (EditTextWithTextListener) findViewById(R.id.cardCompanyNameEdit);
        cardCompanyNameEdit.setOnEditTextListener(this);

        cardCompanyAddressEdit = (EditTextWithTextListener) findViewById(R.id.cardCompanyAddressEdit);
        cardCompanyAddressEdit.setOnEditTextListener(this);

        cardCompanyTelephoneEdit = (EditTextWithTextListener) findViewById(R.id.cardCompanyTelephoneEdit);
        cardCompanyTelephoneEdit.setOnEditTextListener(this);

        cardCompanyFaxEdit = (EditTextWithTextListener) findViewById(R.id.cardCompanyFaxEdit);
        cardCompanyFaxEdit.setOnEditTextListener(this);

        cardCompanyWebsiteEdit = (EditTextWithTextListener) findViewById(R.id.cardCompanyFaxEdit);
        cardCompanyWebsiteEdit.setOnEditTextListener(this);
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
            case R.id.cardNameEdit:
                newCard.setCardNameShow(cardNameEdit.getText().toString());
                break;
            case R.id.cardPositionEdit:
                newCard.setCardPositionShow(cardPositionEdit.getText().toString());
                break;
            case R.id.cardPhoneNumEdit:
                newCard.setCardPhoneNumShow(cardPhoneNumEdit.getText().toString());
                break;
            case R.id.cardEmailEdit:
                newCard.setCardEmailShow(cardEmailEdit.getText().toString());
                break;
            case R.id.cardCompanyNameEdit:
                newCard.setCardCompanyNameShow(cardCompanyNameEdit.getText().toString());
                break;
            case R.id.cardCompanyAddressEdit:
                newCard.setCardCompanyAddressShow(cardCompanyAddressEdit.getText().toString());
                break;
            case R.id.cardCompanyTelephoneEdit:
                newCard.setCardCompanyTelephoneShow(cardCompanyTelephoneEdit.getText().toString());
                break;
            case R.id.cardCompanyFaxEdit:
                newCard.setCardCompanyFaxShow(cardCompanyFaxEdit.getText().toString());
                break;
            case R.id.cardCompanyWebsiteEdit:
                newCard.setCardCompanyWebsiteShow(cardCompanyWebsiteEdit.getText().toString());
                break;
            default:
                break;
        }
    }
}
