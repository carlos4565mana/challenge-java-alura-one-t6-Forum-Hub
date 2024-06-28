package br.com.challenge_alura_one_t6.AluraForum.services;

import br.com.challenge_alura_one_t6.AluraForum.dtos.CourseDto;
import br.com.challenge_alura_one_t6.AluraForum.entities.Course;
import br.com.challenge_alura_one_t6.AluraForum.repositories.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements  CourseService{
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDto addCourse(CourseDto courseDto) {
        var newCourse = new Course();
        newCourse.setName(courseDto.name());
        newCourse.setCategory(courseDto.category());
        courseRepository.save(newCourse);
        return null;
    }
}
