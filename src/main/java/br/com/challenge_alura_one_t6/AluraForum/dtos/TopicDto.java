package br.com.challenge_alura_one_t6.AluraForum.dtos;

import br.com.challenge_alura_one_t6.AluraForum.enuns.TopicStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TopicDto {
    private Long id;
    private String title;
    private String message;
    private LocalDateTime createdAt;
    private String authorName;
    private TopicStatus status ;

}
