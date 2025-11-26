package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.TeacherDTO;
import com.github.digu_dev.schoolapi.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    @Mapping(source = "id", target = "id")
    public TeacherDTO toDTO (Teacher teacher);

    @Mapping(source = "id", target = "id")
    public Teacher toEntity(TeacherDTO teacherDTO);
}
