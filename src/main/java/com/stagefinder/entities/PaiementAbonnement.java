package com.stagefinder.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "paiement_abonnement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaiementAbonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float montant;

    @Column(name = "date_de_paiement")
    private LocalDateTime dateDePaiement;

    @ManyToOne
    @JoinColumn(name = "abonnement_id")
    private Abonnement abonnement;
}
