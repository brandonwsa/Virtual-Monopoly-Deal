/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author becca
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of init method, of class Player.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Player instance = new Player();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = new Player();
        List expResult = null;
        List result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastCardPlayed method, of class Player.
     */
    @Test
    public void testGetLastCardPlayed() {
        System.out.println("getLastCardPlayed");
        Player instance = new Player();
        Card expResult = null;
        Card result = instance.getLastCardPlayed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoney method, of class Player.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        Player instance = new Player();
        List expResult = null;
        List result = instance.getMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class Player.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        Player instance = new Player();
        List expResult = null;
        List result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedProperties method, of class Player.
     */
    @Test
    public void testGetCompletedProperties() {
        System.out.println("getCompletedProperties");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getCompletedProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalMoney method, of class Player.
     */
    @Test
    public void testGetTotalMoney() {
        System.out.println("getTotalMoney");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getTotalMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardToPlay method, of class Player.
     */
    @Test
    public void testGetCardToPlay() {
        System.out.println("getCardToPlay");
        Player instance = new Player();
        Card expResult = null;
        Card result = instance.getCardToPlay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastCardPlayed method, of class Player.
     */
    @Test
    public void testSetLastCardPlayed() {
        System.out.println("setLastCardPlayed");
        Card c = null;
        Player instance = new Player();
        instance.setLastCardPlayed(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        Player instance = new Player();
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardToPlay method, of class Player.
     */
    @Test
    public void testSetCardToPlay() {
        System.out.println("setCardToPlay");
        Card c = null;
        Player instance = new Player();
        instance.setCardToPlay(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToHand method, of class Player.
     */
    @Test
    public void testAddToHand() {
        System.out.println("addToHand");
        Card card = null;
        Player instance = new Player();
        instance.addToHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMoney method, of class Player.
     */
    @Test
    public void testAddMoney() {
        System.out.println("addMoney");
        Card card = null;
        Player instance = new Player();
        instance.addMoney(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty() {
        System.out.println("addProperty");
        Card card = null;
        int propertySlotColumn = 0;
        Player instance = new Player();
        instance.addProperty(card, propertySlotColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHouse method, of class Player.
     */
    @Test
    public void testAddHouse() {
        System.out.println("addHouse");
        Card card = null;
        int propertySlotColumn = 0;
        Player instance = new Player();
        instance.addHouse(card, propertySlotColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHotel method, of class Player.
     */
    @Test
    public void testAddHotel() {
        System.out.println("addHotel");
        Card card = null;
        int propertySlotColumn = 0;
        Player instance = new Player();
        instance.addHotel(card, propertySlotColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompletedProperty method, of class Player.
     */
    @Test
    public void testAddCompletedProperty() {
        System.out.println("addCompletedProperty");
        Player instance = new Player();
        instance.addCompletedProperty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromHand method, of class Player.
     */
    @Test
    public void testRemoveCardFromHand() {
        System.out.println("removeCardFromHand");
        Card card = null;
        Player instance = new Player();
        instance.removeCardFromHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Card c = null;
        Player instance = new Player();
        instance.drawCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of discardCard method, of class Player.
     */
    @Test
    public void testDiscardCard() {
        System.out.println("discardCard");
        Card card = null;
        Deck discard = null;
        Player instance = new Player();
        instance.discardCard(card, discard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playCard method, of class Player.
     */
    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        Card card = null;
        Player instance = new Player();
        instance.playCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playPropertyCard method, of class Player.
     */
    @Test
    public void testPlayPropertyCard() {
        System.out.println("playPropertyCard");
        int[] propertySlot = null;
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.playPropertyCard(propertySlot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playHouseOrHotelCard method, of class Player.
     */
    @Test
    public void testPlayHouseOrHotelCard() {
        System.out.println("playHouseOrHotelCard");
        int[] propertySlot = null;
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.playHouseOrHotelCard(propertySlot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playMoneyCard method, of class Player.
     */
    @Test
    public void testPlayMoneyCard() {
        System.out.println("playMoneyCard");
        Player instance = new Player();
        instance.playMoneyCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of _checkCompletedProperties method, of class Player.
     */
    @Test
    public void test_checkCompletedProperties() {
        System.out.println("_checkCompletedProperties");
        PropertySlot propSlot = null;
        Player instance = new Player();
        instance._checkCompletedProperties(propSlot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHuman method, of class Player.
     */
    @Test
    public void testIsHuman() {
        System.out.println("isHuman");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.isHuman();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handIsEmpty method, of class Player.
     */
    @Test
    public void testHandIsEmpty() {
        System.out.println("handIsEmpty");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.handIsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printHand method, of class Player.
     */
    @Test
    public void testPrintHand() {
        System.out.println("printHand");
        Player instance = new Player();
        instance.printHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
