package com.stagefinder.dao;

import com.stagefinder.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
