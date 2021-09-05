package com.example.nattyfashion;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.widget.Button;
public class GetStarted extends AppCompatActivity {
    ImageButton btn_get_started;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_started);
        btn_get_started = (ImageButton)findViewById(R.id.btn_get_started);
        btn_get_started.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(GetStarted.this, HomeScreen.class);
        startActivity(intent);
    }
});
    }}