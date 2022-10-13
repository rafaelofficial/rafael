package com.dockering.spring.rafael.services;

import com.dockering.spring.rafael.entities.MessageEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String showMessage(final String message) {
        MessageEntity messageEntity = new MessageEntity(message);
        return messageEntity.message();
    }
}
