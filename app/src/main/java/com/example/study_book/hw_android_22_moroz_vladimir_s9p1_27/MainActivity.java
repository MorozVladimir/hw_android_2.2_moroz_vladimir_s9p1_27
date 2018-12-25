package com.example.study_book.hw_android_22_moroz_vladimir_s9p1_27;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Button button1 = new Button(this);
        button1.setText("1");
        Button button2 = new Button(this);
        button2.setText("2");
        Button button3 = new Button(this);
        button3.setText("3");
        Button button4 = new Button(this);
        button4.setText("4");
        Button button5 = new Button(this);
        button5.setText("1");
        Button button6 = new Button(this);
        button6.setText("2");
        Button button7 = new Button(this);
        button7.setText("3");
        Button button8 = new Button(this);
        button8.setText("4");

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        ViewGroup.LayoutParams layoutParams1 = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        GridLayout.LayoutParams gridLayoutParams = new GridLayout.LayoutParams();
        gridLayoutParams.setGravity(Gravity.CENTER);

        ((LinearLayout.LayoutParams) layoutParams3).weight = 0.5f;


        GridLayout gridLayout1 = new GridLayout(this);
        gridLayout1.setRowCount(2);
        gridLayout1.setColumnCount(2);
        gridLayout1.setBackgroundColor(Color.parseColor("#D0E0D0"));
        gridLayout1.setLayoutParams(layoutParams);
        gridLayout1.setLayoutParams(gridLayoutParams);
        gridLayout1.addView(button1);
        gridLayout1.addView(button2);
        gridLayout1.addView(button3);
        gridLayout1.addView(button4);

        GridLayout gridLayout2 = new GridLayout(this);
        gridLayout2.setRowCount(2);
        gridLayout2.setColumnCount(2);
        gridLayout2.setBackgroundColor(Color.parseColor("#E0D0D0"));
        gridLayout2.setLayoutParams(layoutParams);
        gridLayout2.setLayoutParams(gridLayoutParams);
        gridLayout2.addView(button5);
        gridLayout2.addView(button6);
        gridLayout2.addView(button7);
        gridLayout2.addView(button8);

        GridLayout gridLayout3 = new GridLayout(this);
        gridLayout3.setBackgroundColor(Color.parseColor("#D0E0D0"));
        gridLayout3.setLayoutParams(layoutParams3);
        gridLayout3.setLayoutParams(layoutParams1);
        gridLayout3.addView(gridLayout1);

        GridLayout gridLayout4 = new GridLayout(this);
        gridLayout4.setBackgroundColor(Color.parseColor("#E0D0D0"));
        gridLayout4.setLayoutParams(layoutParams3);
        gridLayout4.setLayoutParams(layoutParams1);
        gridLayout4.addView(gridLayout2);

        GridLayout gridLayout5 = new GridLayout(this);
        gridLayout5.setLayoutParams(layoutParams2);
        gridLayout5.setPadding(30,30,30,30);
        gridLayout5.setRowCount(2);
        gridLayout5.setColumnCount(1);
        gridLayout5.addView(gridLayout3);
        gridLayout5.addView(gridLayout4);





        setContentView(gridLayout5);

    }
}
