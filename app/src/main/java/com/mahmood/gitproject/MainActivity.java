package com.mahmood.gitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout fr = new FrameLayout(this);
        fr.setBackgroundColor(getResources().getColor(R.color.color1));
        final Button btn =new Button(this);
        btn.setText("Clicke Me");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("Click shod");
            }
        });
        fr.addView(btn);
        setContentView(fr);

       // setContentView(R.layout.activity_main);
    }
}
