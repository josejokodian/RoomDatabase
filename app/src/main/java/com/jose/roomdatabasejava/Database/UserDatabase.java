package com.jose.roomdatabasejava.Database;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {UserEntity.class},version = 2,exportSchema =  false)
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDAO userDAO();

    private static volatile UserDatabase INSTANCE;
    public static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(4);

  public static UserDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (UserDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UserDatabase.class,"user_databse").build();
                }
            }
        }
        return INSTANCE;
    }

//    private static RoomDatabase.Callback cRoomDatabaseCallbasck = new RoomDatabase.Callback() {
//        @Override
//        public void onOpen(@NonNull SupportSQLiteDatabase db) {
//            super.onOpen(db);
//            databaseExecutor.execute(() ->{
//                //idont get it y assign the same value again from same class.
//                UserDAO dao = INSTANCE.userDAO();
//            });
//        }
//    };
}
//89419