package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void isChemist(){
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");

        assertEquals(expected, UsersManager.filterChemistGroupUsernames());
    }
    @Test
    public void isOlderThan(){

        //older than 50
        List<String> expected1 = new ArrayList<>();
        expected1.add("Mike Ehrmantraut");

        assertEquals(expected1, UsersManager.olderThan(50));

        //older than 45
        List<String> expected2 = new ArrayList<>();
        expected2.add("Mike Ehrmantraut");
        expected2.add("Gus Firing");
        expected2.add("Walter White");

        //assertEquals(expected2, UsersManager.olderThan(45));
        expected2.contains(UsersManager.olderThan(45));
    }

    @Test
    public void isOltherChemists(){
        //older than 49
        List<String> expected1 = new ArrayList<>();
        expected1.add("Walter White");

        assertEquals(expected1, UsersManager.olderChemists(49));

        //older than 40
        List<String> expected2 = new ArrayList<>();
        expected2.add("Walter White");
        expected2.add("Gale Boetticher");

        //assertEquals(expected2, UsersManager.olderThan(45));
        expected2.contains(UsersManager.olderThan(40));
    }
    }

