package com.example.counterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        //1-create object
        Button btnCount;
        TextView txtCount;
        Button btnReset;

        Button btnFuelApp,btnUserApp;

        //2-Bind UI with Java Class
        btnCount = findViewById(R.id.btnCount);
        txtCount = findViewById(R.id.txtCount);
        btnReset = findViewById(R.id.btnReset);

        btnFuelApp = findViewById(R.id.btnFuelApp);
        btnUserApp = findViewById(R.id.btnUserApp);

        //3-On Click Listener
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txtCount.setText("" + count);

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                txtCount.setText(""+count);
            }
        });
        btnUserApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, myLinear.class);

                startActivity(i);
            }
        });
    }
}