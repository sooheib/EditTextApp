package com.example.sooheib.edittextapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
      /*  setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);*/
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(llParams);
        linearLayout.setPadding(20, 20, 20, 20);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        editText = new EditText(this);
        editText.setHint("Enter your name");
        linearLayout.addView(editText);

        Button button = new Button(this);
        button.setText("Click Me");
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        buttonParams.gravity = Gravity.CENTER_HORIZONTAL;
        button.setLayoutParams(buttonParams);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= editText.getText().toString();
                textView.setText("welcome,"+username);
            }
        });
        linearLayout.addView(button);

        textView= new TextView(this);
        textView.setText("Welcome");
        linearLayout.addView(textView);




    }

   /* public void showUserName(View view) {
        String username= editText.getText().toString();
        textView.setText("welcome,"+username);
    }*/
}
