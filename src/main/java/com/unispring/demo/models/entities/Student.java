package com.unispring.demo.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Student class represents a student entity in the system.
 * It is annotated with JPA annotations to map it to a database table.
 */
@Data
@Entity
@Table(name = "students")
public class Student {

    /**
     * Unique identifier for a the student.
     */
    @Id
    @Column
    private long id;

    /**
     * First name of the student.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Second name of the student.
     */
    @Column(name = "second_name")
    private String secondName;

    /**
     * Email address of the student.
     */
    @Column(name = "email")
    private String studentEmail;
}
