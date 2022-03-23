package com.example.roomstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton exam_button;
    RadioButton busy_button;
    RadioButton available_button;

    EditText custom_view;
    Button button;
    TextView result_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exam_button = findViewById(R.id.exam_button);
        busy_button = findViewById(R.id.busy_button);
        available_button = findViewById(R.id.available_button);

        custom_view = findViewById(R.id.custom_view);
        button = findViewById(R.id.button);
        result_view = findViewById(R.id.result_view);
    }

    public void modePicker (View view){
        String exam_value = exam_button.getText().toString().trim();

        String busy_value = busy_button.getText().toString().trim();

        String available_value = available_button.getText().toString().trim();

        String custom_value = custom_view.getText().toString().trim();

        if (custom_value.isEmpty()) {
            if (exam_button.isChecked()) {
                result_view.setText(exam_value + " MODE");
            }
            if (busy_button.isChecked()) {
                result_view.setText(busy_value + " MODE");
            }
            if (available_button.isChecked()) {
                result_view.setText(available_value + " MODE");
            }
        }else{
                if (exam_button.isChecked()){
                    result_view.setText(exam_value + " MODE" + "\n TEXT: " + custom_value);
                }
                if (busy_button.isChecked()){
                    result_view.setText(busy_value + " MODE" + "\n TEXT: " + custom_value);
                }
                if (available_button.isChecked()){
                    result_view.setText(available_value + " MODE" + "\n TEXT: " + custom_value);
                }
            }

        }

    }
