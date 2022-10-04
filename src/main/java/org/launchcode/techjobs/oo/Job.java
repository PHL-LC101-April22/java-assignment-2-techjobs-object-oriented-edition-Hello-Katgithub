package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    //Of these, only name is a string. Sally created classes to represent each of the other properties. These classes—Employer,
    // Location, CoreCompetency, PositionType—have value and id fields.
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor  should also call the first in order to initialize
    //  the 'id' field.

    //Constructor #1 ** Unsure about this one***
    public Job() {
        id = nextId;
        nextId++;
    }

    //Constructor #2
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //#1 Getter & Setter for name
    public String getName() {
        if (name.equals("")) {
            name = "Data Not Available";
        }
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //#2 Getter & Setter for employer
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    //#3 Getter & Setter for Location
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    //#4 Getter and Setter for positionType;
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    // #5 Getter and Setter for coreCompetency
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    public int getId() {
        return id;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Job job = (Job) o;
//        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer)
//                && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
//        this.name = "Product Tester";
        return "\nID: " + getId() +
                "\nName: " + getName() + "\nEmployer: " + this.employer.toString() + "\nLocation: " + this.location.toString()
                + "\nPosition Type: " + this.positionType.toString() + "\nCore Competency: " + this.coreCompetency.toString() + "\n";
    }
//    public static void main (String[] args) {
//        Job jobFive = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
//                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        System.out.println(jobFive);
//    }


//If a field is empty, the method should add, “Data not available” after the label. Make edits to the toString method??????

//    String exampleName;
//    @Override
//    public String toString() {
//        if (name.equals("")) {
//            return "Data not available";
//        }
//        if (employer.equals("")) {
//            return "Data is not available";
//        }
//        if (location.equals("")) {
//            return "Data is not available";
//        }
//        if (positionType.equals("")) {
//            return "Data is not available";
//        }
//        if (coreCompetency.equals("")) {
//            return "Data is not available";
//        }
}
//     this.name = name;
//        this.employer = employer;
//        this.location = location;
//        this.positionType = positionType;
//        this.coreCompetency = coreCompetency;

