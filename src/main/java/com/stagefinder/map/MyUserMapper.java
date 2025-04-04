package com.stagefinder.map;

import com.stagefinder.dto.MyUserDTO;
import com.stagefinder.entities.MyUser;
import com.stagefinder.entities.enums.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MyUserMapper {

    // Les champs nom, email, tel, cvFile, estValide, et adresse sont mappés automatiquement
    // car ils ont les mêmes noms et types dans MyUser et MyUserDTO
    @Mapping(target = "candidatureIds", expression = "java(user.getCandidatures().stream().map(com.stagefinder.entities.Candidature::getId).toList())")
    @Mapping(target = "notificationIds", expression = "java(user.getNotifications().stream().map(com.stagefinder.entities.Notification::getId).toList())")
    @Mapping(target = "favorisIds", expression = "java(user.getFavoris().stream().map(com.stagefinder.entities.Favoris::getId).toList())")
    @Mapping(target = "abonnementIds", expression = "java(user.getAbonnements().stream().map(com.stagefinder.entities.Abonnement::getId).toList())")
    @Mapping(target = "notesOffreIds", expression = "java(user.getNotesOffres().stream().map(com.stagefinder.entities.NotesOffre::getId).toList())")
    @Mapping(target = "offresPublieesIds", expression = "java(user.getOffresPubliees().stream().map(com.stagefinder.entities.Offre::getId).toList())")
    @Mapping(target = "role", expression = "java(user.getRole().name())")
    MyUserDTO toDto(MyUser user);

    // Les champs nom, email, tel, cvFile, estValide, et adresse sont mappés automatiquement
    @Mapping(target = "role", expression = "java(Role.valueOf(dto.getRole()))")
    @Mapping(target = "candidatures", ignore = true)
    @Mapping(target = "notifications", ignore = true)
    @Mapping(target = "favoris", ignore = true)
    @Mapping(target = "abonnements", ignore = true)
    @Mapping(target = "notesOffres", ignore = true)
    @Mapping(target = "offresPubliees", ignore = true)
    MyUser toEntity(MyUserDTO dto);
}