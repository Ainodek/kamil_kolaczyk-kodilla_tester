package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    Student studentWithTeacher = new Student("John", new Teacher("Mark"));
    Student studentWithNoTeacher = new Student("John", null);
    @Test
    public void studentWithTeacher(){
        //when
        String studentName = studentWithTeacher.getName();
        String techaerName = studentWithTeacher.getTeacher().getName();
        //then
        assertEquals("John", studentName);
        assertEquals("Mark", techaerName);
    }
    @Test
    public void studentWithoutTeacher(){
        //given
        Application.students.add(studentWithNoTeacher);
        //when
        String teacherName = Application.teachername(0);
        //then
        assertEquals("<undefined>", teacherName);


    }

}