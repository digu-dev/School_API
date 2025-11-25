package com.github.digu_dev.schoolapi.controller.dto;

import com.github.digu_dev.schoolapi.model.Period;
import jakarta.validation.constraints.NotBlank;

public record ClassRoomDTO(Long id,
                           @NotBlank(message = "required field")
                           Period period) {
}
