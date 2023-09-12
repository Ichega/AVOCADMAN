package ru.Yatsevyuk.R.R.company.Avocadman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PolimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polimer);
    }

    public void fbtn1 (View view){
        Intent intent = new Intent(PolimerActivity.this, AddActivity.class);
        startActivity(intent);
    }
    public void test (View view){
        Intent intent = new Intent(PolimerActivity.this, ItemActivity.class);
        startActivity(intent);
    }
}