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
        assertTrue(instance.hand.get(0)==null);
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
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getLastCardPlayed method, of class Player.
     */
    @Test
    public void testGetLastCardPlayed() {
        Card c = new Card(5);
        System.out.println("getLastCardPlayed");
        Player instance = new Player();
        instance.setLastCardPlayed(c);
        Card result = instance.getLastCardPlayed();
        assertEquals(c, result);
    }

    /**
     * Test of getMoney method, of class Player.
     */
    @Test
    public void testGetMoney() {
        Card c = new Card(4);
        System.out.println("getMoney");
        Player instance = new Player();
        instance.addMoney(c);
        List result = instance.getMoney();
        assertNotEquals(null, result);
    }

    /**
     * Test of getProperties method, of class Player.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        Player instance = new Player();
        Card c = new Card(0);
        instance.addProperty(c, 3);
        List result = instance.getProperties();
        assertNotEquals(null, result);
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
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player();
        String expResult = "becca";
        instance.setName("becca");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalMoney method, of class Player.
     */
    @Test
    public void testGetTotalMoney() {
        System.out.println("getTotalMoney");
        Card c = new Card(0);
        Player instance = new Player();
        instance.addMoney(c);
        int expResult = 10;
        int result = instance.getTotalMoney();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCardToPlay method, of class Player.
     */
    @Test
    public void testGetCardToPlay() {
        System.out.println("getCardToPlay");
         Card c = new Card(0);
        Player instance = new Player();
        instance.setCardToPlay(c);
        Card result = instance.getCardToPlay();
        assertNotEquals(null, result);
    }

    /**
     * Test of setLastCardPlayed method, of class Player.
     */
    @Test
    public void testSetLastCardPlayed() {
        System.out.println("setLastCardPlayed");
        Card c = new Card(0);
        Player instance = new Player();
        instance.setLastCardPlayed(c);
        assertEquals(instance.getLastCardPlayed(),c);
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "becca";
        Player instance = new Player();
        instance.setName(n);
        assertNotEquals(instance.getName(),null);
    }

    /**
     * Test of setCardToPlay method, of class Player.
     */
    @Test
    public void testSetCardToPlay() {
        System.out.println("setCardToPlay");
        Card c = new Card(1);
        Player instance = new Player();
        instance.setCardToPlay(c);
        assertNotEquals(instance.getCardToPlay(),null);
    }

    /**
     * Test of addToHand method, of class Player.
     */
    @Test
    public void testAddToHand() {
        System.out.println("addToHand");
        Card card = new Card(0);
        Player instance = new Player();
        instance.addToHand(card);
        assertNotEquals(instance.getHand().get(0),null);
    }

    /**
     * Test of addMoney method, of class Player.
     */
    @Test
    public void testAddMoney() {
        System.out.println("addMoney");
        Card card = new Card(0);
        Player instance = new Player();
        instance.addMoney(card);
        assertNotEquals(instance.getMoney(),null);
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty() {
        System.out.println("addProperty");
        Card card = new Card(70);
        int propertySlotColumn = 1;
        Player instance = new Player();
        instance.addProperty(card, propertySlotColumn);
    }

    /**
     * Test of addHouse method, of class Player.
     */
    @Test
    public void testAddHouse() {
        System.out.println("addHouse");
        Card card = new Card(50);
        int propertySlotColumn = 3;
        Player instance = new Player();
        instance.addHouse(card, propertySlotColumn);
        assertEquals(instance.LAST_EXCEPTION,null);
    }

    /**
     * Test of addHotel method, of class Player.
     */
    @Test
    public void testAddHotel() {
        System.out.println("addHotel");
        Card card = new Card(50);
        int propertySlotColumn = 3;
        Player instance = new Player();
        instance.addHotel(card, propertySlotColumn);
        assertEquals(instance.LAST_EXCEPTION,null);
    }

    /**
     * Test of addCompletedProperty method, of class Player.
     */
    @Test
    public void testAddCompletedProperty() {
        System.out.println("addCompletedProperty");
        Player instance = new Player();
        instance.addCompletedProperty();
        assertTrue(instance.getCompletedProperties()>0);
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
        assertEquals(instance.LAST_EXCEPTION,null);
    }

    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Card c = new Card(0);
        Player instance = new Player();
        instance.drawCard(c);
        assertEquals(instance.LAST_EXCEPTION,null);
       
    }

    /**
     * Test of discardCard method, of class Player.
     */
    @Test
    public void testDiscardCard() {
        System.out.println("discardCard");
        Card card = new Card(0);
        Deck discard = new Deck();
        Player instance = new Player();
        instance.discardCard(card, discard);
        assertEquals(discard.getTopCard(),card);
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
    }

    /**
     * Test of playPropertyCard method, of class Player.
     */
    @Test
    public void testPlayPropertyCard() {
        System.out.println("playPropertyCard");
        int[] propertySlot = new int[1];
        Card c = new Card(70);
        propertySlot[0]=1;
        Player instance = new Player();
        instance.setCardToPlay(c);
        boolean expResult = true;
        boolean result = instance.playPropertyCard(propertySlot);
        assertEquals(expResult, result);
    }

    /**
     * Test of playHouseOrHotelCard method, of class Player.
     */
    @Test
    public void testPlayHouseOrHotelCard() {
        System.out.println("playHouseOrHotelCard");
        Card c = new Card(70);
       int[] propertySlot = new int[1];
        propertySlot[0]=1;
        Player instance = new Player();
        instance.setCardToPlay(c);
        boolean expResult = false;
        boolean result = instance.playHouseOrHotelCard(propertySlot);
        assertEquals(expResult, result);
    }

    /**
     * Test of playMoneyCard method, of class Player.
     */
    @Test
    public void testPlayMoneyCard() {
        System.out.println("playMoneyCard");
        Player instance = new Player();
        Card c = new Card(0);
        instance.setCardToPlay(c);
        int money = instance.getTotalMoney();
        instance.playMoneyCard();
        assertTrue(money<instance.getTotalMoney());
    }

    /**
     * Test of _checkCompletedProperties method, of class Player.
     */
    @Test
    public void test_checkCompletedProperties() {
        System.out.println("_checkCompletedProperties");
        PropertySlot propSlot = new PropertySlot(1);
        Player instance = new Player();
        instance._checkCompletedProperties(propSlot);
        assertEquals(0,instance.getCompletedProperties());
    }

    /**
     * Test of isHuman method, of class Player.
     */
    @Test
    public void testIsHuman() {
        System.out.println("isHuman");
        Player instance = new Player();
        instance.setName("becca");
        boolean expResult = true;
        boolean result = instance.isHuman();
        assertEquals(expResult, result);
    }

    /**
     * Test of handIsEmpty method, of class Player.
     */
    @Test
    public void testHandIsEmpty() {
        System.out.println("handIsEmpty");
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.handIsEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of printHand method, of class Player.
     */
    @Test
    public void testPrintHand() {
        System.out.println("printHand");
        Player instance = new Player();
        instance.printHand();
       assertEquals(instance.LAST_EXCEPTION,null);
    }
    
}
