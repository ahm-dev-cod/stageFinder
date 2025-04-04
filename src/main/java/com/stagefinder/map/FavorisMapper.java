package com.stagefinder.map;

import com.stagefinder.dto.FavorisDTO;
import com.stagefinder.entities.Favoris;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FavorisMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "offreId", source = "offre.id")
    FavorisDTO toDto(Favoris favoris);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "offre", ignore = true)
    Favoris toEntity(FavorisDTO dto);
}
