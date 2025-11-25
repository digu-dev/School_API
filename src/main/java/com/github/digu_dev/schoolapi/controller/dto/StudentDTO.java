package com.github.digu_dev.schoolapi.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.UUID;

public record StudentDTO(@NotNull(message = "Required Field")
                         UUID id,
                         @NotBlank(message = "Required Field")
                         String name,
                         @NotNull(message = "Required Field")
                         Integer age,
                         @NotBlank(message = "Required Field")
                         @Past(message = "Can't be a future date")
                         LocalDate birthDate) {
}
