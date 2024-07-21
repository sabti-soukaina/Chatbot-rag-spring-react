package com.example.chatbotrag.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConv;

    @ManyToOne
    private Person person;

    private String question;
    private String response;
    private LocalDateTime timestamp;
}