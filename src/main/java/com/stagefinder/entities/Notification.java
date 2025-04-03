package com.stagefinder.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @Column(name = "date_envoie")
    private LocalDateTime dateEnvoie;

    // Remplacement de "destination: DateTime" par une référence à un utilisateur
    @ManyToOne
    @JoinColumn(name = "user_id")
    private MyUser user;
}