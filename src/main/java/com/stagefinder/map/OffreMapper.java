package com.stagefinder.map;

import com.stagefinder.dto.OffreDTO;
import com.stagefinder.entities.Offre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OffreMapper {

    @Mapping(target = "categorieId", source = "categorie.id")
    @Mapping(target = "publieParId", source = "publiePar.id")
    @Mapping(target = "candidatureIds", expression = "java(offre.getCandidatures().stream().map(com.stagefinder.entities.Candidature::getId).toList())")
    @Mapping(target = "notesIds", expression = "java(offre.getNotes().stream().map(com.stagefinder.entities.NotesOffre::getId).toList())")
    @Mapping(target = "favorisIds", expression = "java(offre.getFavoris().stream().map(com.stagefinder.entities.Favoris::getId).toList())")
    OffreDTO toDto(Offre offre);

    @Mapping(target = "categorie", ignore = true)
    @Mapping(target = "publiePar", ignore = true)
    @Mapping(target = "candidatures", ignore = true)
    @Mapping(target = "notes", ignore = true)
    @Mapping(target = "favoris", ignore = true)
    Offre toEntity(OffreDTO dto);
}