package com.jose.roomdatabasejava;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentUpdateUser extends Fragment implements View.OnClickListener {
    private NavController navController;
    EditText edit_UserNameUpdate,edit_UserEmailUpdate;
    public FragmentUpdateUser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_update_user, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController=Navigation.findNavController(view);
        edit_UserNameUpdate= view.findViewById(R.id.edit_UserNameUpdate);
        edit_UserEmailUpdate=view.findViewById(R.id.edit_UserEmailUpdate);
        Button btn_UpdateUser=view.findViewById(R.id.btn_UpdateUser);
        btn_UpdateUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_UpdateUser:
               String updatedUserName=edit_UserNameUpdate.getText().toString();
               String updateUserEmail=edit_UserEmailUpdate.getText().toString();
        }
    }
}
