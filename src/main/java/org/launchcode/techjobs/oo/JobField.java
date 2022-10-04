package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    //What fields do ALL FOUR of the classes have in common? id, nextid, value
    //What getters and setters do ALL of the classes share?
    //Which custom methods are identical in ALL of the classes?

// make the class abstract

    //Class Variables
    //Constructors
    //Getters and Setters

    public int id;
    private static int nextId =1;
    private String value;

    //Which constructors are the same in ALL FOUR classes? Unique ID & looping it
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == "") {
            value = "Data not available";
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    // no setter because we do not want the people to change the unique id!
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    //Do we generate an equals and hasshcode??? ********

}
