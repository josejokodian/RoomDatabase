package com.jose.roomdatabasejava.Database;

import java.io.Serializable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class UserEntity{
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "user_name")
    private String mname;

    public UserEntity(@NonNull String uname) {
        this.mname = uname;
    }


    @NonNull
    public String getName() {
        return this.mname;
    }



}
