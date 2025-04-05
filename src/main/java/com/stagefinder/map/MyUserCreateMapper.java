package com.stagefinder.map;

import com.stagefinder.dto.MyUserCreateDTO;
import com.stagefinder.entities.MyUser;
// import com.stagefinder.entities.enums.Role; // Supprimer cet import
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MyUserCreateMapper {

    @Mapping(target = "role", expression = "java(user.getRole().name())")
    MyUserCreateDTO toDto(MyUser user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", expression = "java(com.stagefinder.entities.enums.Role.valueOf(dto.getRole()))")
    @Mapping(target = "candidatures", ignore = true)
    @Mapping(target = "notifications", ignore = true)
    @Mapping(target = "favoris", ignore = true)
    @Mapping(target = "abonnements", ignore = true)
    @Mapping(target = "notesOffres", ignore = true)
    @Mapping(target = "offresPubliees", ignore = true)
    MyUser toEntity(MyUserCreateDTO dto);
}