package br.com.challenge_alura_one_t6.AluraForum.services;

import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicDto;
import org.springframework.stereotype.Service;


public interface TopicService {
    TopicDto addTopic(TopicDto topicDto);
}
