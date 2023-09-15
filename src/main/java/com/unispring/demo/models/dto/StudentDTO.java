package com.unispring.demo.models.dto;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Student DTO is a Data Transfer Object for transferring student data between
 * different layers of the applications. This class implements serializable
 * interface,enabling it to be easily converted into o byte stream.
 * <p>
 * This class is also configured to validate field values through
 * Jakarta Bean Validation annotations.
 * </p>
 *
 * @author iulianbuga
 * @version 1.0
 * @see Serializable
 * @since 1.0
 */
@Data
public class StudentDTO implements Serializable {

    /**
     * The first name of the student DTO.
     * <p>
     * This is a mandatory field and must not be blank.
     * </p>
     */
    @NotBlank
    @Size(min = 2, max = 20, message = "First name must be between 1 and 20 characters")
    @ApiModelProperty(value = "Student's first name")
    private String firstName;

    /**
     * The second name of the student DTO.
     * <p>
     * This is a mandatory field and must not be blank.
     * </p>
     */
    @NotBlank
    @Size(min = 2, max = 20, message = "Second name must be between 1 and 20 characters")
    @ApiModelProperty(value = "Student's second name")
    private String secondName;

    /**
     * The email address of the studentDTO.
     * <p>
     * This field is validated to ensure that it conforms
     * to standard email format.
     * </P>
     */
    @Email
    @ApiModelProperty(value = "Student's email")
    private String studentEmail;
}
