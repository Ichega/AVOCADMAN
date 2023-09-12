package ru.Yatsevyuk.R.R.company.Avocadman;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void photo(View view){
        Intent intent = new Intent(MainActivity.this, PolimerActivity.class);
        startActivity(intent);
    }
    public void fmd(View view){
        Intent intent = new Intent(MainActivity.this, FmdActivity.class);
        startActivity(intent);
    }

}