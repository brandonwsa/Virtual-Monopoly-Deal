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
        Card c = new Card(70);
        PropertySlot instance = new PropertySlot(2);
        instance.addPropertyCard(c);
    }

    /**
     * Test of addHouseCard method, of class PropertySlot.
     */
    @Test
    public void testAddHouseCard() {
        System.out.println("addHouseCard");
        Card c = new Card(80);
        PropertySlot instance = new PropertySlot(2);
        instance.addHouseCard(c);
    }

    /**
     * Test of addHotelCard method, of class PropertySlot.
     */
    @Test
    public void testAddHotelCard() {
        System.out.println("addHotelCard");
        Card c = new Card(50);
        PropertySlot instance = new PropertySlot(2);
        instance.addHotelCard(c);
    }

    /**
     * Test of getRentAmount method, of class PropertySlot.
     */
    @Test
    public void testGetRentAmount() {
        System.out.println("getRentAmount");
        PropertySlot instance = new PropertySlot(1);
        Card c = new Card(0);
        instance.addPropertyCard(c);
        instance.setPropertyColor("green");
        instance.setRentAmount();
        int expResult = 2;
        int result = instance.getRentAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPropertySlotNumber method, of class PropertySlot.
     */
    @Test
    public void testGetPropertySlotNumber() {
        System.out.println("getPropertySlotNumber");
        PropertySlot instance = new PropertySlot(2);
        int expResult = 2;
        int result = instance.getPropertySlotNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPropertyColor method, of class PropertySlot.
     */
    @Test
    public void testGetPropertyColor() {
        System.out.println("getPropertyColor");
        PropertySlot instance = new PropertySlot(2);
        instance.setPropertyColor("green");
        String expResult = "green";
        String result = instance.getPropertyColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsCompleted method, of class PropertySlot.
     */
    @Test
    public void testGetIsCompleted() {
        System.out.println("getIsCompleted");
        PropertySlot instance = new PropertySlot(2);
        boolean expResult = false;
        boolean result = instance.getIsCompleted();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalProperties method, of class PropertySlot.
     */
    @Test
    public void testGetTotalProperties() {
        Card c = new Card(70);
        System.out.println("getTotalProperties");
        PropertySlot instance = new PropertySlot(2);
        instance.addPropertyCard(c);
        instance.getPropertiesInSlot();
        int expResult = 1;
        int result = instance.getTotalProperties();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPropertyColor method, of class PropertySlot.
     */
    @Test
    public void testSetPropertyColor() {
        System.out.println("setPropertyColor");
        String color = "green";
        PropertySlot instance = new PropertySlot(2);
        instance.setPropertyColor(color);
        assertNotEquals(instance.getPropertyColor(),null);
    }

    /**
     * Test of setRentAmount method, of class PropertySlot.
     */
    @Test
    public void testSetRentAmount() {
        System.out.println("setRentAmount");
        PropertySlot instance = new PropertySlot(2);
        Card c = new Card(0);
        instance.addPropertyCard(c);
        instance.setPropertyColor("green");
        instance.setRentAmount();
        assertEquals(2,instance.getRentAmount());
    }

    /**
     * Test of canAddPropertyCard method, of class PropertySlot.
     */
    @Test
    public void testCanAddPropertyCard() {
        System.out.println("canAddPropertyCard");
        PropertySlot instance = new PropertySlot(5);
        boolean expResult = true;
        boolean result = instance.canAddPropertyCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of canAddHouse method, of class PropertySlot.
     */
    @Test
    public void testCanAddHouse() {
        Card c = new Card(107);
        Card d = new Card(106);
        Card e = new Card(105);
        System.out.println("canAddHouse");
        PropertySlot instance = new PropertySlot(6);
        instance.setPropertyColor("yellow");
        instance.addPropertyCard(c);
        instance.addPropertyCard(d);
        instance.addPropertyCard(e);
        boolean expResult = true;
        boolean result = instance.canAddHouse();
        assertEquals(expResult, result);
    }

    /**
     * Test of canAddHotel method, of class PropertySlot.
     */
    @Test
    public void testCanAddHotel() {
        System.out.println("canAddHotel");
         Card c = new Card(107);
        Card d = new Card(106);
        Card e = new Card(105);
        Card g = new Card(0);
       PropertySlot instance = new PropertySlot(6);
        instance.setPropertyColor("yellow");
        instance.addPropertyCard(c);
        instance.addPropertyCard(d);
        instance.addPropertyCard(e);
        instance.addHouseCard(g);
        boolean expResult = true;
        boolean result = instance.canAddHotel();
        assertEquals(expResult, result);
    }

    /**
     * Test of printProperties method, of class PropertySlot.
     */
    @Test
    public void testPrintProperties() {
        System.out.println("printProperties");
        Card c = new Card(0);
        PropertySlot instance = new PropertySlot(2);
        instance.addPropertyCard(c);
        instance.printProperties();
    }

    /**
     * Test of isEmpty method, of class PropertySlot.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Card c = new Card(105);
        PropertySlot instance = new PropertySlot(1);
        instance.addPropertyCard(c);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPropertiesInSlot method, of class PropertySlot.
     */
    @Test
    public void testGetPropertiesInSlot() {
        Card c = new Card(105);
        System.out.println("getPropertiesInSlot");
        PropertySlot instance = new PropertySlot(2);
        instance.addPropertyCard(c);
        ArrayList<Card> expResult = new ArrayList<>();
        expResult.add(c);
        ArrayList<Card> result = instance.getPropertiesInSlot();
        assertEquals(expResult, result);
    }
    
}
