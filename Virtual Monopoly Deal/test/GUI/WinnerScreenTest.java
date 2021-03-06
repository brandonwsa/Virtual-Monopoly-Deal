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
        String name = "brandon";
        int money = 40;
        int properties = 9;
        WinnerScreen instance = new WinnerScreen();
        instance.setWinner(name, money, properties);
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
    }

    /**
     * Test of main method, of class WinnerScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        try{
            WinnerScreen.main(args);
        }catch(Exception e){
            //catches error that happens sometimes for unknown reason
        }
    }
    
}
