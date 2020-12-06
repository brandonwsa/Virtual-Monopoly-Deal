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
 * @author brand
 */
public class HowToPlayScreenTest {
    
    public HowToPlayScreenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class HowToPlayScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HowToPlayScreen.main(args);
        Exception result = HowToPlayScreen.LAST_EXCEPTION;
        Exception expResult = null;
        assertEquals(result, expResult);
    }
    
}
