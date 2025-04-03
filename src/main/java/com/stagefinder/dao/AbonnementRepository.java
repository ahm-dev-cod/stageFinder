package com.stagefinder.dao;

import com.stagefinder.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
