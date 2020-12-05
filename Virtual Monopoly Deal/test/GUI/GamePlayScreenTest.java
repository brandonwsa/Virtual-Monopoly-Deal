/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author becca
 */
public class GamePlayScreenTest {
    
    public GamePlayScreenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setPlayerStartingHand method, of class GamePlayScreen.
     */
    @Test
    public void testSetPlayerStartingHand() {
        System.out.println("setPlayerStartingHand");
        ArrayList cardImagePaths = null;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setPlayerStartingHand(cardImagePaths);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerName method, of class GamePlayScreen.
     */
    @Test
    public void testSetPlayerName() {
        System.out.println("setPlayerName");
        String name = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.setPlayerName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYourTotalMoney method, of class GamePlayScreen.
     */
    @Test
    public void testSetYourTotalMoney() {
        System.out.println("setYourTotalMoney");
        int value = 0;
        String name = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.setYourTotalMoney(value, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYourPropertySlotPressed method, of class GamePlayScreen.
     */
    @Test
    public void testSetYourPropertySlotPressed() {
        System.out.println("setYourPropertySlotPressed");
        int row = 0;
        int column = 0;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setYourPropertySlotPressed(row, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYourMoneySlotButtonAction method, of class GamePlayScreen.
     */
    @Test
    public void testSetYourMoneySlotButtonAction() {
        System.out.println("setYourMoneySlotButtonAction");
        boolean value = false;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setYourMoneySlotButtonAction(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYourDiscardDeckPressed method, of class GamePlayScreen.
     */
    @Test
    public void testSetYourDiscardDeckPressed() {
        System.out.println("setYourDiscardDeckPressed");
        boolean value = false;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setYourDiscardDeckPressed(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYourCardDeckPressed method, of class GamePlayScreen.
     */
    @Test
    public void testSetYourCardDeckPressed() {
        System.out.println("setYourCardDeckPressed");
        boolean value = false;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setYourCardDeckPressed(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndTurnEarlyPressed method, of class GamePlayScreen.
     */
    @Test
    public void testSetEndTurnEarlyPressed() {
        System.out.println("setEndTurnEarlyPressed");
        boolean value = false;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setEndTurnEarlyPressed(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfPlayers method, of class GamePlayScreen.
     */
    @Test
    public void testSetNumberOfPlayers() {
        System.out.println("setNumberOfPlayers");
        int numPlayers = 0;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setNumberOfPlayers(numPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDifficultyLevel method, of class GamePlayScreen.
     */
    @Test
    public void testSetDifficultyLevel() {
        System.out.println("setDifficultyLevel");
        int level = 0;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setDifficultyLevel(level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHandSlotButtonPressed method, of class GamePlayScreen.
     */
    @Test
    public void testCheckHandSlotButtonPressed() {
        System.out.println("checkHandSlotButtonPressed");
        GamePlayScreen instance = new GamePlayScreen();
        int expResult = 0;
        int result = instance.checkHandSlotButtonPressed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYourPropertySlotPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourPropertySlotPressed() {
        System.out.println("getYourPropertySlotPressed");
        GamePlayScreen instance = new GamePlayScreen();
        int[] expResult = null;
        int[] result = instance.getYourPropertySlotPressed();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYourDiscardDeckPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourDiscardDeckPressed() {
        System.out.println("getYourDiscardDeckPressed");
        GamePlayScreen instance = new GamePlayScreen();
        boolean expResult = false;
        boolean result = instance.getYourDiscardDeckPressed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYourCardDeckPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourCardDeckPressed() {
        System.out.println("getYourCardDeckPressed");
        GamePlayScreen instance = new GamePlayScreen();
        boolean expResult = false;
        boolean result = instance.getYourCardDeckPressed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTurnEarlyPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetEndTurnEarlyPressed() {
        System.out.println("getEndTurnEarlyPressed");
        GamePlayScreen instance = new GamePlayScreen();
        boolean expResult = false;
        boolean result = instance.getEndTurnEarlyPressed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandSlotCardImage method, of class GamePlayScreen.
     */
    @Test
    public void testGetHandSlotCardImage() {
        System.out.println("getHandSlotCardImage");
        int handSlot = 0;
        GamePlayScreen instance = new GamePlayScreen();
        String expResult = "";
        String result = instance.getHandSlotCardImage(handSlot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYourMoneySlotButtonAction method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourMoneySlotButtonAction() {
        System.out.println("getYourMoneySlotButtonAction");
        GamePlayScreen instance = new GamePlayScreen();
        boolean expResult = false;
        boolean result = instance.getYourMoneySlotButtonAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerName method, of class GamePlayScreen.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        GamePlayScreen instance = new GamePlayScreen();
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfPlayers method, of class GamePlayScreen.
     */
    @Test
    public void testGetNumberOfPlayers() {
        System.out.println("getNumberOfPlayers");
        GamePlayScreen instance = new GamePlayScreen();
        int expResult = 0;
        int result = instance.getNumberOfPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDifficultyLevel method, of class GamePlayScreen.
     */
    @Test
    public void testGetDifficultyLevel() {
        System.out.println("getDifficultyLevel");
        GamePlayScreen instance = new GamePlayScreen();
        int expResult = 0;
        int result = instance.getDifficultyLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayAgain method, of class GamePlayScreen.
     */
    @Test
    public void testGetPlayAgain() {
        System.out.println("getPlayAgain");
        GamePlayScreen instance = new GamePlayScreen();
        boolean expResult = false;
        boolean result = instance.getPlayAgain();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMakeMeWinner method, of class GamePlayScreen.
     */
    @Test
    public void testGetMakeMeWinner() {
        System.out.println("getMakeMeWinner");
        GamePlayScreen instance = new GamePlayScreen();
        boolean expResult = false;
        boolean result = instance.getMakeMeWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPlayedPropertyCard method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayPlayedPropertyCard() {
        System.out.println("displayPlayedPropertyCard");
        String imagePath = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.displayPlayedPropertyCard(imagePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayBotPlayedPropertyCard method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayBotPlayedPropertyCard() {
        System.out.println("displayBotPlayedPropertyCard");
        String imagePath = "";
        int[] property = null;
        String name = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.displayBotPlayedPropertyCard(imagePath, property, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPlayedMoneyCard method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayPlayedMoneyCard() {
        System.out.println("displayPlayedMoneyCard");
        String imagePath = "";
        String name = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.displayPlayedMoneyCard(imagePath, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWinnerScreen method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayWinnerScreen() {
        System.out.println("displayWinnerScreen");
        String name = "";
        int money = 0;
        int properties = 0;
        GamePlayScreen instance = new GamePlayScreen();
        instance.displayWinnerScreen(name, money, properties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardImageFromHand method, of class GamePlayScreen.
     */
    @Test
    public void testRemoveCardImageFromHand() {
        System.out.println("removeCardImageFromHand");
        int handSlotNum = 0;
        GamePlayScreen instance = new GamePlayScreen();
        instance.removeCardImageFromHand(handSlotNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardImageToHand method, of class GamePlayScreen.
     */
    @Test
    public void testAddCardImageToHand() {
        System.out.println("addCardImageToHand");
        String imagePath = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.addCardImageToHand(imagePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardImageToDiscardDeck method, of class GamePlayScreen.
     */
    @Test
    public void testAddCardImageToDiscardDeck() {
        System.out.println("addCardImageToDiscardDeck");
        String img = "";
        GamePlayScreen instance = new GamePlayScreen();
        instance.addCardImageToDiscardDeck(img);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hideHandMenu method, of class GamePlayScreen.
     */
    @Test
    public void testHideHandMenu() {
        System.out.println("hideHandMenu");
        GamePlayScreen instance = new GamePlayScreen();
        instance.hideHandMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hideThirdPlayer method, of class GamePlayScreen.
     */
    @Test
    public void testHideThirdPlayer() {
        System.out.println("hideThirdPlayer");
        GamePlayScreen instance = new GamePlayScreen();
        instance.hideThirdPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class GamePlayScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GamePlayScreen.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
