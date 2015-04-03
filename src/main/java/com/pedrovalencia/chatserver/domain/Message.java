package com.pedrovalencia.chatserver.domain;

/**
 * Created by pedrovalencia on 03/04/15.
 */
public class Message {

    private long timestamp;
    private String message;

    public Message() {

    }

    public Message(long timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}
