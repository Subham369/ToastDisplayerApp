package com.example.toastdisplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toastmaker.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this,"Hii my Name is Subham");
    }
}