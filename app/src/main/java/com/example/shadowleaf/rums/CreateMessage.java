package com.example.shadowleaf.rums;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Date;

/*
 * Message Class
 * Author : Satyajit Ghana
 * Updated 19-October-2017
 */

class Message {
    private String message;
    private String messageSender;
    private String messageReciever;
    private Date date;

    Message(String message, String sender, String receiver) {
        this.message = message;
        this.date = new Date();
        this.messageReciever = receiver;
        this.messageSender = sender;
    }

    Message getMessage(Message message) {
        return message;
    }
}

/*
 * CreateMessage Class
 * Author : Satyajit Ghana
 * Updated 19-October-2017
 */

public class CreateMessage extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText inputText = (EditText) findViewById(R.id.editText2);
                String typedText = inputText.getText().toString();
                Message currMessage = new Message(typedText, "Sender", "Reciever");
                Log.d("TEST ", typedText);
            }
        });
    }
}
