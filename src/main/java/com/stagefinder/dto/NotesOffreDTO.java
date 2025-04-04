package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotesOffreDTO {
    private Long id;
    private String avis;
    private int note;
    private Long offreId;
    private Long userId;
}
