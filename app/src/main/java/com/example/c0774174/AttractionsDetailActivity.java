package com.example.c0774174;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AttractionsDetailActivity extends AppCompatActivity {

    private TextView d1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions_detail);
        d1 = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        Canada details = intent.getParcelableExtra("Detail");
        d1.setText(details.toString());
    }
}
