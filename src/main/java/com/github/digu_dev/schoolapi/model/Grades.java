package com.github.digu_dev.schoolapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@M
public class Grades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer bimester;

    private Double grade;

    @ManyToOne
    @JoinColumn(name = "registration_id", nullable = false)
    private Registration registration;
}
