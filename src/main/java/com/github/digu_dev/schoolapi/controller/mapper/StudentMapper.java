package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.StudentDTO;
import com.github.digu_dev.schoolapi.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "birthDate", target = "birthDate")
    Student toDTO(StudentDTO studentDTO);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "birthDate", target = "birthDate")
    StudentDTO toEntity(Student student);

}
