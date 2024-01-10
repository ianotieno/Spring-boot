package com.creswave.ecare.Student.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController

public class StudentController {


    private  final StudentService studentService;
 @Autowired
    public StudentController(StudentService studentService) {

     this.studentService = studentService;
    }
    @GetMapping(path = "/get/students")
    public List<Student> getStudents(){
 return studentService.getStudents();
    }
    @PostMapping(path = "/add/students")
    public  void  registerNewStudent(@RequestBody Student student){

     studentService.addNewStudent(student);
    }
   @DeleteMapping(path = "{studentId}")
    public void deleteStudent(
            @PathVariable("studentId") Long studentId){
     studentService.deleteStudent(studentId);
   }
   @PutMapping(path = "{studentId}")
    public  void  updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String email){
     studentService. updateStudent(studentId,name,email);
   }
}