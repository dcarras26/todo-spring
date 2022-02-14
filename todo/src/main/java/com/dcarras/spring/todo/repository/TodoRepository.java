package com.dcarras.spring.todo.repository;

import com.dcarras.spring.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository  extends JpaRepository<Todo, Integer> {
}
