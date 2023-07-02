package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stampsCollection = new HashSet<>();
        stampsCollection.add(new Stamps("Znaczek 1", 'L', true));
        stampsCollection.add(new Stamps("Znaczek 2", 'M', false));
        stampsCollection.add(new Stamps("Znaczek 3", 'S', true));
        stampsCollection.add(new Stamps("Znaczek 2", 'M', false));
        stampsCollection.add(new Stamps("Znaczek 4", 'S', true));

        System.out.println("Size collection: " + stampsCollection.size());
        for(Stamps stamps : stampsCollection)
            System.out.println(stamps);
    }
}
