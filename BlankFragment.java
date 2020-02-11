package com.example.navigation2;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        final EditText editText;
        editText=getView().findViewById(R.id.editText);
        String tex=editText.getText().toString();
        final Bundle bundle =new Bundle();
        bundle.putString("arg",tex);
        Button button =getView().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1=getView().findViewById(R.id.editText);
                Bundle bundle=new Bundle();
                bundle.putString("arg",editText.getText().toString());
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.action_blankFragment_to_blankFragment2,bundle);
            }
        });
        //getView().findViewById(R.id.button).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment_to_blankFragment2,bundle));
        super.onActivityCreated(savedInstanceState);
    }
}
