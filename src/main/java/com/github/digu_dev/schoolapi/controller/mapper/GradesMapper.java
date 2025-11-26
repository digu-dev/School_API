package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.GradesDTO;
import com.github.digu_dev.schoolapi.model.Grades;
import com.github.digu_dev.schoolapi.model.Registration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GradesMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "registration", source = "registration")
    Grades toEntity(GradesDTO dto, Registration registration);

    @Mapping(source = "registration.id", target = "registrationId")
    public Grades toDTO(GradesDTO gradesDTO);
}

