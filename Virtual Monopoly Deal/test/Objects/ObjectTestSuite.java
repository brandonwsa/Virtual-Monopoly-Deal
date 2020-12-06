/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author becca
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    BotTest.class,
    CardTest.class,
    DeckTest.class,
    PlayerTest.class,
    PropertySlotTest.class
})
public class ObjectTestSuite {
    
}
