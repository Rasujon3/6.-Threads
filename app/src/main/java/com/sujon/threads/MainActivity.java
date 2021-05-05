package com.sujon.threads;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    EditText myEditText;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText=findViewById(R.id.editTextTextPersonName);
        myTextView=findViewById(R.id.textView);

    }

    public void OnButtonClick(View view){
        MySecondThread myThread = new MySecondThread();
        myThread.start();

    }

    public class MySecondThread extends Thread{
        MySecondThread(){}


        @Override
        public void run() {
            synchronized (this){
                try {
                    wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.i(TAG, "run: Command Executed !!");
            }
        }
    }

}