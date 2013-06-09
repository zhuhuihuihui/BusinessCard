package com.businesscard.Model;

/**
 * 名片数据结构
 *
 * Created by Scott Zhu on 13-5-30.
 */
public class Card
{
    /**名片唯一ID号*/
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
