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
 * @author becca
 */
public class BotTest {
    
    public BotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setDifficulty method, of class Bot.
     */
    @Test
    public void testSetDifficulty() {
        System.out.println("setDifficulty");
        int diffLevel = 0;
        Bot instance = new Bot();
        instance.setDifficulty(diffLevel);
        assertEquals(instance.getDifficulty(),0);
    }

    /**
     * Test of getDifficulty method, of class Bot.
     */
    @Test
    public void testGetDifficulty() {
        System.out.println("getDifficulty");
        Bot instance = new Bot();
        int expResult = 0;
        instance.setDifficulty(expResult);
        int result = instance.getDifficulty();
        assertEquals(expResult, result);
    }

    /**
     * Test of pickAPlay method, of class Bot.
     */
    @Test
    public void testPickAPlay() {
        System.out.println("pickAPlay");
        Bot instance = new Bot();
        int result = instance.pickAPlay();
        assertTrue(result<7);
    }

    /**
     * Test of pickACard method, of class Bot.
     */
    @Test
    public void testPickACard() {
        System.out.println("pickACard");
        Bot instance = new Bot();
        Card expResult = null;
        Card result = instance.pickACard();
        assertNull(result);
    }

    /**
     * Test of pickPropertySlot method, of class Bot.
     */
    @Test
    public void testPickPropertySlot() {
        System.out.println("pickPropertySlot");
        Card c = null;
        Bot instance = new Bot();
        int[] expResult = null;
        int[] result = instance.pickPropertySlot(c);
        assertNotSame(expResult, result);
    }
    
}
