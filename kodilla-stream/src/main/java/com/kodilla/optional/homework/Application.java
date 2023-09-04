package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    static Teacher teacher = new Teacher("<undefined>");
    static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        //students.add(new Student("Mark", new Teacher("John")));
        //students.add(new Student("Adam", new Teacher("Tom")));
        //students.add(new Student("Martin", null));
        students.add(new Student("Chris", null));
        Application.displayList();
    }

    public static String teachername(int index){
        String name = Optional.ofNullable(students.get(index).getTeacher()).orElse(teacher).getName();
        return name;
    }
    public static void displayList(){
        for (Student student : students) {
            String name = Optional.ofNullable(student.getTeacher()).orElse(teacher).getName();
            System.out.println("Uczen: " + student.getName() + ", nauczyciel: " + name);
        }
    }
}
