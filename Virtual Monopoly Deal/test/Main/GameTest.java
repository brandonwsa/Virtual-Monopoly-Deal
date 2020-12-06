/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brand
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of runGame method, of class Game.
     */
    @Test
    public void testRunGame() {
        System.out.println("runGame");
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.runGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of resetGame method, of class Game.
     */
    @Test
    public void testResetGame() {
        System.out.println("resetGame");
        Game instance = new Game();
        boolean result = instance.resetGame();
        boolean expResult = true;
        assertEquals(result, expResult);
    }
    
}
