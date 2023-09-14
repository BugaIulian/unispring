package com.unispring.demo.models.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import java.io.Serializable;

@Data
public class StudentDTO implements Serializable {

    @NotBlank
    private String firstName;

    @NotBlank
    private String secondName;

    @NotBlank
    private String studentEmail;
}