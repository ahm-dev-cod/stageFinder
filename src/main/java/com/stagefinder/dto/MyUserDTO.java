package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyUserDTO {
    private Long id;
    private String nom;
    private String email;
    private String tel;
    private String cvFile;
    private boolean estValide;
    private String adresse;
    private String role;
    private List<Long> candidatureIds;
    private List<Long> notificationIds;
    private List<Long> favorisIds;
    private List<Long> abonnementIds;
    private List<Long> notesOffreIds;
    private List<Long> offresPublieesIds;
}
