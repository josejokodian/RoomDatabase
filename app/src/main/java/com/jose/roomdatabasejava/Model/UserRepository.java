package com.jose.roomdatabasejava.Model;

import android.app.Application;

import com.jose.roomdatabasejava.Database.UserDAO;
import com.jose.roomdatabasejava.Database.UserDatabase;
import com.jose.roomdatabasejava.Database.UserEntity;

import java.util.List;

import androidx.lifecycle.LiveData;

public class UserRepository {
    private UserDAO userDAO;
    private LiveData<List<UserEntity>> userlist;

    UserRepository(Application application){
        UserDatabase userDB = UserDatabase.getDatabase(application);
        userDAO = userDB.userDAO();
        userlist = userDAO.getUser();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<UserEntity>> getUserlist(){return userlist; }

    void insert(UserEntity userEntity){
        UserDatabase.databaseExecutor.execute(()->{
        userDAO.addUser(userEntity);
        });
    }
}
