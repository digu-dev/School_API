package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.ClassRoomDTO;
import com.github.digu_dev.schoolapi.model.ClassRoom;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClassRoomMapper {

    @Mapping(source = "period", target = "period")
    ClassRoom toDTO(ClassRoomDTO classRoomDTO);

    @Mapping(source = "period", target = "period")
    ClassRoomDTO toEntity(ClassRoom classRoom);
}
