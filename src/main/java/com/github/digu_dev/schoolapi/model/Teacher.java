package com.github.digu_dev.schoolapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Integer age;

    private String educationLevel;

    private LocalDate birthDate;

    private Integer classesperWeek;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Class> classes;

}
