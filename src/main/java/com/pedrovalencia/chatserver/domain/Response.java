package com.pedrovalencia.chatserver.domain;

/**
 * Created by pedrovalencia on 05/04/15.
 */
public class Response {

    private String code;
    private String description;

    public Response(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
