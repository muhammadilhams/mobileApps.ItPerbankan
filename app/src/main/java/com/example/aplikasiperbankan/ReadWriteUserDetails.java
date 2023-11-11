package com.example.aplikasiperbankan;

public class ReadWriteUserDetails {

    public String doB, gender, mobile, balance;
    public ReadWriteUserDetails(String textDoB, String textGender, String textMobile){};
    public ReadWriteUserDetails(String textDoB, String textGender, String  textMobile, String textBalance){

        this.doB = textDoB;
        this.gender = textGender;
        this.mobile = textMobile;
        this.balance = textBalance;
    }

}
