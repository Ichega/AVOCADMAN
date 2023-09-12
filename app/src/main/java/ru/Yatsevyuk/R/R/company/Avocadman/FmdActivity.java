package ru.Yatsevyuk.R.R.company.Avocadman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FmdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmd);
    }
    public void fbtn (View view){
        Intent intent = new Intent(FmdActivity.this, AddActivity.class);
        startActivity(intent);
    }
}