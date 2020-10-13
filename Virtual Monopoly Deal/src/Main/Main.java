/*
 * Main class for VMD. Starts up the GUI from MainMenu, makes and starts the Game.
 */
package Main;

import GUI.MainMenu;

/**
 *
 * @author brand
 */
public class Main {
    
    private static final MainMenu MM = new MainMenu(); //made as private for now, may need to change to protected or no modifier in future.
    
    
    public static void main(String[] args){
        MM.setVisible(true);
        
        //make and starts game
        Game VirtualMonopolyDeal = new Game();
        VirtualMonopolyDeal.runGame();
        
        
        
    }
}
