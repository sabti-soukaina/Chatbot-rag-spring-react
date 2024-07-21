package com.example.chatbotrag.web;


import com.example.chatbotrag.Repositories.PersonRepository;
import com.example.chatbotrag.entities.Conversation;
import com.example.chatbotrag.entities.Person;
import com.example.chatbotrag.services.ConversationService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("conversation-history")
public class ConversationHistoryView extends VerticalLayout  {
    @Autowired
    private ConversationService conversationService;

    @Autowired
    private PersonRepository personRepository;

    public ConversationHistoryView() {
        Long personId = 1L; // Replace with actual logic to get logged-in user ID
        Person person = personRepository.findById(personId).orElseThrow(() -> new IllegalArgumentException("User not found"));

        Grid<Conversation> grid = new Grid<>(Conversation.class);
        grid.setColumns("question", "response", "timestamp");

        List<Conversation> conversations = conversationService.getConversationsByPerson(person);
        grid.setItems(conversations);

        add(grid);
    }}
