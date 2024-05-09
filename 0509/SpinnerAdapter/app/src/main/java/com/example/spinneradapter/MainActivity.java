package com.example.spinneradapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  String[] courses,desserts;
    private  Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courses = getResources().getStringArray(R.array.courses);
        desserts = getResources().getStringArray(R.array.dessert);

        sp1 = (Spinner)findViewById(R.id.spinner);
        sp2 = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> adpCourses = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,courses);
        ArrayAdapter<String> adpDesserts = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,desserts);

        sp1.setAdapter(adpCourses);
        sp2.setAdapter(adpDesserts);

        Button btnConfirm = (Button) findViewById(R.id.button);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String course = sp1.getSelectedItem().toString();
                String dessert = sp2.getSelectedItem().toString();
                TextView output = (TextView) findViewById(R.id.lblOutput);
                output.setText("主餐:" + course + "\n甜點:" + dessert);
            }
        });
    }
}