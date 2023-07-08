package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Principal john = new Principal("John");
        Principal steve = new Principal("Steve");
        Principal mark = new Principal("Mark");


        School primarySchool = new School("Primary School", new ArrayList<>(Arrays.asList(30, 28, 40, 25, 35)));
        School highSchool = new School("High School", new ArrayList<>(Arrays.asList(20, 24, 22, 28)));
        School college = new School("College", new ArrayList<>(Arrays.asList(15, 18, 20, 14)));


        Map<Principal, School> students = new HashMap<>();
        students.put(john, primarySchool);
        students.put(steve, highSchool);
        students.put(mark, college);

        for (Map.Entry<Principal, School> dir : students.entrySet()) {
            System.out.println("Mr. " + dir.getKey().getName() + " has " + dir.getValue().numberOfStudents.size() + " classes in his " +
                    dir.getValue().getName() + " with " + dir.getValue().getAllStudents() + " students.");
        }


    }
}
