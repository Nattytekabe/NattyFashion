package com.example.nattyfashion;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SuccessScreen extends AppCompatActivity {
    ImageButton ButtonHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success_screen);
        ButtonHome = (ImageButton)findViewById(R.id.ButtonHome);
        ButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SuccessScreen.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}








