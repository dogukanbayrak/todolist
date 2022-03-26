package com.dogukanbayrak.appcent.controller;

import com.dogukanbayrak.appcent.Entity.Todo;
import com.dogukanbayrak.appcent.Entity.User;
import com.dogukanbayrak.appcent.repository.TodoRepository;
import com.dogukanbayrak.appcent.repository.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import  static org.mockito.Mockito.when;


import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class UserControllerTest {

    static User user;


    @Autowired
    public UserRepository userRepository;
    public TodoRepository todoRepository;



    @BeforeAll
    static void prep() {
        user= new User();
        user.setUsername("TestUser");
        user.setPassword("TestPass");

    }

    @Test
    void getUserById() {
    }

    @Test
    void addUser() {


        userRepository.save(user);
    }

    @Test
    public void addTodoTest() {


        Todo todo = new Todo();
        todo.setContent("Test daily job");

        user.getTodoList().add(todo);

    }

    @Test
    void toggleTodoCompleted() {
    }

    @Test
    void deleteTodo() {
    }

    @Test
    void deleteUser() {
    }
}