package com.example.windcore.recyclerviewpractice.model;

/**
 * Created by Wind Core on 4/10/2018.
 */
// TODO (5) This is a model (Object class), to hold the data
public class Message {
    private String messageTitle;
    private String messageBody;

    public Message(String messageTitle, String messageBody) {
        this.messageTitle = messageTitle;
        this.messageBody = messageBody;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
