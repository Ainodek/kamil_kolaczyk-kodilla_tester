package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Objects;

public class School {
    private String name;
    ArrayList<Integer> numberOfStudents = new ArrayList<>();


    public School(String name, ArrayList<Integer> numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    ArrayList<School> classes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getAllStudents() {
        int temp = 0;
        for (int b : numberOfStudents) {
            temp += b;
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return numberOfStudents == school.numberOfStudents && Objects.equals(name, school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfStudents);
    }

    @Override
    public String toString() {
        return "School{" +
                "className='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
