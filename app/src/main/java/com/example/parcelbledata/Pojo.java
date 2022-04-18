package com.example.parcelbledata;

import android.os.Parcel;
import android.os.Parcelable;

public class Pojo implements Parcelable {
    private String userName;
    private String passWord;

    public Pojo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    protected Pojo(Parcel in) {
        userName = in.readString();
        passWord = in.readString();
    }
    public static final Creator<Pojo> CREATOR = new Creator<Pojo>() {
        @Override
        public Pojo createFromParcel(Parcel in) {
            return new Pojo(in);
        }

        @Override
        public Pojo[] newArray(int size) {
            return new Pojo[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
        parcel.writeString(passWord);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
