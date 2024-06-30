package br.com.challenge_alura_one_t6.AluraForum.dtos;

import lombok.Data;

@Data
public class TopicRequestDto {
    private String title;
    private String message;
    private String courseName;
    private Long userId;
    private Long courseId;

    private String status;
}
