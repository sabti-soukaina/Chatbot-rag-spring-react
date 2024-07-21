package com.example.chatbotrag.Repositories;


import com.example.chatbotrag.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ConversationRepository  extends JpaRepository<Conversation, Long>, JpaSpecificationExecutor<Conversation> {
    List<Conversation> findByPerson(Person person);
}

