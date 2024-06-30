package br.com.challenge_alura_one_t6.AluraForum.services.interfaces;

import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicDto;
import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicPageDto;
import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicRequestDto;
import org.springframework.stereotype.Service;


public interface TopicService {
    TopicDto addTopic(TopicDto topicDto);

    TopicPageDto findAllTopic(int page, int pageSize);

    void deleteTopicById(Long id);

    TopicDto upadateTopic(Long id, TopicRequestDto topic);
}
