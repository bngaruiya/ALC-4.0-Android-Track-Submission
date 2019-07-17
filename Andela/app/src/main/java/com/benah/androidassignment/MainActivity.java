package com.benah.androidassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.benah.androidassignment.R.id.btnTOAbtALC;
import static com.benah.androidassignment.R.id.btnToProf;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnAbtALC = findViewById(btnTOAbtALC);
        Button btnProf = findViewById(btnToProf);

        btnAbtALC.setOnClickListener(this);
        btnProf.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case btnTOAbtALC:
                Intent intent = new Intent(this, AboutALC.class);
                startActivity(intent);
                break;
            case btnToProf:
                Intent intent2 = new Intent(this, Profile.class);
                startActivity(intent2);
                break;
        }
    }
}
