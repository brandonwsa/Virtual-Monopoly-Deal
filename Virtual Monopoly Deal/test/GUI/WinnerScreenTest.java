/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author becca
 */
public class WinnerScreenTest {
    
    public WinnerScreenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setWinner method, of class WinnerScreen.
     */
    @Test
    public void testSetWinner() {
        System.out.println("setWinner");
        String name = "";
        int money = 0;
        int properties = 0;
        WinnerScreen instance = new WinnerScreen();
        instance.setWinner(name, money, properties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayAgain method, of class WinnerScreen.
     */
    @Test
    public void testGetPlayAgain() {
        System.out.println("getPlayAgain");
        WinnerScreen instance = new WinnerScreen();
        boolean expResult = false;
        boolean result = instance.getPlayAgain();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class WinnerScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WinnerScreen.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
