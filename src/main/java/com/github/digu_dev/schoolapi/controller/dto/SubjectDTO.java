package com.github.digu_dev.schoolapi.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SubjectDTO(@NotNull(message = "required field") Long id,
                         @NotBlank(message = "required field") String name) {
}
