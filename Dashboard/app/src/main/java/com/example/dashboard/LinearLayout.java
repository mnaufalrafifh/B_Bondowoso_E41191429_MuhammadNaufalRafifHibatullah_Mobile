package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearLayout extends AppCompatActivity {
    EditText To, Subject, Message;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        To = findViewById(R.id.pada);
        Subject = findViewById(R.id.subject);
        Message = findViewById(R.id.pesan);
        Submit = findViewById(R.id.send);

    }
}