package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String nameStamp;
    private char size;
    boolean stamped;

    public Stamps(String nameStamp, char size, boolean stamped) {
        this.nameStamp = nameStamp;
        this.size = size;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return stamped == stamps.stamped && Objects.equals(nameStamp, stamps.nameStamp) && Objects.equals(size, stamps.size);
    }

    public String getNameStamp() {
        return nameStamp;
    }

    public char getSize() {
        return size;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStamp, size, stamped);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "nameStamp='" + nameStamp + '\'' +
                ", size='" + size + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}
