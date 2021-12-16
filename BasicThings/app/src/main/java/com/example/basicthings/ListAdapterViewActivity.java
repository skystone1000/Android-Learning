package com.example.basicthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapterViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_adapter_view);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Bhindi");
        grocery.add("Pen");
        grocery.add("Apples");
        grocery.add("Tea Leaves");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grocery);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String text = "Item" + position+ " " + ((TextView) view).getText().toString();
                Toast.makeText(ListAdapterViewActivity.this,text , Toast.LENGTH_SHORT).show();

            }
        });
    }
}