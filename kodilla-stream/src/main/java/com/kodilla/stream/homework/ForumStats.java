package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {
    static List<User> list = UsersRepository.getUsersList();
    /*static List<User> younger = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge()<=45)
            .collect(Collectors.toList());
    static List<User> older = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge()>45)
            .collect(Collectors.toList());

    public static double getAvaragePostUsers(List<ForumStats> ageGroup){
        double avg = ageGroup
                .stream()
                .mapToInt(u -> u.getNumberOfPost())
                .average().getAsDouble();
    }*/
    public static double getAvaragePostUsersOlderThan40(List<User> list) {
        double avg = list
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average().getAsDouble();
        return avg;
    }

    public static double getAvaragePostUsersYoungerThan40(List<User> list) {
        double avg = list
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average().getAsDouble();
        return avg;
        }


        public static void main (String[]args){
            System.out.println("Average number of posts users younger than 40: " + getAvaragePostUsersYoungerThan40(list));
            System.out.println("Average number of posts users older than 40: " + getAvaragePostUsersOlderThan40(list));
        }
    }