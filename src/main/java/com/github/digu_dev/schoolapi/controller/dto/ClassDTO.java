package com.github.digu_dev.schoolapi.controller.dto;

import jakarta.validation.constraints.NotNull;

public record ClassDTO(
        @NotNull(message = "required field")
        Long id) {
}
