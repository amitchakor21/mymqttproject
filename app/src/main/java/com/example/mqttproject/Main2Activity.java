package com.example.mqttproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.R;

public class Main2Activity extends AppCompatActivity {

    Button on1,off1,on2,off2,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        on1= (Button)findViewById(R.id.on1);
        off1= (Button)findViewById(R.id.off1);
        on2= (Button)findViewById(R.id.on2);
        off2= (Button)findViewById(R.id.off2);
        back=(Button)findViewById(R.id.back);


        on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pub(v,"led1","1023");
            }
        });

        on2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pub(v,"led2","1023");
            }
        });
        off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pub(v,"led1","0");
            }
        });

        off2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pub(v,"led2","0");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
