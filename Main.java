package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    private Button showButton;
    private TextView resultTextView;
    private RadioButton genderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        showButton = (Button) findViewById(R.id.showButtonId);
        resultTextView = (TextView) findViewById(R.id.resultTextViewId);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int selectedId = radioGroup.getCheckedRadioButtonId();
                genderButton = (RadioButton) findViewById(selectedId);
                String value = genderButton.getText().toString();
                resultTextView.setText("You have Selected : + value");


            }
        });

    }
}