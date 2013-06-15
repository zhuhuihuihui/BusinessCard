package com.businesscard.Model;

/**
 * ��Ƭ���ݽṹ
 *
 * Created by Scott Zhu on 13-5-30.
 */
public class Card
{
    /**��ƬΨһID��*/
    private long cardID;

    private CardType cardType;

    private People people;

    private Company company;

    public Card()
    {
        /**���ÿ�Ƭ��id��
         * �������id��Ӧ�ôӷ�������ȡ��
         * ��card������ɺ󣬽������ϴ�����������ȡ���ص�id�ţ�
         * �����û�id��people id��������
         * ������ʱ��ϵͳʱ�����
         * */
        setCardID(System.currentTimeMillis());
        this.people = new People();
        this.company = new Company();
        setCardType(CardType.PERSONAL_WITH_COMPANY);

    }

    public long getCardID() {
        return cardID;
    }

    public void setCardID(long cardID) {
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
