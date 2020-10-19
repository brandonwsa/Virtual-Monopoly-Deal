/*
 * This class will house the game logic needed to play the game.
 * 
 */
package Main;

import GUI.PlayScreen;
import Objects.Player;
import Objects.Bot;
import Objects.Deck;

/**
 * Refactor code as much as possible when adding new additions to keep this class clean and easy to read!
 * @author brand, becccccccaaaaa
 */
public class Game {
    
    private int numberOfPlayers; //used to keep track of how many players(bots) to play against
    private String name; //name of your player. Inputted from PlayScreen.java
    private boolean inPreGameState; //will indicate when the game is in or out of the pregame state setup phase.
                                    //When true, things like, get player name, player count will occur. This eliminates these methods being called each pass through the game's main loop.
    private Player player; //will always be initiliazed.
    private Bot bot_1; //default bot, will always be initialized.
    private Bot bot_2; //will only be declared, unless total number of players playing is 3, then will be initialized.
    private Deck gameDeck;
    private Deck discardDeck; //used to house the cards that are discarded.
    
    
    /**
     * Constructor.
     */
    public Game(){
        numberOfPlayers = 0;
        inPreGameState = true;
        discardDeck = new Deck();
    }
    
    /**
     * Runs the main game logic.
     */
    public void runGame(){
        
        //get game setup info, player name, player count.
        while(inPreGameState == true){
            checkNumberOfPlayers();//gets player count.
            checkPlayerName();//gets player name.   
        }

        //create deck Object
        createDeck();
        
        //make players and bot objects.
        createPlayersAndBots();
        
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
             //   System.out.println(); //for some reason, this println statement is needed here inorder for the loop this method is in to exit properly when it's suppose to........
        }
        else{ //pre game state is over, set to false.
            inPreGameState = false;
        }
        
    }
    
    /**
     * Will get the name the user inputted from PlayScreen.
     */
    private void checkPlayerName(){
        
        if(PlayScreen.toGamePlayScreen == false){
            name = PlayScreen.playerName;
        }
        else{ //pre game state is over, set to false.
            inPreGameState = false;
        }
    }
    
    /**
     * Will create the player and bot objects. Also sets the name of the player.
     * If numberOfPlayers wasn't set properly to be > 0, then print a message.
     * Also deals each player their 5 starting cards.
     */
    private void createPlayersAndBots(){
        //create player and bots.
        if (numberOfPlayers > 0){
            //make player and set player name.
            player = new Player();
            player.setName(name);
            
           //add 5 cards to player hand
            for(int i = 0; i < 5;i++){
                player.addToHand(gameDeck.getTopCard());
            }
            
            //make bot 1
            bot_1 = new Bot();
            
            //add 5 cards to Bot_1 hand
            for(int i = 0; i < 5;i++){
                bot_1.addToHand(gameDeck.getTopCard());
            }
            
            //if player selected to play with 3 total players, then make the 2nd bot.
            if (numberOfPlayers == 3){
                bot_2 = new Bot();
                
                //add 5 cards to Bot_2 hand
                for(int i = 0; i < 5;i++){
                    bot_2.addToHand(gameDeck.getTopCard());
                }
            }
        }
        else{ //if numberOfPlayers was some how not > 0 after player selected amount of players. Will happen if player hits "Go" while not selecting number of players from PlayScreen.java
            System.out.println("Error when making player and bots. NumberOfPlayers = "+numberOfPlayers);
        }
    }
    
    private void createDeck(){
        gameDeck = new Deck();
        gameDeck.fillDeck();
        gameDeck.shuffle();
    }
    
    
    
}
