/*
 * This class will house the game logic needed to play the game.
 * 
 */
package Main;

import GUI.PlayScreen;

/**
 * Refactor code as much as possible when adding new additions to keep this class clean and easy to read!
 * @author brand, becccccccaaaaa
 */
public class Game {
    
    private static int numberOfPlayers; //used to keep track of how many players(bots) to play against
    private static String name; //name of your player. Inputted from PlayScreen.java
    private boolean inPreGameState; //will indicate when the game is in or out of the pregame state setup phase.
                                    //When true, things like, get player name, player count will occur. This eliminates these methods being called each pass through the game's main loop.
    
    public Game(){
        numberOfPlayers = 0;
        inPreGameState = true;
    }
    
    public void runGame(){
        
        //get game setup info, player name, player count.
        while(inPreGameState == true){
            //gets player count.
            checkNumberOfPlayers();
            //gets player name.
            checkPlayerName();
            
        }
        
        System.out.println("Entering main game loop"); //for testing
        //main game loop.
        while(true){
            
        }
    }
    
    
    
    /**
     * Will get the number of players to play against from PlayScreen.java
     */
    private void checkNumberOfPlayers(){
        if(PlayScreen.toGamePlayScreen == false){
                numberOfPlayers = PlayScreen.numberOfPlayers;
                System.out.println(); //for some reason, this println statement is needed here inorder for the loop this method is in to exit properly when it's suppose to........
        }
        else{ //pre game state is over, set to false.
            inPreGameState = false;
        }
        
    }
    
    /**
     * Will get the name the user inputted from PlayScreen.
     */
    private void checkPlayerName(){
        //will get player name from playscreen.
    }
    
    
}