package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatureDTO {
    private Long id;
    private LocalDateTime dateCandidature;
    private String statut;
    private String lettreMotivation;
    private String cvChoisi;
    private String commentaires;
    private Long userId;
    private Long offreId;
}
