package com.best.a82j.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.best.a82j.Models.Users;
import com.best.a82j.R;

import java.util.ArrayList;

public class FirstF extends Fragment {
    ArrayList<Users> list;
    public Listener listener;
    TextView textView;
    Button button;
    String TAG = FirstF.class.toString();

    public FirstF(ArrayList<Users> list, Listener listener) {
        this.list = list;
        this.listener = listener;
    }

    public FirstF() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_firstpage,container,false);

        textView = view.findViewById(R.id.textF);
        button = view.findViewById(R.id.buttonF);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });
        return view;
    }
    public void getData(){
        ArrayList<Users> list = new ArrayList<>();
        list.add(new Users("Abbos", "4321"));
        Log.d(TAG,list.toString());
        textView.setText(list.toString());
        listener.sendF(list);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Listener) {
            listener = (Listener) context;
        } else {
            listener = null;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
    public void updateF(ArrayList<Users> data){
        textView.setText(data.toString());
    }

    public interface Listener {
        void sendF(ArrayList<Users> list);
    }
}
