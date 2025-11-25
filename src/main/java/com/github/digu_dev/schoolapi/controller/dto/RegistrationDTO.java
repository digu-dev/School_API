package com.github.digu_dev.schoolapi.controller.dto;

import jakarta.validation.constraints.NotNull;

public record RegistrationDTO(
        @NotNull(message = "required field")
        Long studentId) {
}
