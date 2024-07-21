package com.example.chatbotrag.services;

import com.example.chatbotrag.Repositories.*;
import com.example.chatbotrag.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversationService {

    @Autowired
    private ConversationRepository conversationRepository;

    public List<Conversation> getConversationsByPerson(Person person) {
        return conversationRepository.findByPerson(person);
    }

    public Conversation saveConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }
}
