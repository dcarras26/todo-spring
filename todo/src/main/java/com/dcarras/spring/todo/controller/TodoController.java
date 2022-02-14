package com.dcarras.spring.todo.controller;

import com.dcarras.spring.todo.entity.Todo;
import com.dcarras.spring.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
@CrossOrigin(origins = "localhost:4226/")
public class TodoController {
    private  final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/")
    public List<Todo> getAll() {
        return todoService.getAllTodos();
    }

    @PostMapping("/")
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoService.getTodoById(id);
    }

    @PutMapping("/update")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/delete")
    public void deleteTodo(@RequestBody Todo todo){
        todoService.deleteTodo(todo);
    }

}
