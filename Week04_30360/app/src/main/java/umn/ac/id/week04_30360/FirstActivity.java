package umn.ac.id.week04_30360;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    private Button btnHal1, btnHal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnHal1 = findViewById(R.id.main_button_change_1);
        btnHal2 = findViewById(R.id.main_button_change_2);

        btnHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHal1 = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intentHal1);
            }
        });

        btnHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHal2 = new Intent(FirstActivity.this, ThirdActivity.class);
                startActivity(intentHal2);
            }
        });

    }
}
