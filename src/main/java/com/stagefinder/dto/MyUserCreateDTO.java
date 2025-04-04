package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyUserCreateDTO {
    private String nom;
    private String email;
    private String password; // Champ pour la création
    private String tel;
    private String cvFile;
    private boolean estValide;
    private String adresse;
    private String role;
}
