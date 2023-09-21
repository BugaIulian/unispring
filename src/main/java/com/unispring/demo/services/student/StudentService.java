package com.unispring.demo.services.student;

import com.unispring.demo.exceptions.student.StudentNotFoundException;
import com.unispring.demo.models.dto.StudentDTO;

import java.util.List;

/**
 * StudentService interface provides a contract for student-related operations.
 */
public interface StudentService {
    /**
     * Service method to update student information.
     *
     * @param id         The unique ID of the student to update.
     * @param studentDTO The data transfer object containing the new student information.
     * @return A StudentDTO object containing the updated information of the student.
     * @throws StudentNotFoundException if no student exists with the provided ID.
     */
    StudentDTO updateStudentProfile(long id, StudentDTO studentDTO);

    /**
     * Service method to get all students.
     * @return A student list DTO object containing all the students' information.
     */
    List<StudentDTO> getStudents();
}
