package com.stagefinder.dao;

import com.stagefinder.dto.MyUserDTO;
import com.stagefinder.entities.MyUser;
import com.stagefinder.entities.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByNom(String username);
    Optional<MyUser> findByEmail(String email);
    List<MyUser> findByRole(Role role);
}
