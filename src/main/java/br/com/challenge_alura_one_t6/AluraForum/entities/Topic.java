package br.com.challenge_alura_one_t6.AluraForum.entities;

import java.time.LocalDateTime;

public class Topic {
    private Long id;
    private String title;

    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

}
