package com.best.a82j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.best.a82j.Fragments.FirstF;
import com.best.a82j.Fragments.SecondF;
import com.best.a82j.Models.Users;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FirstF.Listener, SecondF.Listener {
    FirstF firstF;
    SecondF secondF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }

    @Override
    public void sendF(ArrayList<Users> list) {
        firstF.updateF(list);
    }

    @Override
    public void sendS(ArrayList<Users> list) {
        secondF.updateS(list);
    }

    public void getData() {
          firstF = new FirstF();
         secondF = new SecondF();
        getSupportFragmentManager().beginTransaction().replace(R.id.mainMF, firstF).replace(R.id.mainMS,secondF).commit();

    }
}