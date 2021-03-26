package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button linear;
    private Button relative;
    private Button constraint;
    private Button frame;
    private Button tabel;
    private Button material;
    private Button scroll1;
    private Button scroll2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = (Button) findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLinearLayout();
            }
        });
        relative = (Button) findViewById(R.id.relative);
        relative.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRelativeLayout();
            }
        });
        constraint = (Button) findViewById(R.id.constraint);
        constraint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openConstraintLayout();
            }
        });
        frame = (Button) findViewById(R.id.frame);
        frame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFrameLayout();
            }
        });
        tabel = (Button) findViewById(R.id.tabel);
        tabel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTabelLayout();
            }
        });
        material = (Button) findViewById(R.id.material);
        material.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMaterialDesign();
            }
        });
        scroll1 = (Button) findViewById(R.id.scroll1);
        scroll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScrollView();
            }
        });
        scroll2 = (Button) findViewById(R.id.scroll2);
        scroll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScrollView2();
            }
        });
    }
    public void openLinearLayout(){
        Intent linear = new Intent(this, LinearLayout.class);
        startActivity(linear);
    }
    public void openRelativeLayout(){
        Intent relative = new Intent(this, RelativeLayout.class);
        startActivity(relative);
    }
    public void openConstraintLayout(){
        Intent constraint = new Intent(this, ConstraintLayout.class);
        startActivity(constraint);
    }
    public void openFrameLayout(){
        Intent frame = new Intent(this, FrameLayout.class);
        startActivity(frame);
    }
    public void openTabelLayout(){
        Intent tabel = new Intent(this, TabelLayout.class);
        startActivity(tabel);
    }
    public void openMaterialDesign(){
        Intent material = new Intent(this, MaterialDesign.class);
        startActivity(material);
    }
    public void openScrollView(){
        Intent scroll1 = new Intent(this, ScrollView.class);
        startActivity(scroll1);
    }
    public void openScrollView2(){
        Intent scroll2 = new Intent(this, ScrollView2.class);
        startActivity(scroll2);
    }
}