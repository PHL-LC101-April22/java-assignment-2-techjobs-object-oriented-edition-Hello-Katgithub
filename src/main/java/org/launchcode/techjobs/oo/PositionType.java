package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class PositionType extends JobField {
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'. Represents any object as a string.

//    public String toString()  {
//        return value;
//    }
  //  *** IS THIS PART NEEDED?****
   // public String toString() {
      //  return PositionType;
    //}

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

//
//    // Getters and Setters: This part is complete
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
