package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    //make example list of users
    public static List<User> getExampleList(){
        List<User> users = new ArrayList<>();
        users.add(new User("", 39, 10, ""));
        users.add(new User("", 40, 30, ""));
        users.add(new User("", 30, 2, ""));
        users.add(new User("", 45, 40, ""));
        return users;
    }

    //tests

    @Test
    public void chechAverageUsers40yoOrOlder() {
        //before
        getExampleList();
        //then
        double result = ForumStats.getAvaragePostUsersOlderThan40(getExampleList());
        //result
        assertEquals(35, result);
    }

    @Test
    public void chechAverageUsersYoungerThan40yo() {
        //before
        getExampleList();
        //then
        double result = ForumStats.getAvaragePostUsersYoungerThan40(getExampleList());
        //result
        assertEquals(6, result);
    }
}
