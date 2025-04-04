package com.stagefinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavorisDTO {
    private Long id;
    private LocalDateTime dateAjout;
    private Long userId;
    private Long offreId;
}
