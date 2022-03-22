package com.dogukanbayrak.appcent.repository;

import com.dogukanbayrak.appcent.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
