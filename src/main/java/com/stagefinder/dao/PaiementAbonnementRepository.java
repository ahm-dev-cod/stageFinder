package com.stagefinder.dao;

import com.stagefinder.entities.PaiementAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementAbonnementRepository extends JpaRepository<PaiementAbonnement, Long> {
}
