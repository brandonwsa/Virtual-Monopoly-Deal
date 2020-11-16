/*
 * Main class for VMD. Starts up the GUI from MainMenu, makes and starts the Game.
 */
package Main;

import GUI.MainMenu;
import GUI.GamePlayScreen;

/**
 *
 * @author brand
 */
public class Main {
    public static GamePlayScreen GPS = new GamePlayScreen();
    
    public static void main(String[] args){
        
        MainMenu MM = new MainMenu(); //made as private for now, may need to change to protected or no modifier in future.
        MM.setVisible(true);
        
        //make and starts game
        Game VirtualMonopolyDeal = new Game(GPS);
        VirtualMonopolyDeal.runGame();
        
        
        
    }
    
    public static void reset(){
        GPS = new GamePlayScreen();
        main(null);
    }
}
