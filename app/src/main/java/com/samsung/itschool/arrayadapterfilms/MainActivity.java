package com.samsung.itschool.arrayadapterfilms;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] films;
    ArrayList<String> films_list = new ArrayList<>();
    ListView lv;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.films);

        Resources res = getResources();
        films = res.getStringArray(R.array.films);
        films_list.addAll(Arrays.asList(films));
        Log.d("my", "films: " + Arrays.toString(films));
        adapter = new ArrayAdapter(getApplicationContext(), R.layout.item, films_list);
        lv.setAdapter(adapter);
    }

    public void onClick(View v) {
        films_list.add("Pony Zombie");
        adapter.notifyDataSetChanged();

    }
}
