package com.stagefinder.dao;

import com.stagefinder.entities.MyUser;
import com.stagefinder.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Optional<Token> findByToken(String token);

    List<Token> findAllByUser(MyUser user);

    List<Token> findAllByUserAndExpiredFalseAndRevokedFalse(MyUser user);
}
