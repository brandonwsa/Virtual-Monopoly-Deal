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
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of fillDeck method, of class Deck.
     */
    @Test
    public void testFillDeck() {
        System.out.println("fillDeck");
        Deck instance = new Deck();
        instance.fillDeck();
        Exception expResult = null;
        Exception result = Deck.LAST_EXCEPTION;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addCard method, of class Deck.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card(0);
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.addCard(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTopCard method, of class Deck.
     */
    @Test
    public void testGetTopCard() {
        System.out.println("getTopCard");
        Deck instance = new Deck();
        instance.fillDeck();
        Card c = new Card(107);
        String expResult = c.getName();
        String result = instance.getTopCard().getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.shuffle();
        assertEquals(expResult, result);
    }

    /**
     * Test of printCards method, of class Deck.
     */
    @Test
    public void testPrintCards() {
        System.out.println("printCards");
        Deck instance = new Deck();
        instance.printCards();
        Exception expResult = null;
        Exception result = Deck.LAST_EXCEPTION;
        assertEquals(expResult, result);
    }
    
}
