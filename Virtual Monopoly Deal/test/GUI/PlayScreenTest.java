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
public class PlayScreenTest {
    
    public PlayScreenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setGamePlayScreen method, of class PlayScreen.
     */
    @Test
    public void testSetGamePlayScreen() {
        System.out.println("setGamePlayScreen");
        GamePlayScreen gps = new GamePlayScreen();
        PlayScreen instance = new PlayScreen();
        instance.setGamePlayScreen(gps);
    }

    /**
     * Test of main method, of class PlayScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PlayScreen.main(args);
    }
    
}
