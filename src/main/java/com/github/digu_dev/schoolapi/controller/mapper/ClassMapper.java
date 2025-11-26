package com.github.digu_dev.schoolapi.controller.mapper;

import com.github.digu_dev.schoolapi.controller.dto.ClassDTO;
import com.github.digu_dev.schoolapi.model.Class;
import jakarta.persistence.Entity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClassMapper {

    @Mapping(source = "id", target = "id")
   public Class toDTO(ClassDTO classDTO);

    @Mapping(source = "id", target = "id")
    public ClassDTO toEntity (Class classes);
}
