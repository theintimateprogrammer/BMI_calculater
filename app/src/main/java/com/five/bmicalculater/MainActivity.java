package com.five.bmicalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     EditText editTextweight=findViewById(R.id.w1);
     EditText editTextheight=findViewById(R.id.H2);
     TextView textView=findViewById(R.id.res);


       Button cal = findViewById(R.id.calculate1);






        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float height = Float.parseFloat(editTextheight.getText().toString())/100;
                float weight = Float.parseFloat(String.valueOf(editTextweight.getText()));
                float bmic = weight/(height*height);
                textView.setText(String.valueOf(bmic));




            }
        });

    }

    }