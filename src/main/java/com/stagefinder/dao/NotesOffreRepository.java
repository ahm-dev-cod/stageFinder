package com.stagefinder.dao;

import com.stagefinder.entities.NotesOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesOffreRepository extends JpaRepository<NotesOffre, Long> {
}
