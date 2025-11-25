package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.SubjectDTO;
import com.github.digu_dev.schoolapi.model.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubjectMapper {

    @Mapping(source = "name", target = "name")
    Subject toDTO (SubjectDTO subjectDTO);

    @Mapping(source = "name", target = "name")
    SubjectDTO toEntity (Subject subject);


}
