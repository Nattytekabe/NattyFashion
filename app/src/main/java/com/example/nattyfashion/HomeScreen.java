package com.example.nattyfashion;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class HomeScreen extends AppCompatActivity {
ImageButton ButtonOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        ButtonOne = (ImageButton)findViewById(R.id.ButtonOne);
        ButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeScreen.this, DetailScreen.class);
                startActivity(intent);
            }
        });
    }
}