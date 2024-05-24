package com.example.counter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    MainAcitivityViewModel mainAcitivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ct;
        AppCompatButton inc,dec;
        ct=findViewById(R.id.count);
        inc=findViewById(R.id.up);
        dec=findViewById(R.id.down);
        mainAcitivityViewModel = new ViewModelProvider(this).get(MainAcitivityViewModel.class);

        LiveData<Integer> count = mainAcitivityViewModel.getInitialCounter();
        count.observe(this, integer -> ct.setText(String.format(Locale.US, "%d", integer)));


        inc.setOnClickListener(view -> mainAcitivityViewModel.incCounter());


        dec.setOnClickListener(view -> mainAcitivityViewModel.decCounter());
    }
}