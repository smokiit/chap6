package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class ex10 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex10);
        String[] items = ("CSI-뉴욕", "CSI-라스베가스", "CSI-아이애미", "Friends",
        "Fringe", "Lost"};

    AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
    ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line, items);
    auto.setAdapter(adapter);

    multiAutoComplateTextView multi = (MultiAutoCompleteTextView)
            findViewById(R.id.multiAutoCompleteTextView1);
    CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
    multi.setTokenizer(token);
    multi.setAdapter(adapter);
}