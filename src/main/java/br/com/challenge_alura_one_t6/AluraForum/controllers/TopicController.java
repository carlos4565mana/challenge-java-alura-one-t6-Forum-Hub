package br.com.challenge_alura_one_t6.AluraForum.controllers;

import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicDto;
import br.com.challenge_alura_one_t6.AluraForum.services.TopicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/question")
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping
    public ResponseEntity postTopic(@RequestBody TopicDto topicDto){
        var topic = topicService.addTopic(topicDto);
        if(topic == null) return new ResponseEntity<>("User or Course not found", HttpStatus.BAD_REQUEST);
        return ResponseEntity.ok().build();


    }

}
