package com.unispring.demo.exceptions.student;

/**
 * Custom exception to be thrown when a Student entity is not found.
 * <p>
 * This exception is used to indicate that a Student object could not be found
 * based on a search criteria, like an ID, first name, second name, email or
 * username.
 * </p>
 */

public class StudentNotFoundException extends RuntimeException {
    /**
     * Constructs a new StudentNotFoundException with the specified error message.
     *
     * @param errorMessage the message explaining the reason for the exception.
     */
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
