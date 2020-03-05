package com.goldfish07.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.goldfish07.pbar.PBar;

public class MainActivity extends AppCompatActivity {

    PBar pBar;
    Button showpbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showpbar = findViewById(R.id.showPbar);
        pBar = new PBar(this);
        showpbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pBar.setTitle("Wait!");
                pBar.setMessage("Please wait!");
                pBar.setCancelable(false);
                pBar.show();
            }
        });
    }
}
