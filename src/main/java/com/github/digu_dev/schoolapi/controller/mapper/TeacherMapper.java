package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.TeacherDTO;
import com.github.digu_dev.schoolapi.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "educationLevel", target = "educationLevel")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "classesPerWeek", target = "classesPerWeek")
    Teacher toDTO (TeacherDTO teacherDTO);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "educationLevel", target = "educationLevel")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "classesPerWeek", target = "classesPerWeek")
    TeacherDTO toEntity(Teacher teacher);
}
