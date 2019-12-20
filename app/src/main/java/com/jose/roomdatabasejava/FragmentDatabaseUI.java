package com.jose.roomdatabasejava;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDatabaseUI extends Fragment implements View.OnClickListener {

    NavController navController = null;
    private CustomViewModel customViewModel;
    Button btnAddUser,btnDeleteUser,btnViewUser,btnUpdateUser;
    public FragmentDatabaseUI() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customViewModel = ViewModelProviders.of(requireActivity()).get(CustomViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_database_ui, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        btnAddUser=view.findViewById(R.id.btnAddUser);
        btnAddUser.setOnClickListener(this);
        btnDeleteUser=view.findViewById(R.id.btnDeleteUser);
        btnDeleteUser.setOnClickListener(this);
        btnViewUser=view.findViewById(R.id.btnViewUser);
        btnViewUser.setOnClickListener(this);
        btnUpdateUser=view.findViewById(R.id.btnUpdateUser);
        btnUpdateUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnAddUser:
                customViewModel.setmName("AddUser");
                navController.navigate(R.id.action_fragmentDatabaseUI_to_addUserFragment);
                break;
            case R.id.btnDeleteUser:
                customViewModel.setmName("DeleteUser");
                break;
            case R.id.btnViewUser:
                navController.navigate(R.id.action_fragmentDatabaseUI_to_fragmentViewUser);
                break;
            case R.id.btnUpdateUser:
                customViewModel.setmName("UpdateUser");
                navController.navigate(R.id.action_fragmentDatabaseUI_to_fragmentUpdateUser);
                break;

        }
    }
}
