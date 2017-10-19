package com.example.shadowleaf.rums;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

public class        MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());


    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
