package br.com.challenge_alura_one_t6.AluraForum.dtos;

import java.util.List;

public record TopicPageDto(List<TopicDto> topics, long totalElements, int totalPages) {
}
