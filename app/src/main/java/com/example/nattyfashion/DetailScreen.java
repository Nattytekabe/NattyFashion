package com.example.nattyfashion;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailScreen extends AppCompatActivity {
    ImageButton ButtonOrder;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen);
      ButtonOrder = (ImageButton)findViewById(R.id.ButtonOrder);
      ButtonOrder.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent= new Intent(DetailScreen.this, SuccessScreen.class);
              startActivity(intent);
          }
      });
    }
}