package com.businesscard.View;

import android.content.Context;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.businesscard.Model.Card;
import com.businesscard.R;


/**
 * Created by zhuhuihuihui on 13-6-12.
 */
public class CardView extends Fragment
{

    /**Abstract data type for CardView*/
    private Card cardModel = null;
    /**This Card's Owner's name*/
    private TextView cardNameShow = null;
    /**Owner's position in the company*/
    private TextView cardPositionShow = null;
    /**Owner's personal phone number*/
    private TextView cardPhoneNumShow = null;
    /**Owner's personal email address*/
    private TextView cardEmailShow = null;
    /**Company's logo*/
    private ImageView cardCompanyLogoShow = null;
    /**Company's full name*/
    private TextView cardCompanyNameShow = null;
    /**Company's address*/
    private TextView cardCompanyAddressShow = null;
    /**Company's phone number*/
    private TextView cardCompanyTelephoneShow = null;
    /**Company's fax number*/
    private TextView cardCompanyFaxShow = null;
    /**Company's Web Site*/
    private TextView cardCompanyWebsiteShow = null;

    public static CardView newInstance(int num)
    {
        CardView f = new CardView();

//        // Supply num input as an argument.
//        Bundle args = new Bundle();
//        args.putInt("num", num);
//        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        /**get data source instance*/
        cardModel = new Card();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.cardview_layout, container, false);

        cardNameShow = (TextView) v.findViewById(R.id.cardNameShow);
        cardPositionShow = (TextView) v.findViewById(R.id.cardPositionShow);
        cardPhoneNumShow = (TextView) v.findViewById(R.id.cardPhoneNumShow);
        cardEmailShow = (TextView) v.findViewById(R.id.cardEmailShow);
        cardCompanyLogoShow = (ImageView) v.findViewById(R.id.cardCompanyLogoShow);
        cardCompanyNameShow = (TextView) v.findViewById(R.id.cardCompanyNameShow);
        cardCompanyAddressShow = (TextView) v.findViewById(R.id.cardCompanyAddressShow);
        cardCompanyTelephoneShow = (TextView) v.findViewById(R.id.cardCompanyTelephoneShow);
        cardCompanyFaxShow = (TextView) v.findViewById(R.id.cardCompanyFaxShow);
        cardCompanyWebsiteShow = (TextView) v.findViewById(R.id.cardCompanyWebsiteShow);

        return v;
    }


    public Card getCardModel()
    {
        return cardModel;
    }

    public void setCardModel(Card cardModel)
    {
        this.cardModel = cardModel;
    }

    public String getCardNameShow()
    {
        return cardNameShow.getText().toString();
    }

    public void setCardNameShow(String cardNameShow)
    {
        this.cardNameShow.setText(cardNameShow);
        cardModel.getPeople().setName(cardNameShow);
    }

    public String getCardPositionShow() {
        return cardPositionShow.getText().toString();
    }

    public void setCardPositionShow(String cardPositionShow) {
        this.cardPositionShow.setText(cardPositionShow);
        cardModel.getPeople().setPosition(cardPositionShow);
    }

    public String getCardPhoneNumShow() {
        return cardPhoneNumShow.getText().toString();
    }

    public void setCardPhoneNumShow(String cardPhoneNumShow) {
        this.cardPhoneNumShow.setText(cardPhoneNumShow);
        cardModel.getPeople().setPhoneNum(cardPhoneNumShow);
    }

    public String getCardEmailShow() {
        return cardEmailShow.getText().toString();
    }

    public void setCardEmailShow(String cardEmailShow) {
        this.cardEmailShow.setText(cardEmailShow);
        cardModel.getPeople().setEmail(cardEmailShow);
    }

    public ImageView getCardCompanyLogoShow() {
        return cardCompanyLogoShow;
    }

    public void setCardCompanyLogoShow(ImageView cardCompanyLogoShow) {
        this.cardCompanyLogoShow = cardCompanyLogoShow;
    }

    public String getCardCompanyNameShow() {
        return cardCompanyNameShow.getText().toString();
    }

    public void setCardCompanyNameShow(String cardCompanyNameShow) {
        this.cardCompanyNameShow.setText(cardCompanyNameShow);
        cardModel.getCompany().setCompanyName(cardCompanyNameShow);
    }

    public String getCardCompanyAddressShow() {
        return cardCompanyAddressShow.getText().toString();
    }

    public void setCardCompanyAddressShow(String cardCompanyAddressShow) {
        this.cardCompanyAddressShow.setText(cardCompanyAddressShow);
        cardModel.getCompany().setAddress(cardCompanyAddressShow);
    }

    public String getCardCompanyTelephoneShow() {
        return cardCompanyTelephoneShow.getText().toString();
    }

    public void setCardCompanyTelephoneShow(String cardCompanyTelephoneShow) {
        this.cardCompanyTelephoneShow.setText(cardCompanyTelephoneShow);
        cardModel.getCompany().setTelephoneNum(cardCompanyTelephoneShow);
    }

    public String getCardCompanyFaxShow() {
        return cardCompanyFaxShow.getText().toString();
    }

    public void setCardCompanyFaxShow(String cardCompanyFaxShow) {
        this.cardCompanyFaxShow.setText(cardCompanyFaxShow);
        cardModel.getCompany().setFaxNum(cardCompanyFaxShow);
    }

    public String getCardCompanyWebsiteShow() {
        return cardCompanyWebsiteShow.getText().toString();
    }

    public void setCardCompanyWebsiteShow(String cardCompanyWebsiteShow) {
        this.cardCompanyWebsiteShow.setText(cardCompanyWebsiteShow);
        cardModel.getCompany().setWebSite(cardCompanyWebsiteShow);
    }
}
