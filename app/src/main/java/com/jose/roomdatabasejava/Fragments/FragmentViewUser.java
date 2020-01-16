package com.jose.roomdatabasejava.Fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jose.roomdatabasejava.Database.UserEntity;
import com.jose.roomdatabasejava.MainActivity;
import com.jose.roomdatabasejava.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentViewUser extends Fragment  {

    NavController navController=null;
    TextView textUserName,textUserEmail;

    public FragmentViewUser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_view_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        textUserName= view.findViewById(R.id.textUserName);
        textUserEmail= view.findViewById(R.id.textUserEmail);

        List<UserEntity> userslist = MainActivity.userDatabase.userDAO().getUser();
        String userdetails="";

        for(UserEntity userEntity : userslist){
            String name = userEntity.getuName();
            String email = userEntity.getuEmail();
            userdetails = name+"\n"+email+"\n";
        }
        textUserEmail.setText(userdetails);
    }


}
