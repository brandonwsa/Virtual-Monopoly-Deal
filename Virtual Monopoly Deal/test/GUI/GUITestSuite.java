/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author becca
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    GamePlayScreenTest.class,
    HowToPlayScreenTest.class,
    MainMenuTest.class,
    PlayScreenTest.class,
    WinnerScreenTest.class
})
 public class GUITestSuite {
    
}


