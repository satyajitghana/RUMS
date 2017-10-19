package com.example.shadowleaf.rums;

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