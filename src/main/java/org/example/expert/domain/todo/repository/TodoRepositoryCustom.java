package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.dto.response.TodoProjectionDto;
import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.Optional;


public interface TodoRepositoryCustom {
    Optional<Todo> findByIdWithUserFromQueryDsl(Long todoId);

    Page<TodoProjectionDto> searchFromProjection(Pageable pageable,
                                                        String keyword,
                                                        String managerNickname,
                                                        LocalDateTime startDate,
                                                        LocalDateTime endDate);
}
