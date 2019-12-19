package com.jose.roomdatabasejava;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserEntity.class},version = 1)
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDAO userDAO();
}
