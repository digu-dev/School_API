package com.github.digu_dev.schoolapi.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record GradesDTO(
                        Long id,
                        @NotNull(message = "required field")
                        Integer bimester,
                        @NotBlank(message = "required field")
                        Double grade) {
}
