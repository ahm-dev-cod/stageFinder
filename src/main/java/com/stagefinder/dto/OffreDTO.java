package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OffreDTO {
    private Long id;
    private String description;
    private String ville;
    private LocalDateTime datePublication;
    private LocalDateTime dateExpiration;
    private float salaire;
    private String competenceExigee;
    private Long categorieId;
    private Long publieParId;
    private List<Long> candidatureIds;
    private List<Long> notesIds;
    private List<Long> favorisIds;
}
