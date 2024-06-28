package br.com.challenge_alura_one_t6.AluraForum.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String message;
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean solved = false;

    private Topic topic;

    private User author;

}
















