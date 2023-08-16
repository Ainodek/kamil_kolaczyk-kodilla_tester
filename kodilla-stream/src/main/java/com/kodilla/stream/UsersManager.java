package com.kodilla.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println(olderThan(30));
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static String getUserName(User user){
        return user.getUsername();
    }
    public static int getUserAge(User user){
        return user.getAge();
    }

    public static List<String> olderThan(int age){
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()>age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
                return usernames;
    }
    public static List<String> olderChemists(int age){
        List<String> chemists = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()>age)
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return chemists;
    }
}
