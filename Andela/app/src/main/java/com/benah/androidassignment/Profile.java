package com.benah.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        listView = findViewById(R.id.list_items);
        String[] items = {"Track: Android", "Country: Kenya", "Email: bngaruiya@gmail.com", "Phone Number: +254795966851", "Slack Username: @bngaruiya"};
        ArrayList<String> itemList = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);
    }
}
