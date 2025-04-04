package com.stagefinder.map;

import com.stagefinder.dto.TypeAbonnementDTO;
import com.stagefinder.entities.TypeAbonnement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TypeAbonnementMapper {

    @Mapping(target = "abonnementIds", expression = "java(typeAbonnement.getAbonnements().stream().map(com.stagefinder.entities.Abonnement::getId).toList())")
    TypeAbonnementDTO toDto(TypeAbonnement typeAbonnement);

    @Mapping(target = "abonnements", ignore = true)
    TypeAbonnement toEntity(TypeAbonnementDTO dto);
}