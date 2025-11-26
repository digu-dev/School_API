package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.ClassRoomDTO;
import com.github.digu_dev.schoolapi.model.ClassRoom;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClassRoomMapper {

    @Mapping(source = "classRoom.id", target = "id")
    public ClassRoomDTO toDTO(ClassRoom classRoom);

    @Mapping(source = "classRoom.id", target = "id")
    public ClassRoom toEntity(ClassRoomDTO classRoomDTO);
}
