package com.github.digu_dev.schoolapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@ToString
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Enumerated
    private Period period;

    @OneToMany(mappedBy = "classRoom")
    private List<Registration> registrations;

    @OneToMany(mappedBy = "classRoom")
    private List<Class> classes;

}
