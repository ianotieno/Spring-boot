package com.creswave.ecare.Student.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    private   StudentRepository underTest;

    @Test
    void selectExistsEmail() {
        //given
        String email = "";
        Student student = new Student(



        );

        underTest.save(student);
        //when

        boolean exists=  underTest.selectExistsEmail(email);
        //then

        assertThat(exists).isTrue();
    }
}