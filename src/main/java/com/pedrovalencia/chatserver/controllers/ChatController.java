package com.pedrovalencia.chatserver.controllers;

import com.pedrovalencia.chatserver.domain.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pedrovalencia on 02/04/15.
 */

@RestController
@EnableAutoConfiguration
public class ChatController {

    @RequestMapping(value="/chat/send", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String sendMessage(@RequestBody Message message) {


        return message.getMessage() + message.getTimestamp();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ChatController.class, args);
    }
}
