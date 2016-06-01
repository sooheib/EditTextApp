package com.example.sooheib.edittextapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

    }

    public void showUserName(View view) {
        String username= editText.getText().toString();
        textView.setText("welcome,"+username);
    }
}
