package com.stagefinder.entities;

import com.stagefinder.entities.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nom;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String tel;

    @Column(name = "cv_file")
    private String cvFile;

    @Column(name = "est_valide")
    private boolean estValide;

    private String adresse;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Candidature> candidatures;

    @OneToMany(mappedBy = "user")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "user")
    private List<Favoris> favoris;

    @OneToMany(mappedBy = "user")
    private List<Abonnement> abonnements;

    @OneToMany(mappedBy = "publiePar")
    private List<Offre> offresPubliees;

    @OneToMany(mappedBy = "user")
    private List<NotesOffre> notesOffres;
}
