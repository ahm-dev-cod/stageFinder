package com.stagefinder.dao;

import com.stagefinder.entities.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorisRepository extends JpaRepository<Favoris, Long> {
}
