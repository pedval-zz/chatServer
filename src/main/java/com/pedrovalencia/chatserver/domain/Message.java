package com.pedrovalencia.chatserver.domain;


import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 * Created by pedrovalencia on 03/04/15.
 */
@Component
public class Message {

    @Id
    private String timestamp;
    private String message;

    public Message() {
    }

    public Message(String timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

}
