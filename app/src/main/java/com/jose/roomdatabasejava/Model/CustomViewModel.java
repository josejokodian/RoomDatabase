package com.jose.roomdatabasejava.Model;

import android.app.Application;

import com.jose.roomdatabasejava.Database.UserEntity;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


public class CustomViewModel extends AndroidViewModel {
// LiveData is a data holder class that can be observed within a given lifecycle.
    // Always holds/caches latest version of data. Notifies its active observers when the
    // data has changed. Since we are getting all the contents of the database,
    // we are notified whenever any of the database contents have changed.

    private UserRepository userRepository;
    private LiveData<List<UserEntity>> userList;

    CustomViewModel(Application application){
        super(application);
        userRepository = new UserRepository(application);
        userList = userRepository.getUserlist();
    }

    LiveData<List<UserEntity>> getUserList(){ return userList; }

    public void insert(UserEntity userEntity){
        userRepository.insert(userEntity);
    }
}
