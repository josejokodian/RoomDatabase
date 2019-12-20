package com.jose.roomdatabasejava;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class UserEntity {
    @PrimaryKey
    public int uId;
    @ColumnInfo(name = "user_name")
    public String uName;
    @ColumnInfo(name = "user_email")
    public String uEmail;


    public UserEntity(int uId, @NonNull String uName, @NonNull String uEmail){
        this.uId = uId;
        this.uName = uName;
        this.uEmail = uEmail;
    }

    public UserEntity() {

    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }



}
