package com.stagefinder.entities;

import com.stagefinder.entities.enums.Statut;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_de_candidature")
    private LocalDateTime dateCandidature;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    @Column(name = "lettre_de_motivation")
    private String lettreMotivation;

    @Column(name = "cv_choisi")
    private String cvChoisi;

    private String commentaires;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private MyUser user;

    @ManyToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;
}
