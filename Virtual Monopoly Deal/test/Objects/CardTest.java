/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brand
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Card.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Card instance = new Card(0);
        String expResult = "$10M-money-card (Custom)";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getImagePath method, of class Card.
     */
    @Test
    public void testGetImagePath() {
        System.out.println("getImagePath");
        Card instance = new Card(0);
        String expResult = "/images/MonopolyCards/$10M-money-card (Custom).png";
        String result = instance.getImagePath();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Card.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Card instance = new Card(0);
        String expResult = "money";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card(0);
        int expResult = 10;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPropertyColor method, of class Card.
     */
    @Test
    public void testGetPropertyColor() {
        //money card
        System.out.println("getPropertyColor");
        Card instance = new Card(0);
        String expResult = "";
        String result = instance.getPropertyColor();
        assertEquals(expResult, result);
        
        //property card
        instance = new Card(24);
        expResult = "blue-and-green";
        result = instance.getPropertyColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCardNameArraySize method, of class Card.
     */
    @Test
    public void testGetCardNameArraySize() {
        System.out.println("getCardNameArraySize");
        Card instance = new Card(0);
        int expResult = 108;
        int result = instance.getCardNameArraySize();
        assertEquals(expResult, result);
    }
    
}
