package com.example.gitlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText name,age;
Button submit;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            name=findViewById(R.id.name);
            age=findViewById(R.id.age);
            submit=findViewById(R.id.submit);
            tv=findViewById(R.id.tv);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText("name: "+ name + " " + "age: "+age );
                }
            });
    }
}