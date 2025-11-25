package com.github.digu_dev.schoolapi.controller;

import com.github.digu_dev.schoolapi.controller.dto.GradesDTO;
import com.github.digu_dev.schoolapi.controller.exceptions.ErrorDetails;
import com.github.digu_dev.schoolapi.controller.exceptions.ResourceNotFoundException;
import com.github.digu_dev.schoolapi.model.Grades;
import com.github.digu_dev.schoolapi.service.GradesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("grades")
@RequiredArgsConstructor
public class GradesController {

    private final GradesService gradesService;

    @PostMapping
    public ResponseEntity<Object> createNewGrade(@Valid @RequestBody GradesDTO dto) {
        try{
           Grades newGrade = gradesService.createNewGrade(dto);

           URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(newGrade.getId()).toUri();

           return ResponseEntity.created(location).build();
        } catch (ResourceNotFoundException e){
            // terminar aqui

        }
    }
}
