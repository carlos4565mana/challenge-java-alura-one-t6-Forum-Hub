package br.com.challenge_alura_one_t6.AluraForum.controllers;

import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicDto;
import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicPageDto;
import br.com.challenge_alura_one_t6.AluraForum.services.interfaces.TopicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topics")
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

    @GetMapping
    public TopicPageDto findAllTopic(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int pageSize){
        return topicService.findAllTopic(page, pageSize);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteTopic(@PathVariable Long id){
        topicService.deleteTopicById(id);

    }
}