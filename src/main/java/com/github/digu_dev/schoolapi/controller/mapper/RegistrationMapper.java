package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.RegistrationDTO;
import com.github.digu_dev.schoolapi.model.Registration;
import com.github.digu_dev.schoolapi.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {

    @Mapping(source = "student.id", target = "studentId")
    public RegistrationDTO toDTO(Registration registration);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "student", source = "student")
    public Registration toEntity(RegistrationDTO dto, Student student);
}
