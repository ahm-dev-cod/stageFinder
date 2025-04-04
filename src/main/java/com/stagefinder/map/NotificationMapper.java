package com.stagefinder.map;

import com.stagefinder.dto.NotificationDTO;
import com.stagefinder.entities.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    @Mapping(target = "userId", source = "user.id")
    NotificationDTO toDto(Notification notification);

    @Mapping(target = "user", ignore = true)
    Notification toEntity(NotificationDTO dto);
}
