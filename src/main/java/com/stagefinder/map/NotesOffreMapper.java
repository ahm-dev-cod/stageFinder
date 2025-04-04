package com.stagefinder.map;

import com.stagefinder.dto.NotesOffreDTO;
import com.stagefinder.entities.NotesOffre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NotesOffreMapper {

    @Mapping(target = "offreId", source = "offre.id")
    @Mapping(target = "userId", source = "user.id")
    NotesOffreDTO toDto(NotesOffre notesOffre);

    @Mapping(target = "offre", ignore = true)
    @Mapping(target = "user", ignore = true)
    NotesOffre toEntity(NotesOffreDTO dto);
}