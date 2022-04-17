package com.example.fragv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragv.fragments.firstFragment;
import com.example.fragv.fragments.secondFragment;

public class MainActivity extends AppCompatActivity {

    Button btnfirst , btnsecond;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfirst = findViewById(R.id.btnfirst);
        btnsecond = findViewById(R.id.btnsecond);
        linearLayout = findViewById(R.id.linearlid);

        btnfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment firstFragment = new firstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlid,firstFragment);
                transaction.commit();
            }
        });
        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment secondFragment = new secondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlid,secondFragment);
                transaction.commit();
            }
        });
    }
}