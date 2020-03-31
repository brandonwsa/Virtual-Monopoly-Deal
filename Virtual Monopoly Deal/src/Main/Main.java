/*
 * Main class for VMD
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
    }
}
