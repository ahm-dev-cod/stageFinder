package com.stagefinder.dao;

import com.stagefinder.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}
