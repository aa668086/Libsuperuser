package com.example.administrator.libsuperuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eu.chainfire.libsuperuser.Shell;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){
        Shell.SU.run("");
    }


}
