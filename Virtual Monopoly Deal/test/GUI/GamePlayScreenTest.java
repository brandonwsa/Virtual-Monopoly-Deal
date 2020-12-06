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
import Objects.*;
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
        ArrayList testList = new ArrayList();
        Card a = new Card(1);
        Card b = new Card(2);
        Card c = new Card(7);
        Card d = new Card(88);
        Card e = new Card(45);
        
        testList.add(a.getImagePath());
        testList.add(b.getImagePath());
        testList.add(c.getImagePath());
        testList.add(d.getImagePath());
        testList.add(e.getImagePath());
        System.out.println("setPlayerStartingHand");
        GamePlayScreen instance = new GamePlayScreen();
        instance.setPlayerStartingHand(testList);
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
    }

    /**
     * Test of setYourTotalMoney method, of class GamePlayScreen.
     */
    @Test
    public void testSetYourTotalMoney() {
        System.out.println("setYourTotalMoney");
        int value = 5;
        String name = "becca";
        GamePlayScreen instance = new GamePlayScreen();
        instance.setYourTotalMoney(value, name);
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
        int[] h = instance.getYourPropertySlotPressed();
        assertEquals(h[0], row);
        assertEquals(h[1], column);
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
        assertEquals(value,instance.getYourMoneySlotButtonAction());
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
        assertEquals(value,instance.getYourDiscardDeckPressed());
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
        assertEquals(value,instance.getYourCardDeckPressed());
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
         assertEquals(value,instance.getEndTurnEarlyPressed());
    }

    /**
     * Test of setNumberOfPlayers method, of class GamePlayScreen.
     */
    @Test
    public void testSetNumberOfPlayers() {
        System.out.println("setNumberOfPlayers");
        int numPlayers = 2;
        GamePlayScreen instance = new GamePlayScreen();
        instance.setNumberOfPlayers(numPlayers);
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
    }

    /**
     * Test of checkHandSlotButtonPressed method, of class GamePlayScreen.
     */
    @Test
    public void testCheckHandSlotButtonPressed() {
        System.out.println("checkHandSlotButtonPressed");
        GamePlayScreen instance = new GamePlayScreen();
        instance.selectHandSlotViaAPI(5);
        int expResult = 6;
        int result = instance.checkHandSlotButtonPressed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYourPropertySlotPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourPropertySlotPressed() {
        System.out.println("getYourPropertySlotPressed");
        GamePlayScreen instance = new GamePlayScreen();
        instance.selectPropertySlotViaAPI(1,1);
        int[] expResult = {1,1};
        int[] result = instance.getYourPropertySlotPressed();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getYourDiscardDeckPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourDiscardDeckPressed() {
        System.out.println("getYourDiscardDeckPressed");
        GamePlayScreen instance = new GamePlayScreen();
        instance.selectDiscardDeckViaAPI();
        boolean expResult = true;
        boolean result = instance.getYourDiscardDeckPressed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYourCardDeckPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourCardDeckPressed() {
        System.out.println("getYourCardDeckPressed");
        GamePlayScreen instance = new GamePlayScreen();
        instance.selectCardDeckViaAPI();
        boolean expResult = true;
        boolean result = instance.getYourCardDeckPressed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEndTurnEarlyPressed method, of class GamePlayScreen.
     */
    @Test
    public void testGetEndTurnEarlyPressed() {
        System.out.println("getEndTurnEarlyPressed");
        GamePlayScreen instance = new GamePlayScreen();
        instance.selectEndTurnEarlyViaAPI();
        boolean expResult = true;
        boolean result = instance.getEndTurnEarlyPressed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHandSlotCardImage method, of class GamePlayScreen.
     */
    @Test
    public void testGetHandSlotCardImage() {
        System.out.println("getHandSlotCardImage");
        Card c = new Card(22);
        String expected = "file:/C:/Users/becca/Documents/NetBeansProjects/Virtual-Monopoly-Deal/Virtual%20Monopoly%20Deal/build/classes/images/MonopolyCards/all-color-wild-rent-card2%20(Custom).png";
        String imagePath = c.getImagePath();
        int handSlot = 1;
        GamePlayScreen instance = new GamePlayScreen();
        instance.addCardImageToHand(imagePath);
        String result = instance.getHandSlotCardImage(handSlot);
        assertEquals(result,expected);
    }

    /**
     * Test of getYourMoneySlotButtonAction method, of class GamePlayScreen.
     */
    @Test
    public void testGetYourMoneySlotButtonAction() {
        System.out.println("getYourMoneySlotButtonAction");
        GamePlayScreen instance = new GamePlayScreen();
        instance.selectMoneySlotButtonViaAPI();
        boolean expResult = true;
        boolean result = instance.getYourMoneySlotButtonAction();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayerName method, of class GamePlayScreen.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        GamePlayScreen instance = new GamePlayScreen();
        String expResult = "Sara";
        instance.setPlayerName("Sara");
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfPlayers method, of class GamePlayScreen.
     */
    @Test
    public void testGetNumberOfPlayers() {
        System.out.println("getNumberOfPlayers");
        GamePlayScreen instance = new GamePlayScreen();
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            //caught exception. no need to print message
        }
        instance.setNumberOfPlayers(3);
        int result = instance.getNumberOfPlayers();
        assertNotEquals(0,result);
    }

    /**
     * Test of getDifficultyLevel method, of class GamePlayScreen.
     */
    @Test
    public void testGetDifficultyLevel() {
        System.out.println("getDifficultyLevel");
        GamePlayScreen instance = new GamePlayScreen();
        int expResult = 1;
        instance.setDifficultyLevel(1);
        int result = instance.getDifficultyLevel();
        assertEquals(expResult, result);
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
    }

    /**
     * Test of getMakeMeWinner method, of class GamePlayScreen.
     */
    @Test
    public void testGetMakeMeWinner() {
       //not implemented in final game
    }

    /**
     * Test of displayPlayedPropertyCard method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayPlayedPropertyCard() {
        System.out.println("displayPlayedPropertyCard");
        Card c = new Card(9);
        String imagePath = c.getImagePath();
        GamePlayScreen instance = new GamePlayScreen();
        instance.setLastPropertyPressedViaAPI();
        instance.displayPlayedPropertyCard(imagePath);
    }

    /**
     * Test of displayBotPlayedPropertyCard method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayBotPlayedPropertyCard() {
        System.out.println("displayBotPlayedPropertyCard");
        Card c = new Card(5);
        String imagePath = c.getImagePath();
        int[] property = {5,5};
        String name = "bot_1";
        GamePlayScreen instance = new GamePlayScreen();
        instance.yourMoneySlotPressedPressedViaAPI(true);
        instance.displayBotPlayedPropertyCard(imagePath, property, name);
    }

    /**
     * Test of displayPlayedMoneyCard method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayPlayedMoneyCard() {
        System.out.println("displayPlayedMoneyCard");
        Card c = new Card(5);
        String imagePath = c.getImagePath();
        String name = "becca";
        GamePlayScreen instance = new GamePlayScreen();
        instance.displayPlayedMoneyCard(imagePath, name);
    }

    /**
     * Test of displayWinnerScreen method, of class GamePlayScreen.
     */
    @Test
    public void testDisplayWinnerScreen() {
        System.out.println("displayWinnerScreen");
       String name = "becca";
        int money = 50;
        int properties = 9;
        GamePlayScreen instance = new GamePlayScreen();
        instance.displayWinnerScreen(name, money, properties);
    }

    /**
     * Test of removeCardImageFromHand method, of class GamePlayScreen.
     */
    @Test
    public void testRemoveCardImageFromHand() {
        System.out.println("removeCardImageFromHand");
        Card c = new Card(5);
        int handSlotNum = 0;
        GamePlayScreen instance = new GamePlayScreen();
        instance.addCardImageToHand(c.getImagePath());
        instance.removeCardImageFromHand(handSlotNum);
    }

    /**
     * Test of addCardImageToHand method, of class GamePlayScreen.
     */
    @Test
    public void testAddCardImageToHand() {
        System.out.println("addCardImageToHand");
        Card c = new Card(9);
        String imagePath = c.getImagePath();
        GamePlayScreen instance = new GamePlayScreen();
        instance.addCardImageToHand(imagePath);
    }

    /**
     * Test of addCardImageToDiscardDeck method, of class GamePlayScreen.
     */
    @Test
    public void testAddCardImageToDiscardDeck() {
        System.out.println("addCardImageToDiscardDeck");
        Card c = new Card(11);
        String img = c.getImagePath();
        GamePlayScreen instance = new GamePlayScreen();
        instance.addCardImageToDiscardDeck(img);
    }

    /**
     * Test of hideHandMenu method, of class GamePlayScreen.
     */
    @Test
    public void testHideHandMenu() {
        System.out.println("hideHandMenu");
        GamePlayScreen instance = new GamePlayScreen();
        instance.hideHandMenu();
    }

    /**
     * Test of hideThirdPlayer method, of class GamePlayScreen.
     */
    @Test
    public void testHideThirdPlayer() {
        System.out.println("hideThirdPlayer");
        GamePlayScreen instance = new GamePlayScreen();
        instance.hideThirdPlayer();
    }

    /**
     * Test of main method, of class GamePlayScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GamePlayScreen.main(args);
    }
    
}
