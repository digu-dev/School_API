package com.github.digu_dev.schoolapi.service;

import com.github.digu_dev.schoolapi.controller.dto.GradesDTO;
import com.github.digu_dev.schoolapi.controller.exceptions.ResourceNotFoundException;
import com.github.digu_dev.schoolapi.controller.mapper.GradesMapper;
import com.github.digu_dev.schoolapi.model.Grades;
import com.github.digu_dev.schoolapi.model.Registration;
import com.github.digu_dev.schoolapi.repository.GradesRepository;
import com.github.digu_dev.schoolapi.repository.RegistrationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

@Service
@RequiredArgsConstructor
public class GradesService {

    private final GradesRepository gradesRepository;

    private final RegistrationRepository registrationRepository;

    private final GradesMapper gradesMapper;

    public Grades findById(Long id){
        if (id != null) {
            return gradesRepository.findById(id).orElse(null);
        }

        throw  new ResourceNotFoundException("Grade not found");
    }


    public Page<Grades> findAll(Pageable pageable){
        return gradesRepository.findAll(pageable);
    }

    public Page<Grades> findByRegistrationId(Registration registration, Pageable pageable){
        return gradesRepository.findByRegistrationId(registration.getStudentId(), pageable);
    }

    @Transactional
    public Grades createNewGrade(GradesDTO dto) {

       Registration registration = registrationRepository.findById(dto.id())
                .orElseThrow(() -> new ResourceNotFoundException("Registration Id not found: " + dto.id()));
        Grades newGrade = gradesMapper.toEntity(dto);
        return gradesRepository.save(newGrade);
    }

    @Transactional
    public Grades updateById(Long id, GradesDTO dto) {
        Grades existingGrade = findById(id);

        if (existingGrade != null) {
            existingGrade.setGrade(dto.grade());
        }
        if (dto.bimester() != null) {
            existingGrade.setBimester(dto.bimester());
        }

        return gradesRepository.save(existingGrade);
    }

    public void deleteById(Long id, GradesDTO dto) {

        if (!gradesRepository.existsById(id)) {
            throw new ResourceNotFoundException("Grade not found: " + id);
        }
        gradesRepository.deleteById(id);
    }




}
