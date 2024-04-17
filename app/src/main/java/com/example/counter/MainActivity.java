package com.example.counter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ct;
        AppCompatButton inc,dec;
        ct=findViewById(R.id.count);
        ct.setText(getString(R.string.count,0));
        inc=findViewById(R.id.up);
        dec=findViewById(R.id.down);
        inc.setOnClickListener(view -> {
            int current=Integer.parseInt(ct.getText().toString());
            if(current < Integer.MAX_VALUE) {
                ct.setText(getString(R.string.count, current + 1));
                if((current+1)%10 == 0)
                    System.out.println("Reached "+(current+1));
            }
            else{
                ct.setText(getString(R.string.count,0));
            }

        });
        dec.setOnClickListener(view -> {
            int current=Integer.parseInt(ct.getText().toString());
            if(current > Integer.MIN_VALUE) {
                ct.setText(getString(R.string.count, current - 1));
                if((current-1)%10 == 0)
                    System.out.println("Reached "+(current-1));
            }
            else{
                ct.setText(getString(R.string.count,0));
            }
        });
    }
}