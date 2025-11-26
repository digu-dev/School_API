package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.SubjectDTO;
import com.github.digu_dev.schoolapi.model.Subject;
import jakarta.persistence.Transient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubjectMapper {

    @Mapping(source = "id", target = "id")
    public SubjectDTO toDTO (Subject subject);

    @Mapping(source = "id", target = "id")
    public Subject toEntity (SubjectDTO subjectDTO);


}
