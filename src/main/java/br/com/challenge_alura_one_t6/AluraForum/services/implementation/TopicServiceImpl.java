package br.com.challenge_alura_one_t6.AluraForum.services.implementation;

import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicDto;
import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicPageDto;
import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicRequestDto;
import br.com.challenge_alura_one_t6.AluraForum.entities.Course;
import br.com.challenge_alura_one_t6.AluraForum.entities.Topic;
import br.com.challenge_alura_one_t6.AluraForum.entities.User;
import br.com.challenge_alura_one_t6.AluraForum.enuns.TopicStatus;
import br.com.challenge_alura_one_t6.AluraForum.exception.RecordNotFoundException;
import br.com.challenge_alura_one_t6.AluraForum.repositories.CourseRepository;
import br.com.challenge_alura_one_t6.AluraForum.repositories.TopicRepository;
import br.com.challenge_alura_one_t6.AluraForum.repositories.UserRepository;
import br.com.challenge_alura_one_t6.AluraForum.services.interfaces.TopicService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;
    private final UserRepository userRepository;
    private final CourseRepository courseRepository;

    public TopicServiceImpl(TopicRepository topicRepository, UserRepository userRepository, CourseRepository courseRepository) {
        this.topicRepository = topicRepository;
        this.userRepository = userRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public TopicDto addTopic(TopicDto topicDto) {
        /*Optional<User> optionalUser = userRepository.findById(topicDto.userId());
        Optional<Course> optionalCourse = courseRepository.findById(topicDto.courseId());
        if(optionalUser.isPresent() && optionalCourse.isPresent()){
            var createdTopic = new Topic();
            createdTopic.setUser(optionalUser.get());
            createdTopic.setCourse(optionalCourse.get());
            createdTopic.setTitle(topicDto.title());
            createdTopic.setMessage(topicDto.message());
            createdTopic.setCreatedAt(LocalDateTime.now());
            var cretedTopic = this.topicRepository.save(createdTopic);

        }*/
        return null;
    }

    @Override
    public TopicPageDto findAllTopic(int page, int pageSize) {
        Page<Topic> topicPage = topicRepository.findAll(PageRequest.of(page, pageSize));
        List<TopicDto> list =topicPage.getContent().stream()
                .map(Topic::getTopicDto)
                .collect(Collectors.toList());
        return new TopicPageDto(list, topicPage.getTotalElements(), topicPage.getTotalPages());
    }

    @Override
    public void deleteTopicById(Long id) {
        topicRepository.delete(topicRepository.findById(id)
                .orElseThrow(()->new RecordNotFoundException(id)));

    }

    @Override
    public TopicDto upadateTopic(Long id, TopicRequestDto topic) {
        return topicRepository.findById(id).map(
                actual -> {
                    actual.setMessage(topic.getMessage());
                    actual.setTitle(topic.getTitle());
                    //actual.setStatus(topic.getStatus());
                    return topicRepository.save(actual);
                }
        ).orElseThrow(() -> new RecordNotFoundException(id)).getTopicDto();
    }
}









