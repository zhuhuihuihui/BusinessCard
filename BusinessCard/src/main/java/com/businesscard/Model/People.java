package com.businesscard.Model;

/**
 * Created by Scott Zhu on 13-5-30.
 */
public class People
{

    private long peopleId;
    private String phoneNum;
    private String name;
    private String position;
    private String email;

    public People()
    {
        /**后期换成从服务器获取*/
        setPeopleId(System.currentTimeMillis());

    }

    public long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(long peopleId) {
        this.peopleId = peopleId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
