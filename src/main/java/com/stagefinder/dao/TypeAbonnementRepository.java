package com.stagefinder.dao;

import com.stagefinder.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAbonnementRepository extends JpaRepository<TypeAbonnement, Long> {
}
