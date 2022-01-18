package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void farmersInitializedProperly() {
        Farmer testFarmer = setUpFarmer();
        assertTrue(testFarmer instanceof Farmer);
    }

    @Test
    void gettersWorkAccordingly() {
        Farmer testFarmer = setUpFarmer();
        assertEquals("Timothy", testFarmer.getName());
    }

    @Test
    void equalsMethodWorksAccordingly() {
        Farmer testFarmer = setUpFarmer();
        Farmer testFarmer2 = setUpFarmer();
        assertTrue(testFarmer.equals(testFarmer2));
    }

    public Farmer setUpFarmer() {
        Farmer testFarmer = new Farmer("Timothy", "Nairobi", "0764321244", "Beans", "timothy@gmail.com", 300);
        return testFarmer;
    }

}