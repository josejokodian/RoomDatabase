package com.jose.roomdatabasejava.Database;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addUser(UserEntity userEntity);

    @Query("select * from user")
    LiveData<List<UserEntity>> getUser();
}
