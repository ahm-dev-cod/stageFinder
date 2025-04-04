package com.stagefinder.map;

import com.stagefinder.dto.CategorieDTO;
import com.stagefinder.entities.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategorieMapper {

    @Mapping(target = "offreIds", expression = "java(categorie.getOffres().stream().map(com.stagefinder.entities.Offre::getId).toList())")
    CategorieDTO toDto(Categorie categorie);

    @Mapping(target = "offres", ignore = true)
    Categorie toEntity(CategorieDTO dto);
}