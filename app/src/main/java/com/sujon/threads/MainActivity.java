package com.sujon.threads;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText=findViewById(R.id.editTextTextPersonName);
        myTextView=findViewById(R.id.textView);

    }

    public void OnButtonClick(View view){
        synchronized (this){
            try {
                wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        myTextView.setText("Text Changed!!");

    }

}