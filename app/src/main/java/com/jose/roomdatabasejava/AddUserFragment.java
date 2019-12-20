package com.jose.roomdatabasejava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class AddUserFragment extends Fragment implements View.OnClickListener{
    NavController navController=null;
    EditText edit_UserName,edit_UserEmail;
//    private CustomViewModel customViewModel;
    UserEntity userEntity;

    public AddUserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        customViewModel = ViewModelProviders.of(requireActivity()).get(CustomViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        edit_UserName=view.findViewById(R.id.edit_UserName);
        edit_UserEmail=view.findViewById(R.id.edit_UserEmail);
        Button btn_AddUser=view.findViewById(R.id.btn_AddUser);
        btn_AddUser.setOnClickListener(this);
//        customViewModel.getmName().observe(requireActivity(), new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                edit_UserName.setText(s);
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_AddUser:
               // customViewModel.setmName(edit_UserName.getText().toString());
              //  customViewModel.setmEmail(edit_UserEmail.getText().toString());
                String username=edit_UserName.getText().toString();
                String useremail=edit_UserEmail.getText().toString();
                userEntity=new UserEntity();
                userEntity.setuName(username);
                userEntity.setuEmail(useremail);
                //adding data to the table
                MainActivity.userDatabase.userDAO().addUser(userEntity);
                Toast.makeText(getActivity(), "User Added", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
