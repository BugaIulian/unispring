package com.unispring.demo.services.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unispring.demo.exceptions.student.StudentNotFoundException;
import com.unispring.demo.models.dto.StudentDTO;
import com.unispring.demo.models.entities.Student;
import com.unispring.demo.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ObjectMapper objectMapper;

    /**
     * Constructs a new StudentImpl service with the given
     * StudentRepository and ObjectMapper.
     * This constructor is intended for dependency injection.
     *
     * @param studentRepository the repository for accessing student data.
     * @param objectMapper      a utility class for converting between different object representations.
     */
    public StudentServiceImpl(StudentRepository studentRepository, ObjectMapper objectMapper) {
        this.studentRepository = studentRepository;
        this.objectMapper = objectMapper;
    }

    /**
     * {{@inheritDoc}}
     */
    @Override
    @Transactional
    public StudentDTO updateStudentProfile(final long id, final StudentDTO studentDTO) {
        Student studentEntity = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found."));
        updateStudentDetails(studentEntity, studentDTO);
        studentRepository.save(studentEntity);
        return objectMapper.convertValue(studentEntity, StudentDTO.class);
    }

    /**
     * Retrieves a list of all students' information from the repository and converts it into a list of StudentDTO objects.
     *
     * @return a list of all students' information in the form of StudentDTO objects
     */
    @Override
    public List<StudentDTO> getStudents() {
        List<Student> studentEntities = studentRepository.findAll();
        List<StudentDTO> allStudents = new ArrayList<>();
        studentEntities.forEach(student -> allStudents.add(objectMapper.convertValue(student, StudentDTO.class)));
        return allStudents;
    }

    /**
     * Updates the details of an existing student entity
     * based on the provided data transfer object.
     * <p>
     * The method mutates the properties of the provided Student entity to match.
     * The values in the provided StudentDTO. The entity is not saved in this method.
     * Saving the updated entity to the database is the caller's responsibility.
     * </p>
     *
     * @param studentEntity The Student entity to be updated.
     * @param studentDTO    The StudentDTO containing the updated details.
     */
    private void updateStudentDetails(final Student studentEntity, final StudentDTO studentDTO) {
        studentEntity.setFirstName(studentDTO.getFirstName());
        studentEntity.setSecondName(studentDTO.getSecondName());
        studentEntity.setStudentEmail(studentDTO.getStudentEmail());
    }
}
