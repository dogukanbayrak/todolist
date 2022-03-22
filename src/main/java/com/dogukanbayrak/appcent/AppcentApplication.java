package com.dogukanbayrak.appcent;

import com.dogukanbayrak.appcent.Entity.Todo;
import com.dogukanbayrak.appcent.Entity.User;
import com.dogukanbayrak.appcent.repository.TodoRepository;
import com.dogukanbayrak.appcent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppcentApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppcentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();

		user.setPassword("123456");
		user.setUsername("Dogukan");

		Todo todo = new Todo();

		todo.setContent("Practice Programming");

		user.getTodoList().add(todo);

		todoRepository.save(todo);
		userRepository.save(user);

	}
}
