package com.stagefinder.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotesOffre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String avis;
    @Column(nullable = true)
    private int note;

    @ManyToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;

    // Suggestion d'amélioration : ajouter une relation avec User pour savoir qui a laissé la note
    @ManyToOne
    @JoinColumn(name = "user_id")
    private MyUser user;
}