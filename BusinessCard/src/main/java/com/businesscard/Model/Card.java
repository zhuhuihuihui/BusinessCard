package com.businesscard.Model;

/**
 * ��Ƭ���ݽṹ
 *
 * Created by Scott Zhu on 13-5-30.
 */
public class Card
{
    /**��ƬΨһID��*/
    private String cardID;

    private CardType cardType;

    private People people;

    private Company company;

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
