package com.businesscard.Model;

/**
 * 名片数据结构
 *
 * Created by Scott Zhu on 13-5-30.
 */
public class Card
{
    /**名片唯一ID号*/
    private long cardID;

    private CardType cardType;

    private People people;

    private Company company;

    public Card()
    {
        /**设置卡片的id，
         * 后期这个id号应该从服务器获取，
         * （card设置完成后，将参数上传服务器并获取返回的id号）
         * 并和用户id，people id关联起来
         * 这里暂时用系统时间替代
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
