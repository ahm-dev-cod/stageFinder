package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeAbonnementDTO {
    private Long id;
    private String type;
    private List<Long> abonnementIds;
}
