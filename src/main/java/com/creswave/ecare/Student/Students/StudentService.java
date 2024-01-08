package com.creswave.ecare.Student.Students;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    private  final  StudentRepository studentRepository;

@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
    Optional<Student> studentByEmail = studentRepository.
            findStudentByEmail(student.getEmail());

        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
      studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
    boolean exists = studentRepository.findAllById(studentId);
       if(!exists){
           throw  new IllegalStateException(
                   "student with id" + studentId + " does not exists"
           );
       }
       studentRepository.existsById(studentId);
    }
 @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
    boolean student = studentRepository.findAllById(studentId);
    }
}
