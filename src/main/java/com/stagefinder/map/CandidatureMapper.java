package com.stagefinder.map;

import com.stagefinder.dto.CandidatureDTO;
import com.stagefinder.entities.Candidature;
import com.stagefinder.entities.enums.Statut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CandidatureMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "offreId", source = "offre.id")
    @Mapping(target = "statut", expression = "java(candidature.getStatut().name())")
    CandidatureDTO toDto(Candidature candidature);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "offre", ignore = true)
    @Mapping(target = "statut", expression = "java(Statut.valueOf(dto.getStatut()))")
    Candidature toEntity(CandidatureDTO dto);
}