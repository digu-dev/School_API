package com.github.digu_dev.schoolapi.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.UUID;

public record TeacherDTO(@NotNull(message = "Required field")
                         UUID id,
                         @NotBlank(message = "Required field")
                         String name,
                         @NotBlank(message = "Required field")
                         String educationLevel,
                         @NotBlank(message = "Required field")
                         @Past(message = "Can't be a future date")
                         LocalDate birthDate,
                         @NotNull(message = "Required field")
                         Integer classesPerWeek) {
}
