package com.zy.cultureblog.Dao;

import com.zy.cultureblog.Entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<User, Long> {
}