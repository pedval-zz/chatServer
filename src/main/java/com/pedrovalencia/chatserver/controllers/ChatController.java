package com.pedrovalencia.chatserver.controllers;

import com.pedrovalencia.chatserver.domain.Message;
import com.pedrovalencia.chatserver.domain.Response;
import com.pedrovalencia.chatserver.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pedrovalencia on 02/04/15.
 */

@SpringBootApplication
@RestController
@RequestMapping("/chat")
@EnableMongoRepositories("com.pedrovalencia.chatserver.repositories")
public class ChatController {

    @Autowired
    ChatRepository repository;

    @RequestMapping(method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response createMessage(@RequestBody Message message) {

        repository.save(message);
        return new Response("0000", "Message created");
    }

    @RequestMapping(value="/{timeStamp}", method= RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Message readMessage(@PathVariable String timeStamp) {

        return repository.findOne(timeStamp);
    }

    @RequestMapping(value="/{timeStamp}", method= RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteMessage(@PathVariable String timeStamp) {

        repository.delete(timeStamp);
        return new Response("0001", "Message deleted");
    }

    @RequestMapping(value="/{timeStamp}", method= RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response updateMessage(@RequestBody Message message) {

        repository.save(message);
        return new Response("0002", "Message updated");
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ChatController.class, args);
    }
}
