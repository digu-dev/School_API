package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.GradesDTO;
import com.github.digu_dev.schoolapi.model.Grades;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GradesMapper {

    @Mapping(source = "bimester", target = "bimester")
    @Mapping(source = "grade", target = "grade")
    Grades toEntity(GradesDTO gradesDTO);

    @Mapping(source = "bimester", target = "bimester")
    @Mapping(source = "grade", target = "grade")
    GradesDTO toDTO(Grades grades);
}

