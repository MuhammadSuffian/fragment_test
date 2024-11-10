package com.example.fragment_test;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    Fragment frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(v->{
            frag=new frag1();
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment,frag);
            ft.addToBackStack(null);
            ft.commit();
        });
        btn2.setOnClickListener(v->{
            frag=new frag2();
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment,frag);
            ft.addToBackStack(null);
            ft.commit();
        });

    }
}