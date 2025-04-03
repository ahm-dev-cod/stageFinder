package com.stagefinder.dao;

import com.stagefinder.entities.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
}
