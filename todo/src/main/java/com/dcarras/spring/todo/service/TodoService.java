package com.dcarras.spring.todo.service;

import com.dcarras.spring.todo.entity.Todo;
import com.dcarras.spring.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    //GET
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    //GET by ID
    public Todo getTodoById(int id) {
        return todoRepository.getById(id);
    }

    //POST
    public Todo createTodo(Todo todo){
        return todoRepository.save(todo);
    }

    //PUT
    public Todo updateTodo(Todo todo){
        Todo existingTodo = todoRepository.getById(todo.getId());
        existingTodo.setTitle(todo.getTitle());
        existingTodo.setDescription(todo.getDescription());
        existingTodo.setStatus(todo.getStatus());
        return todoRepository.save(existingTodo);
    }

    //DELETE
    public void deleteTodo(Todo todo){
        todoRepository.delete(todo);
    }

}
