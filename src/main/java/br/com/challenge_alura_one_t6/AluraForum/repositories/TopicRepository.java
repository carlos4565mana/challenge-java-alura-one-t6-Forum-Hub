package br.com.challenge_alura_one_t6.AluraForum.repositories;

import br.com.challenge_alura_one_t6.AluraForum.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
