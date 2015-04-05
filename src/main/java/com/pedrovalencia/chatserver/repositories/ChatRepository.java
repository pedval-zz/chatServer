package com.pedrovalencia.chatserver.repositories;

import com.pedrovalencia.chatserver.domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pedrovalencia on 04/04/15.
 */
public interface ChatRepository extends MongoRepository<Message, String> {

}
