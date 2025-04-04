package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaiementAbonnementDTO {
    private Long id;
    private float montant;
    private LocalDateTime dateDePaiement;
    private Long abonnementId;
}
