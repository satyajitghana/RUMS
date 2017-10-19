package com.example.shadowleaf.rums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("TEST","this was a test");
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText inputText = (EditText) findViewById(R.id.editText2);
                String typedText = inputText.getText().toString();
                Message currMessage = new Message(typedText, "Sender", "Reciever");
                Log.d("Typed Message ", typedText);
            }
        });
    }
}
