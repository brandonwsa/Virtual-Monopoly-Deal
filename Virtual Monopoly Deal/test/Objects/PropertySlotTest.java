/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author becca
 */
public class PropertySlotTest {
    
    public PropertySlotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addPropertyCard method, of class PropertySlot.
     */
    @Test
    public void testAddPropertyCard() {
        System.out.println("addPropertyCard");
        Card c = null;
        PropertySlot instance = null;
        instance.addPropertyCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHouseCard method, of class PropertySlot.
     */
    @Test
    public void testAddHouseCard() {
        System.out.println("addHouseCard");
        Card c = null;
        PropertySlot instance = null;
        instance.addHouseCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHotelCard method, of class PropertySlot.
     */
    @Test
    public void testAddHotelCard() {
        System.out.println("addHotelCard");
        Card c = null;
        PropertySlot instance = null;
        instance.addHotelCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentAmount method, of class PropertySlot.
     */
    @Test
    public void testGetRentAmount() {
        System.out.println("getRentAmount");
        PropertySlot instance = null;
        int expResult = 0;
        int result = instance.getRentAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPropertySlotNumber method, of class PropertySlot.
     */
    @Test
    public void testGetPropertySlotNumber() {
        System.out.println("getPropertySlotNumber");
        PropertySlot instance = null;
        int expResult = 0;
        int result = instance.getPropertySlotNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPropertyColor method, of class PropertySlot.
     */
    @Test
    public void testGetPropertyColor() {
        System.out.println("getPropertyColor");
        PropertySlot instance = null;
        String expResult = "";
        String result = instance.getPropertyColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsCompleted method, of class PropertySlot.
     */
    @Test
    public void testGetIsCompleted() {
        System.out.println("getIsCompleted");
        PropertySlot instance = null;
        boolean expResult = false;
        boolean result = instance.getIsCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalProperties method, of class PropertySlot.
     */
    @Test
    public void testGetTotalProperties() {
        System.out.println("getTotalProperties");
        PropertySlot instance = null;
        int expResult = 0;
        int result = instance.getTotalProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPropertyColor method, of class PropertySlot.
     */
    @Test
    public void testSetPropertyColor() {
        System.out.println("setPropertyColor");
        String color = "";
        PropertySlot instance = null;
        instance.setPropertyColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentAmount method, of class PropertySlot.
     */
    @Test
    public void testSetRentAmount() {
        System.out.println("setRentAmount");
        PropertySlot instance = null;
        instance.setRentAmount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddPropertyCard method, of class PropertySlot.
     */
    @Test
    public void testCanAddPropertyCard() {
        System.out.println("canAddPropertyCard");
        PropertySlot instance = null;
        boolean expResult = false;
        boolean result = instance.canAddPropertyCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddHouse method, of class PropertySlot.
     */
    @Test
    public void testCanAddHouse() {
        System.out.println("canAddHouse");
        PropertySlot instance = null;
        boolean expResult = false;
        boolean result = instance.canAddHouse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddHotel method, of class PropertySlot.
     */
    @Test
    public void testCanAddHotel() {
        System.out.println("canAddHotel");
        PropertySlot instance = null;
        boolean expResult = false;
        boolean result = instance.canAddHotel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printProperties method, of class PropertySlot.
     */
    @Test
    public void testPrintProperties() {
        System.out.println("printProperties");
        PropertySlot instance = null;
        instance.printProperties();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class PropertySlot.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PropertySlot instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPropertiesInSlot method, of class PropertySlot.
     */
    @Test
    public void testGetPropertiesInSlot() {
        System.out.println("getPropertiesInSlot");
        PropertySlot instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getPropertiesInSlot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
