package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.print.attribute.standard.JobName;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    //testSettingJobId -- assertEquals is used when you test equality of two objects (expected, actual)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    // #2 Create two Job objects using the empty constructor.

    @Test
    public void testSettingJobId() {
        Job jobOne = new Job("Analyst", new Employer("Target"), new Location("Florida"), new PositionType("Financials"), new CoreCompetency("Analytical"));
        Job jobTwo = new Job("Researcher", new Employer("Phi Hospital"), new Location("Pennsylvania"),
                new PositionType("Science"), new CoreCompetency("Attention to detail"));
        assertNotEquals(jobOne, jobTwo);
    }

    // Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", jobThree.toString());
        assertEquals("ACME", jobThree.getEmployer().toString());
        assertEquals("Desert", jobThree.getLocation().toString());
        assertEquals("Quality control", jobThree.getPositionType().toString());
        assertEquals("Persistence", jobThree.getCoreCompetency().toString());

        assertTrue(jobThree instanceof Job);
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
    }

    // Test the equals Method
    @Test
    public void testJobsForEquality() {
        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertFalse(jobThree.equals(jobFour));
    }
    // Test for toString()

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobFive = new Job("Analyst", new Employer("Target"), new Location("Florida"), new PositionType("Financials"), new CoreCompetency("Analytical"));
        int lengthIndex = jobFive.toString().length();
        assertEquals(jobFive.toString().charAt(0), '\n');
        assertEquals(jobFive.toString().charAt(lengthIndex - 1), '\n');
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobEmpty = new Job("", new Employer("Target"), new Location("Florida"), new PositionType("Financials"), new CoreCompetency("Analytical"));
        assertEquals("\nID: 1\nName: Data Not Available\nEmployer: Target\nLocation: Florida\nPosition Type: Financials\nCore Competency: Analytical\n", jobEmpty.toString());
    }


    // Test for testToStringContainsCorrectLabelsAndData
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobEmpty = new Job("", new Employer("Target"), new Location("Florida"), new PositionType("Financials"), new CoreCompetency("Analytical"));
        assertEquals("\nID: 1\nName: Data Not Available\nEmployer: Target\nLocation: Florida\nPosition Type: Financials\nCore Competency: Analytical\n", jobEmpty.toString());    }
}


