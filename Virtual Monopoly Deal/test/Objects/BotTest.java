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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDifficulty method, of class Bot.
     */
    @Test
    public void testGetDifficulty() {
        System.out.println("getDifficulty");
        Bot instance = new Bot();
        int expResult = 0;
        int result = instance.getDifficulty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickAPlay method, of class Bot.
     */
    @Test
    public void testPickAPlay() {
        System.out.println("pickAPlay");
        Bot instance = new Bot();
        int expResult = 0;
        int result = instance.pickAPlay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
