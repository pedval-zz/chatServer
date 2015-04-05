package com.pedrovalencia.chatserver.domain;


import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 * Created by pedrovalencia on 03/04/15.
 */
@Component
public class Message {

    @Id
    private String id;

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
