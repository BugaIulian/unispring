package com.unispring.demo.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    private String firstName;

    /**
     * The second name of the student DTO.
     * <p>
     * This is a mandatory field and must not be blank.
     * </p>
     */
    @NotBlank
    private String secondName;

    /**
     * The email address of the studentDTO.
     * <p>
     * This field is validated to ensure that it conforms
     * to standard email format.
     * </P>
     */
    @Email
    private String studentEmail;
}
