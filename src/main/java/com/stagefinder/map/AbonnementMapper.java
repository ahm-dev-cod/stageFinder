package com.stagefinder.map;

import com.stagefinder.dto.AbonnementDTO;
import com.stagefinder.entities.Abonnement;
// import com.stagefinder.entities.enums.StatutAbonnement; // Import inutile, peut être supprimé
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AbonnementMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "typeAbonnementId", source = "typeAbonnement.id")
    @Mapping(target = "paiementIds", expression = "java(abonnement.getPaiements().stream().map(com.stagefinder.entities.PaiementAbonnement::getId).toList())")
    @Mapping(target = "statutAbonnement", expression = "java(abonnement.getStatutAbonnement().name())")
    AbonnementDTO toDto(Abonnement abonnement);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "typeAbonnement", ignore = true)
    @Mapping(target = "paiements", ignore = true)
    @Mapping(target = "statutAbonnement", expression = "java(com.stagefinder.entities.enums.StatutAbonnement.valueOf(dto.getStatutAbonnement()))")
    Abonnement toEntity(AbonnementDTO dto);
}