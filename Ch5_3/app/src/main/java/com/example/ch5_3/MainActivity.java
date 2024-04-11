package com.example.ch5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{

    private float oreginal_size = 20;
    private  TextView txvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txvOutput = (TextView) findViewById(R.id.txvOutput);
        txvOutput.setTextSize(oreginal_size);
        Button btnEnlarge = (Button)findViewById(R.id.btnEnlarge);
        btnEnlarge.setOnClickListener(this);
        btnEnlarge.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float size = txvOutput.getTextSize();
        Log.v("SIZE","size = "+ size);
        txvOutput.setTextSize(size + 1);


    }


    @Override
    public boolean onLongClick(View v) {
        txvOutput.setTextSize(oreginal_size);
        return false;
    }
}