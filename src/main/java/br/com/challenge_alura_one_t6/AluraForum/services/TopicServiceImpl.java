package br.com.challenge_alura_one_t6.AluraForum.services;

import br.com.challenge_alura_one_t6.AluraForum.dtos.TopicDto;
import br.com.challenge_alura_one_t6.AluraForum.entities.Course;
import br.com.challenge_alura_one_t6.AluraForum.entities.Topic;
import br.com.challenge_alura_one_t6.AluraForum.entities.User;
import br.com.challenge_alura_one_t6.AluraForum.repositories.CourseRepository;
import br.com.challenge_alura_one_t6.AluraForum.repositories.TopicRepository;
import br.com.challenge_alura_one_t6.AluraForum.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService{
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
        Optional<User> optionalUser = userRepository.findById(topicDto.userId());
        Optional<Course> optionalCourse = courseRepository.findById(topicDto.courseId());
        if(optionalUser.isPresent() && optionalCourse.isPresent()){
            var createdTopic = new Topic();
            createdTopic.setUser(optionalUser.get());
            createdTopic.setCourse(optionalCourse.get());
            createdTopic.setTitle(topicDto.title());
            createdTopic.setMessage(topicDto.message());
            createdTopic.setCreatedAt(LocalDateTime.now());
            var cretedTopic = this.topicRepository.save(createdTopic);

        }
        return null;
    }
}
