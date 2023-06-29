package com.hikari.JournalApp.Repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hikari.JournalApp.Models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

}
