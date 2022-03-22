package com.dogukanbayrak.appcent.repository;

import com.dogukanbayrak.appcent.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
