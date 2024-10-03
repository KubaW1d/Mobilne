package com.example.buttondisableapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button buttonDisable;
    private Button buttonEnable;
    private TextView counter;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable =findViewById(R.id.buttonDisable);
        buttonEnable =findViewById(R.id.buttonEnable);
        counter =findViewById(R.id.counter);
        String text = "licznik:";

        buttonDisable.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                buttonDisable.setEnabled(false);
                count++;
                counter.setText(text+count);
            }
        });
        buttonEnable.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                buttonDisable.setEnabled(true);
            }
        });
    }
}