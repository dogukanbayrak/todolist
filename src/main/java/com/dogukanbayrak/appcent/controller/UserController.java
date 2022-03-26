package com.dogukanbayrak.appcent.controller;


import com.dogukanbayrak.appcent.Entity.Todo;
import com.dogukanbayrak.appcent.Entity.User;
import com.dogukanbayrak.appcent.repository.TodoRepository;
import com.dogukanbayrak.appcent.repository.UserRepository;
import com.dogukanbayrak.appcent.service.todoService;
import com.dogukanbayrak.appcent.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private TodoRepository todoRepository;

    public UserController(UserRepository userRepository, TodoRepository todoRepository) {
        this.userRepository = userRepository;
        this.todoRepository = todoRepository;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new NoSuchElementException());
    }

    @PostMapping
    public User addUser(@RequestBody UserService userService) {
        User user = new User();
        user.setUsername(userService.getUsername());
        user.setPassword(userService.getPassword());
        return userRepository.save(user);
    }

    @PostMapping("/{userId}/todos")
    public void addTodo(@PathVariable Long userId, @RequestBody todoService todoService){
        User user = userRepository.findById(userId).orElseThrow(() -> new NoSuchElementException());
        Todo todo = new Todo();
        todo.setContent(todoService.getContent());
        user.getTodoList().add(todo);
        todoRepository.save(todo);
        userRepository.save(user);
    }


    @PostMapping("/todos/{todoId}")
    public void toggleTodoCompleted( @PathVariable Long todoId) {
        Todo todo = todoRepository.findById(todoId).orElseThrow(() -> new NoSuchElementException());
        todo.setCompleted(!todo.getCompleted());
        todoRepository.save(todo);
    }

    @DeleteMapping("{userId}/todos/{todoId}")
    public void deleteTodo(@PathVariable Long userId, @PathVariable Long todoId){
        User user = userRepository.findById(userId).orElseThrow(() -> new NoSuchElementException());
        Todo todo = todoRepository.findById(todoId).orElseThrow(() -> new NoSuchElementException());
        user.getTodoList().remove(todo);
        todoRepository.delete(todo);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new NoSuchElementException());
        userRepository.delete(user);
    }

}
