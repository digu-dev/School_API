package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.RegistrationDTO;
import com.github.digu_dev.schoolapi.model.Registration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {

    @Mapping(source = "studentId", target = "studentId")
    Registration toDTO(RegistrationDTO registrationDTO);

    @Mapping(source = "studentId", target = "studentId")
    RegistrationDTO toEntity(Registration registration);
}
