package com.stagefinder.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String ville;
    private String titre;

    @Column(name = "date_publication")
    private LocalDateTime datePublication;

    @Column(name = "date_expiration")
    private LocalDateTime dateExpiration;

    private float salaire;

    @Column(name = "competence_exigee")
    private String competenceExigee;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @OneToMany(mappedBy = "offre")
    private List<Candidature> candidatures;

    @OneToMany(mappedBy = "offre")
    private List<NotesOffre> notes;

    @OneToMany(mappedBy = "offre")
    private List<Favoris> favoris;

    @ManyToOne
    @JoinColumn(name = "publie_par_id")
    private MyUser publiePar;
}
