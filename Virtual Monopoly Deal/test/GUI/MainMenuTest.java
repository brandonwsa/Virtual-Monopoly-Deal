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
public class MainMenuTest {
    
    public MainMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setGamePlayScreen method, of class MainMenu.
     */
    @Test
    public void testSetGamePlayScreen() {
        System.out.println("setGamePlayScreen");
        GamePlayScreen gps = new GamePlayScreen();
        MainMenu instance = new MainMenu();
        instance.setGamePlayScreen(gps);
        Exception expResult = null;
        Exception result = MainMenu.LAST_EXCEPTION;
        assertEquals(result, expResult);
    }

    /**
     * Test of main method, of class MainMenu.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainMenu.main(args);
        Exception result = MainMenu.LAST_EXCEPTION;
        Exception expResult = null;
        assertEquals(result, expResult);
    }
    
}
