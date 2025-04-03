package com.stagefinder.dao;

import com.stagefinder.entities.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
}
