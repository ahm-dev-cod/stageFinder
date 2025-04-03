package com.stagefinder.dao;

import com.stagefinder.entities.PaiementAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementAbonnementRepository extends JpaRepository<PaiementAbonnement, Long> {
}
