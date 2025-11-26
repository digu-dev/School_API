package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.StudentDTO;
import com.github.digu_dev.schoolapi.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {


    @Mapping(source = "id", target = "id")
    public StudentDTO toDTO(Student student);


    @Mapping(source = "id", target = "id")
    public Student toEntity(StudentDTO studentDTO);

}
