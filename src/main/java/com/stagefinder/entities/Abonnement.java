package com.stagefinder.entities;

import com.stagefinder.entities.enums.StatutAbonnement;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_debut")
    private LocalDateTime dateDebut;

    @Column(name = "date_fin")
    private LocalDateTime dateFin;

    @Enumerated(EnumType.STRING)
    private StatutAbonnement statutAbonnement;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private MyUser user;

    @ManyToOne
    @JoinColumn(name = "type_abonnement_id")
    private TypeAbonnement typeAbonnement;

    @OneToMany(mappedBy = "abonnement")
    private List<PaiementAbonnement> paiements;


}
