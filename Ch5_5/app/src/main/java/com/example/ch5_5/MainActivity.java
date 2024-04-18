package com.example.ch5_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private TextView txvOutPut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvOutPut = (TextView) findViewById(R.id.txvOutPut);
        txvOutPut.setTextSize(25);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.activity_main);
        layout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int act = event.getAction();
        switch (act) {
            case MotionEvent.ACTION_DOWN:
                txvOutPut.setText("ACTION_DOWN");
                txvOutPut.setTextColor(Color.RED);
                break;
            case MotionEvent.ACTION_UP:
                txvOutPut.setText("ACTION_UP");
                txvOutPut.setTextColor(Color.GREEN);
                break;
            case MotionEvent.ACTION_MOVE:
                float x = event.getX();
                float y = event.getY();
                txvOutPut.setText("x = " + x + "\nY = " + y);
                txvOutPut.setTextColor(Color.BLUE);
                break;
        }
        return true;
    }

}