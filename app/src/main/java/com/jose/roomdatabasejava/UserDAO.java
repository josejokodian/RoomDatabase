package com.jose.roomdatabasejava;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserDAO {

    @Insert
    public void addUser(UserEntity userEntity);
}
