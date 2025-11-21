package com.github.digu_dev.schoolapi.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Integer age;

    private LocalDate birthDate;

    private String birthName;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @Enumerated(EnumType.STRING)
    private Period period;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private ClassRoom classRoom;


    @OneToMany(mappedBy = "student")
    private List<Registration> registrations;

    }
