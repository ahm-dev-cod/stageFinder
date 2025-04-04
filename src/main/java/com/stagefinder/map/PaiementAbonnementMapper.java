package com.stagefinder.map;

import com.stagefinder.dto.PaiementAbonnementDTO;
import com.stagefinder.entities.PaiementAbonnement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaiementAbonnementMapper {

    @Mapping(target = "abonnementId", source = "abonnement.id")
    PaiementAbonnementDTO toDto(PaiementAbonnement paiementAbonnement);

    @Mapping(target = "abonnement", ignore = true)
    PaiementAbonnement toEntity(PaiementAbonnementDTO dto);
}


